package com.example.pollinationid

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.File

class PhotoActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    private val pickImage = 100
    private var imageUri: Uri? = null

    companion object {
        private const val LIBRARY_PERMISSION_CODE = 1001
        private const val CAMERA_PERMISSION_CODE = 1
        private const val CAMERA_REQUEST_CODE = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_photo)
        imageView = findViewById(R.id.imageView)
        val temp = intent.getIntExtra("MODE", 3)

        when (temp) { //when the intent from the other activity is one of these number then run a certain function
            1 -> {//if camera was clicked on previous fragment
                Log.v("PhotoActivity: ", "Camera was passed")

                if (ContextCompat.checkSelfPermission(
                        this,
                        Manifest.permission.CAMERA
                    ) == PackageManager.PERMISSION_GRANTED
                ) {
                    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    startActivityForResult(intent, CAMERA_REQUEST_CODE)
                } else {
                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CAMERA),
                        CAMERA_PERMISSION_CODE
                    )
                }
            }
            0 -> {//if libary was pressed on previous fragment
                Log.v("PhotoActivity: ", "Library was passed")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                        val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                        requestPermissions(permissions, LIBRARY_PERMISSION_CODE)
                    } else {
                        chooseImageGallery()

                    }
                } else {
                    chooseImageGallery()
                }
            }
            else -> {//error handling
                Log.v("PhotoActivity: ", "Unexpected input")
            }
        }
    }


    private fun chooseImageGallery() {
        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        startActivityForResult(gallery, pickImage)
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(
            requestCode,
            permissions,
            grantResults
        )//this line is different
        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intent, CAMERA_REQUEST_CODE)
            } else {
                Toast.makeText(
                    this,
                    "Could not open camera. Please provide camera permission in settings.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        when (requestCode) {
            LIBRARY_PERMISSION_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    chooseImageGallery()
                } else {
                    Toast.makeText(
                        this,
                        "Could not open gallery. Please provide gallery permission in settings",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }

    private fun getPhotoFile(fileName: String): File {
        val directoryStorage = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(fileName, ".jpg", directoryStorage)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == CAMERA_REQUEST_CODE) {//if taking picture
            val thumbNail: Bitmap = data!!.extras!!.get("data") as Bitmap
            imageView.setImageBitmap(thumbNail)
        } else if (resultCode == RESULT_OK && requestCode == pickImage) {//if choosing image
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        } else {//error handling
            Log.e("OnActResult", "Unexpected input in if/else")
        }
    }
}

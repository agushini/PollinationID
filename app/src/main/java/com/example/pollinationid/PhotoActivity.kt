package com.example.pollinationid

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_photo.*
import java.io.File

class PhotoActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_photo)

         var temp = intent.getIntExtra("MODE",3)

         when (temp) { //when the intent from the other activity is one of these number then run a certain function
             1 -> {//if camera was clicked on previous fragment
                 Log.v("PhotoActivity: ","Camera was passed")

                 val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                 filePhoto = getPhotoFile(FILE_NAME)


                 val providerFile = FileProvider.getUriForFile(this,"com.example.pollinationid", filePhoto)
                 takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, providerFile)
                 if (takePhotoIntent.resolveActivity(this.packageManager) != null){
                     startActivityForResult(takePhotoIntent, REQUEST_CODE)
                 }else {
                     Toast.makeText(this,"Camera could not open", Toast.LENGTH_SHORT).show()
                 }
             }
             0 -> {//if libary was pressed on previous fragment
                 Log.v("PhotoActivity: ","Library was passed")
                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                     if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                         val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                         requestPermissions(permissions, PERMISSION_CODE)
                     } else{
                         chooseImageGallery();

                     }
                 }else{
                     chooseImageGallery();

                 }

             }
             else -> {//error handling
                 Log.v("PhotoActivity: ","Unexpected input")
             }
         }
 }


    private fun chooseImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_CHOOSE)
    }

    companion object {
        private val IMAGE_CHOOSE = 1000;
        private val PERMISSION_CODE = 1001;
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            PERMISSION_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    chooseImageGallery()
                }else{
                    Toast.makeText(this,"Permission denied", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun getPhotoFile(fileName: String): File {
        val directoryStorage = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(fileName, ".jpg", directoryStorage)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){
            val takenPhoto = BitmapFactory.decodeFile(filePhoto.absolutePath)
            viewImage.setImageBitmap(takenPhoto)
        }
        else {
            super.onActivityResult(requestCode, resultCode, data)
        }
        if(requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK){
            viewImage.setImageURI(data?.data)
        }

    }

}
private const val REQUEST_CODE = 13
private lateinit var filePhoto: File
private const val FILE_NAME = "photo.jpg"
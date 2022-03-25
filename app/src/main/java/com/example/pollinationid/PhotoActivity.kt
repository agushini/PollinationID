package com.example.pollinationid

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_photo.*
import java.io.File

class PhotoActivity : AppCompatActivity() {

    companion object {
//        private val IMAGE_CHOOSE = 1000;
//        private val PERMISSION_CODE = 1001;
        private const val CAMERA_PERMISSION_CODE = 1
        private const val CAMERA_REQUEST_CODE = 2
    }


     override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_photo)

         val temp = intent.getIntExtra("MODE",3)

         when (temp) { //when the intent from the other activity is one of these number then run a certain function
             1 -> {//if camera was clicked on previous fragment
                 Log.v("PhotoActivity: ","Camera was passed")

//                 val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//                 filePhoto = getPhotoFile(FILE_NAME)
//
//
//                 val providerFile = FileProvider.getUriForFile(this,"com.example.pollinationid", filePhoto)
//                 takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, providerFile)
//                 if (takePhotoIntent.resolveActivity(this.packageManager) != null){
//                     startActivityForResult(takePhotoIntent, REQUEST_CODE)
//                 }else {
//                     Toast.makeText(this,"Camera could not open", Toast.LENGTH_SHORT).show()
//                 }

                if (ContextCompat.checkSelfPermission(
                        this,
                        Manifest.permission.CAMERA
                    ) == PackageManager.PERMISSION_GRANTED
                ){
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
                 Log.v("PhotoActivity: ","Library was passed")
//                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//                     if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
//                         val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
//                         requestPermissions(permissions, PERMISSION_CODE)
//                     } else{
//                         chooseImageGallery();
//
//                     }
//                 }else{
//                     chooseImageGallery();
//
//                 }

             }
             else -> {//error handling
                 Log.v("PhotoActivity: ","Unexpected input")
             }
         }
 }


//    private fun chooseImageGallery() {
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type = "image/*"
//        startActivityForResult(intent, IMAGE_CHOOSE)
//    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)//this line is different
        if(requestCode == CAMERA_PERMISSION_CODE){
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(intent, CAMERA_REQUEST_CODE)
            }else{
                Toast.makeText(this,"Please provide camera permission in settings.", Toast.LENGTH_LONG).show()
            }
        }
    }

//    private fun getPhotoFile(fileName: String): File {
//        val directoryStorage = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//        return File.createTempFile(fileName, ".jpg", directoryStorage)
//    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            Log.v("Expecting True 1: ", (resultCode == Activity.RESULT_OK).toString())
            Log.v("Result code,expecting 2", resultCode.toString())
            //if(resultCode == CAMERA_REQUEST_CODE){ commenting this out because with this line the image doesnt process
                Log.v("Expecting True 2: ", (resultCode == CAMERA_REQUEST_CODE).toString())
                val thumbNail: Bitmap = data!!.extras!!.get("data") as Bitmap
                viewImage.setImageBitmap(thumbNail)
            //}
//            val takenPhoto = BitmapFactory.decodeFile(filePhoto.absolutePath)
//            viewImage.setImageBitmap(takenPhoto)
        }
    }

}
//private const val REQUEST_CODE = 13
//private lateinit var filePhoto: File
//private const val FILE_NAME = "photo.jpg"
package com.example.pollinationid

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pollinationid.ml.PollinatorModel
import kotlinx.android.synthetic.main.photo_pollinators_possible.*
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer

class PhotoPossiblePollinators : AppCompatActivity() {

    private lateinit var aiTextView: TextView

    //lateinit var aiPhoto: ImageView
    lateinit var bitmap: Bitmap
    lateinit var aiPhoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("PossiblePollinator", "Inside")
        setContentView(R.layout.photo_pollinators_possible)
        aiTextView = findViewById(R.id.aiResults)
        //aiPhoto = findViewById(R.id.inputPhotoView)

        val text = intent.getStringExtra("Result")
        aiTextView.setText(text)


//        Log.i("Possible Pollinators", "Inside")
//        var resize: Bitmap = Bitmap.createScaledBitmap(bitmap, 224, 224, true)
//        val model = PollinatorModel.newInstance(this)
//        var theBuffer = TensorImage.fromBitmap(resize)
//        var byteBuffer = theBuffer.buffer
//
//        Log.i("Possible Pollinators", "Above Input")
//        // Creates inputs for reference.
//        val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.UINT8)
//        inputFeature0.loadBuffer(byteBuffer)
//
//        Log.i("Possible Pollinators", "Above Run")
//        // Runs model inference and gets result.
//        val outputs = model.process(inputFeature0)
//        val outputFeature0 = outputs.probabilityAsTensorBuffer
//        var max = getMax(outputFeature0.floatArray)
//        aiTextView.setText(max)
//        Log.i("Possible Pollinators", "Max 1: $max")
//
//        // Releases model resources if no longer used.
//        model.close()
//
//    }
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        aiPhoto.setImageURI(data?.data)
//
//        var uri: Uri? = data?.data
//        bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
//    }
//
//    private fun getMax(arr:FloatArray) : Int{
//        var index = 0
//        var min = 0.0f
//
//        for(i in 0..1000){
//            if(arr[i]>min){
//                index = i
//                min = arr[i]
//            }
//        }
//        return index
//
//    }
    }

}
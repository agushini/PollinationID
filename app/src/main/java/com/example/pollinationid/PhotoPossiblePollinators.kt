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

    lateinit var aiTextView: TextView

    lateinit var aiPhoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("PossiblePollinator", "Inside")
        setContentView(R.layout.photo_pollinators_possible)
        aiTextView = findViewById(R.id.aiResults)
        Log.i("POSSIBLE POLLINATORS", "Before Intent")

        val text = intent.getStringExtra("Results")

        Log.i("POSSIBLE POLLINATORS", "Result $text")

    }

}
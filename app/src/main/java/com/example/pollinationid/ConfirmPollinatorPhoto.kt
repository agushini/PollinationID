package com.example.pollinationid

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pollinator_confirm_photo.*

class ConfirmPollinatorPhoto : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pollinator_confirm_photo)

        val selectedPollinatorInfoTextView: TextView = findViewById(R.id.selectedPollinatorInfo)
        val selectedPollinatorPhotoIDImageView: ImageView = findViewById(R.id.selectedPollinatorPhotoID)

        val photoPollinator = intent.getIntExtra("PhotoSelectedPollinator",R.drawable.ic_black_camera_foreground)
        val userPredict = intent.getStringExtra("userPredict")
        val techName = intent.getStringExtra("techName")

        val sharedPref = getSharedPreferences( "photoPref",MODE_PRIVATE)
        val modelPredict = sharedPref.getString("modelPredict","ERR:NOTSENT")
        val hotelId = sharedPref.getString("hotelID","ERR:NOTSENT")
        val dateLog = sharedPref.getString("dateLog","ERROR:NOTSENT")

        selectedPollinatorPhotoIDImageView.setImageResource(photoPollinator)

        selectedPollinatorInfoTextView.text =
            "User Prediction: $userPredict\n" +
            "Model Prediction: $modelPredict\n" +
            "Date and Time: $dateLog\n" +
            "Sighted At: $hotelId"

        submitPollinatorPhotoButton.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            Log.i("CONFIRMPOLLINATORPHOTO","Submit Pollinator btn clicked")

            //TODO: Add the backend stuff to add a document to the collection


            dialogBuilder.setMessage("Thank you for your submission")
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Done!", DialogInterface.OnClickListener {
                    dialog, id ->
                    val mainActIntent = Intent(this,MainActivity::class.java)
                    startActivity(mainActIntent)
                    finish()
            })

            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("Pollinator Sent!")
            // show alert dialog
            alert.show()
        }
    }
}
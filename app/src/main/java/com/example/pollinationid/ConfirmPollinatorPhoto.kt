package com.example.pollinationid

import android.annotation.SuppressLint
import android.content.*
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.pollinator_confirm_photo.*
import java.time.LocalDateTime

class ConfirmPollinatorPhoto : AppCompatActivity() {

    //database variables
    private var auth: FirebaseAuth = Firebase.auth
    private val db = Firebase.firestore
    private val uid = auth.currentUser!!.uid

    @RequiresApi(Build.VERSION_CODES.O)
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
            //log stuff to the database

            val polDBInfo  = hashMapOf(
                "date_created" to LocalDateTime.now().toString(),
                "date_seen" to dateLog,
                "genus_species" to techName,
                "hotel_seen" to hotelId,
                "indent_type" to "photo_id",
                "photo_from_user" to "temp",
                "pollinatorID" to userPredict,
            )

            db.collection("Users").document(uid).collection("PollinatorRecord").document()
                .set(polDBInfo)
                .addOnSuccessListener {
                    Log.d(ContentValues.TAG, "DocumentSnapshot added with ID: $uid")
                }
                .addOnFailureListener { e ->
                    Log.w(ContentValues.TAG, "Error adding document", e)
                }



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
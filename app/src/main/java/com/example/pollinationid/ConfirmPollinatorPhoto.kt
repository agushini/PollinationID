package com.example.pollinationid

import android.annotation.SuppressLint
import android.content.*
import android.os.Build
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.UploadTask
import kotlinx.android.synthetic.main.pollinator_confirm_photo.*
import java.time.LocalDateTime
import java.util.*

class ConfirmPollinatorPhoto : AppCompatActivity() {

    companion object{
        private lateinit var photoUrl : String
    }

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
        val dateLog = sharedPref.getString("dateLog","ERR:NOTSENT")
        val encodedImage = sharedPref.getString("encodedImage","ERR:NOTSENT")

        selectedPollinatorPhotoIDImageView.setImageResource(photoPollinator)

        //decode encoded image to prepare to send it to the database
        val imageBytes = Base64.decode(encodedImage, Base64.DEFAULT)


        val fileName = UUID.randomUUID().toString() +".jpg"
        val refStorage = FirebaseStorage.getInstance().reference.child("pollinators/$fileName")


        //display the information they are about to submit
        selectedPollinatorInfoTextView.text =
            "User Prediction: $userPredict\n" +
            "Model Prediction: $modelPredict\n" +
            "Date and Time: $dateLog\n" +
            "Sighted At: $hotelId"

        submitPollinatorPhotoButton.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            Log.i("CONFIRMPOLLINATOR","Submit Pollinator btn clicked")

            refStorage.putBytes(imageBytes)
                .addOnSuccessListener { taskSnapshot ->
                    taskSnapshot.storage.downloadUrl.addOnSuccessListener {

                        photoUrl = it.toString()
                        Log.i("CONFIRMPOLLINATOR", "Successfully to uploaded photo $photoUrl")

                        //log stuff to the database

                        val polDBInfo  = hashMapOf(
                            "date_created" to LocalDateTime.now().toString(), //this is formatted differently than the dates given by IOS in the database
                            "date_seen" to dateLog,  //this is formatted differently than the dates given by IOS in the database
                            "genus_species" to techName,
                            "hotel_seen" to hotelId,
                            "indent_type" to "photo_id",
                            "photo_from_user" to photoUrl,
                            "pollinatorID" to userPredict,
                        )

                        db.collection("Users").document(uid).collection("PollinatorRecord").document()
                            .set(polDBInfo)
                            .addOnSuccessListener {
                                Log.d(ContentValues.TAG, "DocumentSnapshot added with ID: $uid")


                                dialogBuilder.setMessage("Thank you for your submission")
                                    // if the dialog is cancelable
                                    .setCancelable(false)
                                    // positive button text and action
                                    .setPositiveButton("Done!") { _, _ ->
                                        val mainActIntent = Intent(this, MainActivity::class.java)
                                        startActivity(mainActIntent)
                                        finish()
                                    }

                                // create dialog box
                                val alert = dialogBuilder.create()
                                // set title for alert dialog box
                                alert.setTitle("Pollinator Sent!")
                                // show alert dialog
                                alert.show()
                            }
                            .addOnFailureListener { e ->
                                Log.w(ContentValues.TAG, "Error adding document", e)

                                dialogBuilder.setMessage("Error, Something went wrong. Please try again later.")
                                    // if the dialog is cancelable
                                    .setCancelable(false)
                                    // positive button text and action
                                    .setPositiveButton("Okay") { _, _ ->
                                        val photoActIntent = Intent(this, PhotoActivity::class.java)
                                        startActivity(photoActIntent)
                                        finish()
                                    }

                                // create dialog box
                                val alert = dialogBuilder.create()
                                // set title for alert dialog box
                                alert.setTitle("Uh oh...")
                                // show alert dialog
                                alert.show()
                            }
                            .addOnFailureListener { e ->
                                Log.w(ContentValues.TAG, "Error adding document", e)
                            }
                    }
                }

                .addOnFailureListener { e ->
                    print(e.message)
                    Log.e("CONFIRMPOLLINATOR", "Failed to upload photo")
                }





            dialogBuilder.setMessage("Thank you for your submission")
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Done!") { _, _ ->
                val mainActIntent = Intent(this, MainActivity::class.java)
                startActivity(mainActIntent)
                finish()
            }
        }
    }
}
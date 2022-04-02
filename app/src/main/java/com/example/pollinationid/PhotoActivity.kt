package com.example.pollinationid

import android.Manifest
import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.format.DateFormat
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_photo.*
import java.util.*

class PhotoActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener,
    TimePickerDialog.OnTimeSetListener {

    lateinit var imageView: ImageView
    private val pickImage = 100
    private var imageUri: Uri? = null

    lateinit var textView: TextView
    private lateinit var dateButton: Button
    lateinit var hotelButton: Button
    private var day = 0
    var month: Int = 0
    var year: Int = 0
    var hour: Int = 0
    var minute: Int = 0
    var myDay = 0
    var myMonth: Int = 0
    var myYear: Int = 0
    var myHour: Int = 0
    var myMinute: Int = 0

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

        textView = findViewById(R.id.displayDate)
        dateButton = findViewById(R.id.pickDateBtn)
        hotelButton = findViewById(R.id.enterHotel)

        dateButton.setOnClickListener { //when pick date clicked
            Log.i("Photo Activity", "Date button clicked")
            val calendar: Calendar = Calendar.getInstance()
            day = calendar.get(Calendar.DAY_OF_MONTH)
            month = calendar.get(Calendar.MONTH)
            year = calendar.get(Calendar.YEAR)
            val datePickerDialog =
                DatePickerDialog(this@PhotoActivity, this@PhotoActivity, year, month,day)
            datePickerDialog.show()
        }

        hotelButton.setOnClickListener{
            Log.i("Photo Activity", "Hotel button clicked")
            val hotel = HotelIDInputPhoto.text.toString().uppercase() //get the input from the hotel text field


            if (hotel != ""){
                val mFireStore = FirebaseFirestore.getInstance()
                val hotelRef =mFireStore.collection("Hotels").document(hotel) //give it the hotel path

                hotelRef.get().addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val document = task.result
                        if(document != null) {
                            if (document.exists()) {
                                Log.i("Photo Activity", "Hotel exists.")
                                if (displayDate.text != ""){ //if date entered
                                    Log.i("Photo Activity","Date entered")
                                    Toast.makeText(
                                        this,
                                        "Valid Date and Hotel!",
                                        Toast.LENGTH_LONG
                                    ).show()

                                    val intent = Intent(this, PhotoPossiblePollinators::class.java)
                                    startActivity(intent)

                                }else{
                                    Log.i("Photo Activity", "Date not entered")
                                    Toast.makeText(
                                        this,
                                        "Please enter in a valid date",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            } else {
                                Log.e("Photo Activity", "Unexpected firebase input from documents. This message shouldn't show")
                            }
                        }
                    } else {
                        Toast.makeText(
                            this,
                            "Please enter in a valid hotel id",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }else{
                Toast.makeText(
                    this,
                    "Please enter in a valid hotel id",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        when (temp) { //when the intent from the other activity is one of these number then run a certain function
            1 -> {//if camera was clicked on previous fragment
                Log.i("PhotoActivity: ", "Camera was passed")

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
            0 -> { //if library was pressed on previous fragment
                Log.i("PhotoActivity: ", "Library was passed")
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
                Log.e("PhotoActivity: ", "Unexpected input")
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
        )
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


    //for date picker
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        myDay = day
        myMonth = month
        myYear = year
        val calendar: Calendar = Calendar.getInstance()
        hour = calendar.get(Calendar.HOUR)
        minute = calendar.get(Calendar.MINUTE)
        val timePickerDialog = TimePickerDialog(this@PhotoActivity, this@PhotoActivity, hour, minute,
            DateFormat.is24HourFormat(this@PhotoActivity))
        timePickerDialog.show()
    }
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        myHour = hourOfDay
        myMinute = minute
        textView.text = "Year: " + myYear + "\n" + "Month: " + myMonth + "\n" + "Day: " + myDay + "\n" + "Hour: " + myHour + "\n" + "Minute: " + myMinute
    }

}

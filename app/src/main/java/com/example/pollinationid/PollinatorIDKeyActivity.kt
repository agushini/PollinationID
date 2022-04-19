package com.example.pollinationid

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.widget.*
import com.example.pollinationid.IdFragment.NumberOfWingsActivity
import kotlinx.android.synthetic.main.activity_photo.*
import kotlinx.android.synthetic.main.activity_pollinator_idactivity.*
import java.util.*

class PollinatorIDKeyActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    //variables for date and time

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0
    var savedHour = 0
    var savedMinute = 0

    lateinit var textView: TextView
    private lateinit var dateButton: Button
    lateinit var hotelButton: Button
    lateinit var hotel: String
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


    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pollinator_idactivity)

        //Button click to Number of Wings page
        val buttonOpen: Button = findViewById(R.id.wingTypeButton)
        buttonOpen.setOnClickListener {

            val intent = Intent(this, NumberOfWingsActivity::class.java)
            startActivity(intent)

            if (dkTimeText.text != "") { //if date entered
                Log.i("Pollinator ID Key Activity", "Date entered")
                Toast.makeText(
                    this@PollinatorIDKeyActivity,
                    "Valid Date and Hotel!",
                    Toast.LENGTH_LONG
                ).show()
                startActivity(intent)

            }else{
                Log.i("Pollinator ID Key Activity", "Date not entered")
                Toast.makeText(
                    this@PollinatorIDKeyActivity,
                    "Please enter in a valid date",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        // date and time function
        textView = findViewById(R.id.dkTimeText)
        dateButton = findViewById(R.id.dkDateAndTimeButton)

        dateButton.setOnClickListener { //when pick date clicked
            val calendar: Calendar = Calendar.getInstance()
            day = calendar.get(Calendar.DAY_OF_MONTH)
            month = calendar.get(Calendar.MONTH)
            year = calendar.get(Calendar.YEAR)
            val datePickerDialog =
                DatePickerDialog(this@PollinatorIDKeyActivity, this@PollinatorIDKeyActivity, year, month,day)
            datePickerDialog.show()
        }

    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        myDay = day
        myMonth = month
        myYear = year
        val calendar: Calendar = Calendar.getInstance()
        hour = calendar.get(Calendar.HOUR)
        minute = calendar.get(Calendar.MINUTE)
        val timePickerDialog = TimePickerDialog(this@PollinatorIDKeyActivity, this@PollinatorIDKeyActivity, hour, minute,
            DateFormat.is24HourFormat(this@PollinatorIDKeyActivity))
        timePickerDialog.show()
    }
    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        myHour = hourOfDay
        myMinute = minute
        textView.text = "Year: $myYear\nMonth: $myMonth\nDay: $myDay\nHour: $myHour\nMinute: $myMinute"
    }
}

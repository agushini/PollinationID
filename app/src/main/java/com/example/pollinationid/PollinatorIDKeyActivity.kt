package com.example.pollinationid

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.view.View
import android.widget.*
import com.example.pollinationid.IdFragment.NumberOfWingsActivity
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pollinator_idactivity)

        //Button click to Number of Wings page
        val buttonOpen: Button = findViewById(R.id.wingTypeButton)
        buttonOpen.setOnClickListener {

            val intent = Intent(this, NumberOfWingsActivity::class.java)
            startActivity(intent)

            //buttonOpen.visibility = View.GONE
            //dkTimeText.visibility = View.GONE
        }

        // date and time function
        //pickDate()
        textView = findViewById(R.id.dkTimeText)
        dateButton = findViewById(R.id.dkDateAndTimeButton)
        //hotelButton = findViewById(R.id.enterHotel)

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

    //makes sure that date and time is being updated
    /*private fun getDateTimeCalendar() {
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)
    }

    private  fun pickDate() {
        dkDateAndTimeButton.setOnClickListener {
            getDateTimeCalendar()

            DatePickerDialog(this, this,year,month,day).show()
            dkDateAndTimeButton.visibility = View.GONE

        }
    }*/

    /*override fun onDateSet(p0: DatePicker?, year: Int, month : Int, dayOfMonth: Int) {
        savedDay= dayOfMonth
        savedMonth = month
        savedYear = year

        getDateTimeCalendar()
        TimePickerDialog(this, this, hour, minute, true).show()
    }

    override fun onTimeSet(p0: TimePicker?, hourOfDay: Int, minutes: Int) {
        savedHour = hourOfDay
        savedMinute = minutes

        dkTimeText.text = "$savedDay-$savedMonth-$savedYear\n Hour: $savedHour Minutes: $savedMinute"
    }*/

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
        textView.text =
            "Year: $myYear\nMonth: $myMonth\nDay: $myDay\nHour: $myHour\nMinute: $myMinute"
    }
}

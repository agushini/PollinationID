package com.example.pollinationid

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.pollinationid.IdFragment.NumberOfWingsActivity
import kotlinx.android.synthetic.main.activity_pollinator_idactivity.*
import java.util.*

class PollinatorIDKeyActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    //variables for date and time
    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0
    var savedHour = 0
    var savedMinute = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pollinator_idactivity)

        //Button click to Number of Wings page
        val buttonOpen: Button = findViewById(R.id.wingTypeButton)
        buttonOpen.setOnClickListener {

            val intent = Intent(this, NumberOfWingsActivity::class.java)
            startActivity(intent)

            buttonOpen.visibility = View.GONE
            dkTimeText.visibility = View.GONE
        }

        // date and time function
        pickDate()

    }

    //makes sure that date and time is being updated
    private fun getDateTimeCalendar() {
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
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month : Int, dayOfMonth: Int) {
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
    }
}

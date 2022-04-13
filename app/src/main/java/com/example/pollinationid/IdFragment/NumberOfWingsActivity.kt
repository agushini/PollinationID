package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_number_of_wings.*

class NumberOfWingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_of_wings)

        // two pair wings click to shape of wings
        val twoPairWingsBttn = findViewById<ImageButton>(R.id.twoPairWingsButton)
        twoPairWingsButton.setOnClickListener {
            val intent = Intent(this, ShapeOfWingsActivity::class.java)
            startActivity(intent)
        }

        // no wings button click to body segments
        val noWingsBttn = findViewById<ImageButton>(R.id.noWingsButton)
        noWingsBttn.setOnClickListener {
            val intent = Intent(this, BodySegmentsActivity::class.java)
            startActivity(intent)
        }

        // one pair wings click to possible pollinators
        /*val onPairWingBttn = findViewById<ImageButton>(R.id.onePairWingsButton)
        onPairWingBttn.setOnClickListener {
            val intent = Intent(this, BodySegmentsActivity::class.java)
            startActivity(intent)
        }*/

    }
}
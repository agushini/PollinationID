package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_shape_of_wings.*

class ShapeOfWingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape_of_wings)

        //different Wings button click to hairs page
        val differentWingsBttn = findViewById<ImageButton>(R.id.differentWingsButton)
        differentWingsBttn.setOnClickListener {
            val intent = Intent(this, HairActivity::class.java)
            startActivity(intent)
        }

        //rigid Wings button click to pollinators page
        /*val rigidWingsBttn = findViewById<ImageButton>(R.id.rigidWingsButton)
        rigidWingsBttn.setOnClickListener {
            val intent = Intent (this, )
        }*/
    }
}
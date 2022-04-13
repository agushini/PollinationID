package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R

class HairActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair)

        //different Wings button click to hairs page
        val almostNoHairBttn = findViewById<ImageButton>(R.id.noHairButton)
        almostNoHairBttn.setOnClickListener {
            val intent = Intent(this, AlmostNoHairColorActivity::class.java)
            startActivity(intent)
        }

    }
}
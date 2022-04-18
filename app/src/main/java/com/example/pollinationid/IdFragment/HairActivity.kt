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

        //almost no hair click to almost no hair color page
        val almostNoHairBttn = findViewById<ImageButton>(R.id.noHairButton)
        almostNoHairBttn.setOnClickListener {
            val intent = Intent(this, AlmostNoHairColorActivity::class.java)
            startActivity(intent)
        }

        //hair underneath click to hair underneath color page
        val hairUnderneathBttn = findViewById<ImageButton>(R.id.hairUnderneathButton)
        hairUnderneathBttn.setOnClickListener {
            val intent = Intent(this, HairUnderneathColorActivity::class.java)
            startActivity(intent)
        }

        //hair on sides click to hair on sides color page
        val hairOnSidesBttn = findViewById<ImageButton>(R.id.hairOnSideButton)
        hairOnSidesBttn.setOnClickListener {
            val intent = Intent(this, HairOnSidesColorActivity::class.java)
            startActivity(intent)
        }

        val fullHairBttn = findViewById<ImageButton>(R.id.hairFullButton)
        fullHairBttn.setOnClickListener {
            val intent = Intent(this, FullHairColorActivity::class.java)
            startActivity(intent)
        }

    }
}
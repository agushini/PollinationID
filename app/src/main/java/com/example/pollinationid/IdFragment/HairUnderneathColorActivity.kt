package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

class HairUnderneathColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair_underneath_color)

        //TODO("Alfalfa Leafcutter Bee, Apical Leafcutter Bee, Bellflower Resin Bee, Cuckoo Leafcutter Bee, Flat-Tailed Leafcutter Bee, ")

        //hair underneath black pale stripes click to possible pollinators page
        val hairUnderneathBlackPaleStripesBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackPaleStripesButton)
        hairUnderneathBlackPaleStripesBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

        //TODO("Cuckoo Leafcutter Bee, European Wool-Carder Bee, Leafcutter Bees, Oblong Wool-Carder Bee")

        //hair underneath black and yellow stripes click to possible pollinators page
        val hairUnderneathBlackYellowStripesBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackYellowStripesButton)
        hairUnderneathBlackYellowStripesBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

        //TODO("Cuckoo Leafcutter Bee,  Leafcutter Bees, Small-Handed Leafcutter Bee")

        //hair underneath black and yellow stripes click to possible pollinators page
        val hairUnderneathBlackWithPaleBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackWithPaleButton)
        hairUnderneathBlackWithPaleBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }
    }
}
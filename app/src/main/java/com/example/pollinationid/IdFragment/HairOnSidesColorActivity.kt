package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

class HairOnSidesColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair_on_sides_color)

        //TODO("Hornfaced Bee, Sculptured Resin Bee, Taurus Mason Bee")

        //hair on sides black and auburn click to possible pollinators page
        val hairOnSideBlackAndAuburnBttn = findViewById<ImageButton>(R.id.hairOnSideBlackAndAuburnButton)
        hairOnSideBlackAndAuburnBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

        //TODO("European Wool-Carder Bee, Oblong Wool-Carder Bee")

        //hair on sides black and yellow click to possible pollinators page
        val hairOnSideBlackAndYellowBttn = findViewById<ImageButton>(R.id.hairOnSideBlackAndYellowButton)
        hairOnSideBlackAndYellowBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

        //TODO("Blue Orchard Mason Bee, Dwarf Mason Bee, Maine Blueberry Bee")

        //hair on sides blue click to possible pollinators page
        val hairOnSideBlueBttn = findViewById<ImageButton>(R.id.hairOnSideBlueButton)
        hairOnSideBlueBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

        //TODO("Blue Orchard Mason Bee, Bufflehead Mason Bee, Dwarf Mason Bee, Hornfaced Bee, Mason Bees, Orange-Tipped Wood Digger Bee, Small Mason Bees, Taurus Mason Bee")

        //hair underneath black and yellow stripes click to possible pollinators page
        val hairOnSideBlackPaleBttn = findViewById<ImageButton>(R.id.hairOnSideBlackPaleButton)
        hairOnSideBlackPaleBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            startActivity(intent)
        }

    }
}
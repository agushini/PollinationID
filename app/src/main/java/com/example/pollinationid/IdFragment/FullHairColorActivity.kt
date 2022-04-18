package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

class FullHairColorActivity : AppCompatActivity() {

    val DKoutputList : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_hair_color)

        //TODO("Bufflehead Mason Bee, Common Eastern Bumblebee, Eastern Carpenter Bee")

        //full hair black and yellow click to possible pollinators page
        val fullHairBlackAndYellowBttn = findViewById<ImageButton>(R.id.fullHairBlackAndYellowButton)
        fullHairBlackAndYellowBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            DKoutputList.addAll(listOf("Bufflehead Mason Bee","Common Eastern Bumblebee", "Eastern Carpenter Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Western Honeybee")

        //full hair Black Amber or Brown click to possible pollinators page
        val fullHairBlackAmberOrBrownBttn = findViewById<ImageButton>(R.id.fullHairBlackAmberOrBrownButton)
        fullHairBlackAmberOrBrownBttn.setOnClickListener {
            val intent = Intent(this, dkPossiblePollinatorsRecycler::class.java)
            DKoutputList.addAll(listOf("Western Honeybee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

    }
}
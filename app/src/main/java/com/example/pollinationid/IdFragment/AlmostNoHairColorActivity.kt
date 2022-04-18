package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

class AlmostNoHairColorActivity : AppCompatActivity() {

    val DKoutputList : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_no_hair_color)

        //TODO("Carrot Wasps, Mexican Grass-Carrying Wasp")

        //no hair black 1 click to possible pollinators page
        val noHairBlack1Bttn = findViewById<ImageButton>(R.id.noHairBlack1Button)
        noHairBlack1Bttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Carrot Wasps","Mexican Grass-Carrying Wasp"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Small Carpenter Bees ")

        //no hair black 2 click to possible pollinators page
        val noHairBlack2Bttn = findViewById<ImageButton>(R.id.noHairBlack2Button)
        noHairBlack2Bttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Small Carpenter Bees"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Cuckoo Leafcutter Bee, Small Resin Bees, Small Sweat Bees")

        //no hair Black Pale Stripes click to possible pollinators page
        val noHairBlackPaleStripesBttn = findViewById<ImageButton>(R.id.noHairBlackPaleStripesButton)
        noHairBlackPaleStripesBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Cuckoo Leafcutter Bee", "Small Resin Bees", "Small Sweat Bees"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Carrot Wasps, Cuckoo Bees")

        //no hair Black and red click to possible pollinators page
        val noHairBlackAndRedBttn = findViewById<ImageButton>(R.id.noHairBlackAndRedButton)
        noHairBlackAndRedBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Carrot Wasps", "Cuckoo Bees"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Carrot Wasps")

        //no hair Black and Red Stripes click to possible pollinators page
        val noHairBlackRedStripesBttn = findViewById<ImageButton>(R.id.noHairBlackRedStripesButton)
        noHairBlackRedStripesBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Carrot Wasps"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Four-Toothed Mason Wasp,  Hornets and Yellowjackets, Modest Masked Bee")

        //no hair Black and Yellow click to possible pollinators page
        val noHairBlackAndYellowBttn = findViewById<ImageButton>(R.id.noHairBlackAndYellowButton)
        noHairBlackAndYellowBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Four-Toothed Mason Wasp",  "Hornets and Yellowjackets", "Modest Masked Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Pure Green Sweat Bee, Small Carpenter Bees, Small Sweat Bees")

        //no hair Blue click to possible pollinators page
        val noHairBlueBttn = findViewById<ImageButton>(R.id.noHairBlueButton)
        noHairBlueBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Pure Green Sweat Bee", "Small Carpenter Bees", "Small Sweat Bees"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Metallic Bluish Green Cuckoo Wasp, Pure Green Sweat Bee")

        //no hair green click to possible pollinators page
        val noHairGreenBttn = findViewById<ImageButton>(R.id.noHairGreenButton)
        noHairGreenBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Metallic Bluish Green Cuckoo Wasp", "Pure Green Sweat Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

        //TODO("Metallic Bluish Green Cuckoo Wasp ")

        //no hair bluishgreen click to possible pollinators page
        val noHairBluishGreenBttn = findViewById<ImageButton>(R.id.noHairBluishGreenButton)
        noHairBluishGreenBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Metallic Bluish Green Cuckoo Wasp"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)
            startActivity(intent)
        }

    }
}
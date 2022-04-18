package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_shape_of_wings.*

class ShapeOfWingsActivity : AppCompatActivity() {

    val DKoutputList : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape_of_wings)

        //different Wings button click to hairs page
        val differentWingsBttn = findViewById<ImageButton>(R.id.differentWingsButton)
        differentWingsBttn.setOnClickListener {
            val intent = Intent(this, HairActivity::class.java)
            startActivity(intent)
        }

        //TODO("Beetles, Lady Bugs")

        //rigid Wings button click to pollinators page
        val rigidWingsBttn = findViewById<ImageButton>(R.id.rigidWingsButton)
        rigidWingsBttn.setOnClickListener {
            val intent = Intent (this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Beetles", "Lady Bugs"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Brown Lacewings, Green Lacewings")

        //roof like wings click to pollinators page
        val roofLikeWingsBttn = findViewById<ImageButton>(R.id.roofLikeWingsButton)
        roofLikeWingsBttn.setOnClickListener {
            val intent = Intent (this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Brown Lacewings", "Green Lacewings"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Common Barklice")

        //bark lice wings click to pollinators
        val barkLiceBttn = findViewById<ImageButton>(R.id.barkLiceButton)
        barkLiceBttn.setOnClickListener {
            val intent = Intent (this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Common Barklice"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

    }
}
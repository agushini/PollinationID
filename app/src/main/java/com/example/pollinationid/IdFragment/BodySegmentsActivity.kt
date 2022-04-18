package com.example.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.pollinationid.R

class BodySegmentsActivity : AppCompatActivity() {

    val DKoutputList : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_segments)

        //TODO("American Grass Spiders, Harvestmen, Jumping Spiders")

        //two segments click to possible pollinators page
        val twoSegmentsBttn = findViewById<ImageButton>(R.id.twoSegmentsButton)
        twoSegmentsBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("American Grass Spiders","Harvestmen", "Jumping Spiders"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Bark Centipede, Centipedes, Common Pill Woodlouse, House Centipede, Millipedes")

        //two or more segments click to possible pollinators page
        val twoPlusSegmentsBttn = findViewById<ImageButton>(R.id.twoPlusSegmentsButton)
        twoPlusSegmentsBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Bark Centipede","Centipedes", "Common Pill Woodlouse", "House Centipede", "Millipedes"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }
    }
}
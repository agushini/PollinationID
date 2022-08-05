package edu.umich.pollinationid.IdFragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import edu.umich.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

class HairUnderneathColorActivity : AppCompatActivity() {

    val DKoutputList : ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hair_underneath_color)

        //TODO("Alfalfa Leafcutter Bee, Apical Leafcutter Bee, Bellflower Resin Bee, Cuckoo Leafcutter Bee, Flat-Tailed Leafcutter Bee, Leafcutter Bees, Pugnacious Leafcutter Bee,
        // Sculptured Resin Bee, Silver-Tailed Petalcutter Bee, Small Mason Bees, Small Resin Bees, Small-Handed Leafcutter Bee, Unarmed Leafcutter Bee)

        //hair underneath black pale stripes click to possible pollinators page
        val hairUnderneathBlackPaleStripesBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackPaleStripesButton)
        hairUnderneathBlackPaleStripesBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Alfalfa Leafcutter Bee", "Apical Leafcutter Bee", "Bellflower Resin Bee", "Cuckoo Leafcutter Bee", "Flat-Tailed Leafcutter Bee",
                "Leafcutter Bees", "Pugnacious Leafcutter Bee", "Sculptured Resin Bee", "Silver-Tailed Petalcutter Bee", "Small Mason Bees", "Small Resin Bees", "Small-Handed Leafcutter Bee", "Unarmed Leafcutter Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Cuckoo Leafcutter Bee, European Wool-Carder Bee, Leafcutter Bees, Oblong Wool-Carder Bee")

        //hair underneath black and yellow stripes click to possible pollinators page
        val hairUnderneathBlackYellowStripesBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackYellowStripesButton)
        hairUnderneathBlackYellowStripesBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Cuckoo Leafcutter Bee", "European Wool-Carder Bee", "Leafcutter Bees", "Oblong Wool-Carder Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }

        //TODO("Cuckoo Leafcutter Bee,  Leafcutter Bees, Small-Handed Leafcutter Bee")

        //hair underneath black and yellow stripes click to possible pollinators page
        val hairUnderneathBlackWithPaleBttn = findViewById<ImageButton>(R.id.hairUnderneathBlackWithPaleButton)
        hairUnderneathBlackWithPaleBttn.setOnClickListener {
            val intent = Intent(this, DKPossiblePollinatorActivity::class.java)
            DKoutputList.addAll(listOf("Cuckoo Leafcutter Bee", "Leafcutter Bees", "Small-Handed Leafcutter Bee"))
            intent.putStringArrayListExtra("DKResults",DKoutputList)

            startActivity(intent)
        }
    }
}
package com.example.pollinationid
//this connects to the fourth fragment and handles the clicks for each entry in the encyclopedia
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_fourth.*

class ExploreActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_explore)
        //get the intents that were sent over from the main activity
        val navBarTitle = intent.getStringExtra(bugInsectViewHolder.NAV_BAR_KEY)
        supportActionBar?.title = navBarTitle

        //set each image to be correct, must have a default value which is a camera icon right now
        val eImageView1: ImageView = findViewById(R.id.exploreimage1)
        val eimg1 = intent.getIntExtra(bugInsectViewHolder.E_IMG_1_KEY, R.drawable.ic_black_camera_foreground)
        eImageView1?.setImageResource(eimg1)

        val eImageView2: ImageView = findViewById(R.id.exploreimage2)
        val eimg2 = intent.getIntExtra(bugInsectViewHolder.E_IMG_2_KEY, R.drawable.ic_black_camera_foreground)
        eImageView2?.setImageResource(eimg2)

        val eImageView3: ImageView = findViewById(R.id.exploreimage3)
        val eimg3 = intent.getIntExtra(bugInsectViewHolder.E_IMG_3_KEY, R.drawable.ic_black_camera_foreground)
        eImageView3?.setImageResource(eimg3)

        val eImageView4: ImageView = findViewById(R.id.exploreimage4)
        val eimg4 = intent.getIntExtra(bugInsectViewHolder.E_IMG_4_KEY, R.drawable.ic_black_camera_foreground)
        eImageView4?.setImageResource(eimg4)

    }
}

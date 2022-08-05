package edu.umich.pollinationid
//this connects to the fourth fragment and handles the clicks for each entry in the encyclopedia
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_explore.*
import kotlinx.android.synthetic.main.fragment_fourth.*

class ExploreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_explore)

        val textDesc: TextView = findViewById(R.id.ExploreDescription_textView)
        textDesc.movementMethod = ScrollingMovementMethod()

        //get the intents that were sent over from the main activity ExploreDescription_textView

        //set the nav bar to the correct name
        val navBarTitle = intent.getStringExtra(bugInsectViewHolder.NAV_BAR_KEY)
        supportActionBar?.title = navBarTitle

        val eTechNameTextView: TextView = findViewById(R.id.Explore_technicalName_textview)
        eTechNameTextView?.text = intent.getStringExtra(bugInsectViewHolder.E_DESCRIPTION_KEY)

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

        ExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolder.E_ABOUT_KEY)

        //set the text to change on the button click
        aboutButton.setOnClickListener{
            ExploreDescription_textView.text =  intent.getStringExtra(bugInsectViewHolder.E_ABOUT_KEY)
        }

        keyCharButton.setOnClickListener{
            ExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolder.E_KEYCHAR_KEY)
        }

        plantButton.setOnClickListener{
            ExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolder.E_PLANT_KEY)
        }
    }
}

package edu.umich.pollinationid

//similar to explore activity

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mypollinator.*


class PossiblePhotoPollinatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Copied from explore activity
        setContentView(R.layout.activity_mypollinator)

        val textDesc: TextView = findViewById(R.id.myPoliExploreDescription_textView)
        textDesc.movementMethod = ScrollingMovementMethod()

        //get the intents that were sent over from the activity

        //set the nav bar to the correct name
        val navBarTitle = intent.getStringExtra(bugInsectViewHolderPhoto.NAV_BAR_KEY)
        supportActionBar?.title = navBarTitle

        val eTechNameTextView: TextView = findViewById(R.id.myPoliExplore_technicalName_textview)
        eTechNameTextView.text = intent.getStringExtra(bugInsectViewHolderPhoto.E_DESCRIPTION_KEY)

        //set each image to be correct, must have a default value which is a camera icon right now
        val eImageView1: ImageView = findViewById(R.id.myPoliexploreimage1)
        val eimg1 = intent.getIntExtra(bugInsectViewHolderPhoto.E_IMG_1_KEY, R.drawable.ic_black_camera_foreground)
        eImageView1.setImageResource(eimg1)

        val eImageView2: ImageView = findViewById(R.id.myPoliexploreimage2)
        val eimg2 = intent.getIntExtra(bugInsectViewHolderPhoto.E_IMG_2_KEY, R.drawable.ic_black_camera_foreground)
        eImageView2.setImageResource(eimg2)

        val eImageView3: ImageView = findViewById(R.id.myPoliexploreimage3)
        val eimg3 = intent.getIntExtra(bugInsectViewHolderPhoto.E_IMG_3_KEY, R.drawable.ic_black_camera_foreground)
        eImageView3.setImageResource(eimg3)

        val eImageView4: ImageView = findViewById(R.id.myPoliexploreimage4)
        val eimg4 = intent.getIntExtra(bugInsectViewHolderPhoto.E_IMG_4_KEY, R.drawable.ic_black_camera_foreground)
        eImageView4.setImageResource(eimg4)

        myPoliExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolderPhoto.E_ABOUT_KEY)

        //set the text to change on the button click
        myPoliaboutButton.setOnClickListener{
            myPoliExploreDescription_textView.text =  intent.getStringExtra(bugInsectViewHolderPhoto.E_ABOUT_KEY)
        }

        myPolikeyCharButton.setOnClickListener{
            myPoliExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolderPhoto.E_KEYCHAR_KEY)
        }

        myPoliplantButton.setOnClickListener{
            myPoliExploreDescription_textView.text = intent.getStringExtra(bugInsectViewHolderPhoto.E_PLANT_KEY)
        }

        myPollinatorButton.setOnClickListener{
            Log.i("POSSIBLE POLLINATORS","This is my Pollinator btn clicked")

            val confirmIntent = Intent(this,ConfirmPollinatorPhotoandDK::class.java)

            confirmIntent.putExtra("userPredict",navBarTitle)
            confirmIntent.putExtra("PhotoSelectedPollinator",eimg1)
            confirmIntent.putExtra("techName",eTechNameTextView.text)

            startActivity(confirmIntent)

        }
    }

}
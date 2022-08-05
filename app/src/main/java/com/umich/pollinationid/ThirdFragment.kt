package edu.umich.pollinationid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Log.VERBOSE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.android.synthetic.main.fragment_third.view.*

//Helpful site for this https://medium.com/developer-student-clubs/android-kotlin-camera-using-gallery-ff8591c26c3e

class ThirdFragment:Fragment(R.layout.fragment_third) {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreate(savedInstanceState)
        val view: View = inflater!!.inflate(R.layout.fragment_third,container,false)

        view.cameraButton.setOnClickListener{ view ->
            Log.v("Camera Button", "Clicked")
            val intentCam = Intent( activity , PhotoActivity::class.java)

            intentCam.putExtra("MODE",1)
            startActivity(intentCam)
        }

        view.libraryButton.setOnClickListener{view->
            Log.v("Library Button:","Clicked")

            val intentCam = Intent(activity , PhotoActivity::class.java)

            intentCam.putExtra("MODE",0)
            startActivity(intentCam)
        }

        return view
    }


}


package com.example.pollinationid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*
import kotlinx.android.synthetic.main.photo_pollinators_possible.*
import java.util.ArrayList

//equivalent to the fourth fragment

class PhotoPossiblePollinators : AppCompatActivity() {

    private val photoInsectList = PollinatorInfo.newInstance().mInsectList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //retainInstance = true
        //inflater.inflate(R.layout.photo_pollinators_possible, container, false)
        setContentView(R.layout.photo_pollinators_possible )

        recycler_viewPhoto.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this@PhotoPossiblePollinators)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapterPhoto(photoInsectList)
        }
    }

    // populate the views now that the layout has been inflated
//    fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        // RecyclerView node initialized here
//
//
//    }

        //Log.i("PHOTOPOSSIBLEPOLLINATOR", mInsectList.toString())
//        Log.i("PossiblePollinator", "Inside")
//        setContentView(R.layout.photo_pollinators_possible)
//        aiResults = findViewById(R.id.aiResults)
//        Log.i("POSSIBLE POLLINATORS", "Before Intent")
//
//        val text = intent.getStringExtra("Results")
//
//        Log.i("POSSIBLE POLLINATORS", "Result $text")

}
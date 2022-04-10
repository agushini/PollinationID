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

    //val temp : MutableList<Insect> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.photo_pollinators_possible )

        val outputListRecycler : MutableList<Insect> = arrayListOf()
        val resultsList = intent.getStringArrayListExtra("Results")
        //var j = 0
        if (resultsList != null) {
//            for (bug in resultsList){
//                for(item in photoInsectList){
//                    if (bug == item.title){
//                        outputListRecycler.add(item)
//                    }
//                }

//                for(j in photoInsectList.indices){ //because 51 pollinators in the{
//                while(j < 51){
//                    if (bug == photoInsectList[j].title){
//                        outputListRecycler.add(photoInsectList[j])
//                        j = -1
//                        //break@loop
//                    }
//                    j++
//                }
//            }

            for(i in resultsList.indices){
                for(j in photoInsectList.indices){
                    if (resultsList[i] == photoInsectList[j].title){
                        outputListRecycler.add(photoInsectList[j])
                    }
                }
            }
        }

        Log.i("PHOTOPOSSIBLEPOLLINATOR",outputListRecycler.toString())
        Log.i("PHOTOPOSSIBLEResult", resultsList.toString())

        recycler_viewPhoto.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior-+
            layoutManager = LinearLayoutManager(this@PhotoPossiblePollinators)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapterPhoto(outputListRecycler)
        }
    }



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
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
        setContentView(R.layout.photo_pollinators_possible )

        //resulstList = ["Harvest Men", "Blue orchard bee"]
        val outputListRecycler : MutableList<Insect> = arrayListOf()
        val resultsList = intent.getStringArrayListExtra("Results")
        if (resultsList != null) {

            for(i in resultsList.indices){
                for(j in photoInsectList.indices){
                    if (resultsList[i] == photoInsectList[j].title){
                        outputListRecycler.add(photoInsectList[j])
                    }
                }
            }
        }

        recycler_viewPhoto.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this@PhotoPossiblePollinators)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapterPhoto(outputListRecycler)
        }
    }

}
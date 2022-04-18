package com.example.pollinationid.IdFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pollinationid.Insect
import com.example.pollinationid.ListAdapterPhoto
import com.example.pollinationid.PollinatorInfo
import com.example.pollinationid.R
import kotlinx.android.synthetic.main.activity_dkpossible_pollinator.*

//the same as the fourth fragment or PhotoPossiblePollinators.kt

class DKPossiblePollinatorActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_dkpossible_pollinator)
//    }

    private val DKInsectList = PollinatorInfo.newInstance().mInsectList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dkpossible_pollinator)

        //resulstList = ["Harvest Men", "Blue orchard bee"]
        val outputListRecycler : MutableList<Insect> = arrayListOf()
        val resultsList = intent.getStringArrayListExtra("DKResults")
        if (resultsList != null) {
            for(i in resultsList.indices){
                for(j in DKInsectList.indices){
                    if (resultsList[i] == DKInsectList[j].title){
                        outputListRecycler.add(DKInsectList[j])
                    }
                }
            }
        }

        dkPossiblePollinatorsRecycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this@DKPossiblePollinatorActivity)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapterPhoto(outputListRecycler)

            val sharedPref = getSharedPreferences("dkOrphoto", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("whichSent","dk")
            editor.apply()
        }
    }


}
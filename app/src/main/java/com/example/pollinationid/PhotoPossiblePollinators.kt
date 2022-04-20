package com.example.pollinationid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.android.synthetic.main.photo_pollinators_possible.*
import java.util.ArrayList

//equivalent to the fourth fragment

class PhotoPossiblePollinators : AppCompatActivity() {

    private val photoInsectList = PollinatorInfo.newInstance().mInsectList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.photo_pollinators_possible )

        val outputListRecycler : MutableList<Insect> = arrayListOf()
        val resultsList = intent.getStringArrayListExtra("Results")

        if (resultsList != null) {
            if(resultsList.size < 1){ //if the results list is empty, let the user know why.
                val dialogBuilder = AlertDialog.Builder(this)
                dialogBuilder.setMessage("This image is not recognized. Please submit a clearer picture to get better results.")
                    // if the dialog is cancelable
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Okay") { _, _ ->
                        val mainActivity =
                            Intent(this, MainActivity::class.java)
                        startActivity(mainActivity)
                        finish()
                    }

                // create dialog box
                val alert = dialogBuilder.create()
                // set title for alert dialog box
                alert.setTitle("Uh oh...")
                // show alert dialog
                alert.show()
            }
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

            val sharedPref = getSharedPreferences("dkOrphoto", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("whichSent","photo")
            editor.apply()
        }
    }

}
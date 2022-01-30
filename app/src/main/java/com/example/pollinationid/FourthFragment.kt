package com.example.pollinationid

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*

data class Insect(val title: String, val description: String, val img: Int)

class FourthFragment:Fragment(R.layout.fragment_fourth) {
    private val mInsectList = listOf(
        Insect("Alfalfa Leafcutter Bee", "(Megachile rotundata)",R.drawable.alfalfa_leafcutter_bee_1),
        Insect("American Grass Spider", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Apical Leafcutter Bee", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Bark Centipede", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Beetles", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Bellflower Resin Bee", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Blue Orchard Mason Bee", "PLACE HOLDER",R.drawable.ic_book_foreground),
        Insect("Brown Lacewings", "PLACE HOLDER",R.drawable.ic_book_foreground),
        
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_fourth, container, false)

    // populate the views now that the layout has been inflated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here
        recycler_view1.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ListAdapter(mInsectList)
        }
    }

    companion object {
        fun newInstance(): FourthFragment = FourthFragment()
    }
}
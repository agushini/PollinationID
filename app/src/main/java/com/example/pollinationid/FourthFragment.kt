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
        Insect("American Grass Spider", "(Agelenopsis spp.)",R.drawable.american_grass_spiders_1),
        Insect("Apical Leafcutter Bee", "(Megachile apicalis)",R.drawable.apical_leafcutter_bee_1),
        Insect("Bark Centipede", "(Scoloprcryptops sexspinosus)",R.drawable.bark_centipede_1),
        Insect("Beetles", "Order: Coleoptera",R.drawable.beetles_1),
        Insect("Bellflower Resin Bee", "(Megachile campanulae)",R.drawable.bellflower_resin_bee_1),
        Insect("Blue Orchard Mason Bee", "(Osmia lignaria)",R.drawable.blue_orchard_mason_bee_1),
        Insect("Brown Lacewings", "Family: Hemerobiidae",R.drawable.brown_lacewings_1),
        
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
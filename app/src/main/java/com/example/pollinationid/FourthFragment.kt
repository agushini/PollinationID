package com.example.pollinationid

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fourth.*

data class Movie(val title: String, val year: Int, val img: Int)

class FourthFragment:Fragment(R.layout.fragment_fourth) {
    private val mNicolasCageMovies = listOf(
        Movie("Raising Arizona", 1987,R.drawable.ic_book_foreground),
        Movie("Vampire's Kiss", 1988,R.drawable.ic_book_foreground),
        Movie("Con Air", 1997,R.drawable.ic_book_foreground),
        Movie("Gone in 60 Seconds", 1997,R.drawable.ic_book_foreground),
        Movie("National Treasure", 2004,R.drawable.ic_book_foreground),
        Movie("The Wicker Man", 2006,R.drawable.ic_book_foreground),
        Movie("Ghost Rider", 2007,R.drawable.ic_book_foreground),
        Movie("Knowing", 2009,R.drawable.ic_book_foreground)
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
            adapter = ListAdapter(mNicolasCageMovies)
        }
    }

    companion object {
        fun newInstance(): FourthFragment = FourthFragment()
    }
}
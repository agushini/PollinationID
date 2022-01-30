package com.example.pollinationid

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: List<Insect>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie: Insect = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null
    private  var mImageView: ImageView? = null

    init {
        mTitleView = itemView.findViewById(R.id.recycler1TextView)
        mYearView = itemView.findViewById(R.id.recycler1TextView_caption)
        mImageView = itemView.findViewById((R.id.recycler1ImageView))
    }

    fun bind(movie: Insect) {
        mTitleView?.text = movie.title
        mYearView?.text = movie.description
        mImageView?.setImageResource(movie.img)
    }

}
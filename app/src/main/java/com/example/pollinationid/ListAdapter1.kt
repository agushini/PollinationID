package com.example.pollinationid
//connects to the fourth fragment for the recycler view
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val list: List<Insect>)
    : RecyclerView.Adapter<bugInsectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bugInsectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return bugInsectViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: bugInsectViewHolder, position: Int) {
        val bugInsect: Insect = list[position]
        holder.bind(bugInsect)
    }

    override fun getItemCount(): Int = list.size

}

class bugInsectViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null
    private  var mImageView: ImageView? = null

    init {
        mTitleView = itemView.findViewById(R.id.recycler1TextView)
        mYearView = itemView.findViewById(R.id.recycler1TextView_caption)
        mImageView = itemView.findViewById(R.id.recycler1ImageView)


    }

    fun bind(bugInsect: Insect) {
        mTitleView?.text = bugInsect.title
        mYearView?.text = bugInsect.description
        mImageView?.setImageResource(bugInsect.img)

        itemView.setOnClickListener(){
            println("TEST CLICK")

            val intent = Intent(itemView.context, ExploreActivity::class.java)

            itemView.context.startActivity(intent)
        }
    }

}
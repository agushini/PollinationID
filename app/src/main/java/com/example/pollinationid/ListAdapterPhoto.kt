package com.example.pollinationid
//connects to the PhotoActivity for the recycler view same as ListAdapter1.kt
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapterPhoto(private val list: List<Insect>)
    : RecyclerView.Adapter<bugInsectViewHolderPhoto>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bugInsectViewHolderPhoto {
        val inflater = LayoutInflater.from(parent.context)
        return bugInsectViewHolderPhoto(inflater, parent)
    }

    override fun onBindViewHolder(holder: bugInsectViewHolderPhoto, position: Int) {
        val bugInsect: Insect = list[position]
        holder.bindPhoto(bugInsect)
    }

    override fun getItemCount(): Int = list.size

}

class bugInsectViewHolderPhoto(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card, parent, false)) {

    companion object{ //this is helps to avoid errors when passing code to the other activity
        val NAV_BAR_KEY = "Nav_BAR"
        val E_IMG_1_KEY = "E_IMG_1"
        val E_IMG_2_KEY = "E_IMG_2"
        val E_IMG_3_KEY = "E_IMG_3"
        val E_IMG_4_KEY = "E_IMG_4"
        val E_DESCRIPTION_KEY = "E-DESCRIPTION"
        val E_ABOUT_KEY = "E_ABOUT"
        val E_KEYCHAR_KEY = "E_KEYCHAR"
        val E_PLANT_KEY = "E_PLANT"
    }

    private var mTitleView: TextView? = null
    private var mCaptionView: TextView? = null
    private  var mImageView: ImageView? = null

    init {
        mTitleView = itemView.findViewById(R.id.recycler1TextView)
        mCaptionView = itemView.findViewById(R.id.recycler1TextView_caption)
        mImageView = itemView.findViewById(R.id.recycler1ImageView)

    }

    fun bindPhoto(bugInsect: Insect) {
        mTitleView?.text = bugInsect.title
        mCaptionView?.text = bugInsect.description
        mImageView?.setImageResource(bugInsect.img1)

        itemView.setOnClickListener(){
            //handles the click for each encyclopedia entry
            //on click pass the data for which one was clicked to the new activity to populate
            val intent = Intent(itemView.context, PossiblePhotoPollinatorActivity::class.java)
            intent.putExtra(NAV_BAR_KEY,bugInsect.title)
            intent.putExtra(E_IMG_1_KEY,bugInsect.img1)
            intent.putExtra(E_IMG_2_KEY,bugInsect.img2)
            intent.putExtra(E_IMG_3_KEY,bugInsect.img3)
            intent.putExtra(E_IMG_4_KEY,bugInsect.img4)
            intent.putExtra(E_DESCRIPTION_KEY,bugInsect.description)
            intent.putExtra(E_ABOUT_KEY,bugInsect.about)
            intent.putExtra(E_KEYCHAR_KEY,bugInsect.keyChar)
            intent.putExtra(E_PLANT_KEY,bugInsect.plants)

            itemView.context.startActivity(intent)
        }
    }

}
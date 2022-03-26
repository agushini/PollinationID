package com.example.pollinationid

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.fragment.app.Fragment
import android.widget.ListView
import android.widget.TextView

class FifthFragment:Fragment(R.layout.fragment_fifth) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = view?.findViewById<ListView>(R.id.main_listview)

        listView?.adapter = MyCustomAdapter(this.requireContext())//SUPPOSED TO JUST BE "this" BUT IT GIVES ERRORS
    }

    private class MyCustomAdapter(context: Context): BaseAdapter() {

        private val mContext: Context = context

        //responsible for how many rows in my list
        override fun getCount(): Int {
            return 5
        }

        //Ignore this for now
        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        //Ignore this for now
        override fun getItem(position: Int): Any {
            return "getItem <TEST STRING>"
        }

        //responsible for rendering out each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val textView = TextView(mContext)
            textView.text = "Here is my ROW for my LISTVIEW"
            return textView
        }

    }

}
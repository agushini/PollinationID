package com.example.pollinationid.IdFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pollinationid.PollinatorIDKeyActivity
import com.example.pollinationid.R
import com.example.pollinationid.databinding.FragmentNumberOfWingsBinding
import com.example.pollinationid.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_number_of_wings.*

class NumberOfWingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var bindCheck = 0
        var bind2Check = 0

        //button click using no wings to body segments
        val bind = FragmentNumberOfWingsBinding.inflate (layoutInflater)
        bind.noWingsButton.setOnClickListener {
            val intent = Intent(this@NumberOfWingsFragment.requireContext(), BodySegmentsActivity::class.java)
            startActivity(intent)
            bindCheck = 1
        }

        //button click to using two pairs of wings to shape of wings
        val bind2 = FragmentNumberOfWingsBinding.inflate (layoutInflater)
        bind2.twoPairWingsButton.setOnClickListener {
            val intent = Intent(this@NumberOfWingsFragment.requireContext(), ShapeOfWingsActivity::class.java)
            startActivity(intent)
            bind2Check = 2
        }

        if(bindCheck == 1) {
            return bind.root
        } else {
            return bind2.root
        }

        //return inflater.inflate(R.layout.fragment_number_of_wings, container, false)

    }

}
package com.example.pollinationid.IdFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pollinationid.R
import com.example.pollinationid.databinding.FragmentNumberOfWingsBinding
import kotlinx.android.synthetic.main.fragment_number_of_wings.*

class NumberOfWingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_number_of_wings, container, false)

    }

}
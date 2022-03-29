package com.example.pollinationid.IdFragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pollinationid.PollinatorIDKeyActivity
import com.example.pollinationid.R
import com.example.pollinationid.databinding.FragmentSecondBinding

class SecondFragment:Fragment(R.layout.fragment_second) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentSecondBinding.inflate (layoutInflater)
        bind.dateAndTimeButton.setOnClickListener {
            val intent = Intent(this@SecondFragment.requireContext(), PollinatorIDKeyActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }

}
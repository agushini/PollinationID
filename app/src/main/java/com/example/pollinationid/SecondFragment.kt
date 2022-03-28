package com.example.pollinationid
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment:Fragment(R.layout.fragment_second) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = Bind

        return super.onCreateView(inflater, container, savedInstanceState)
    }

}
package com.example.pollinationid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment


class FifthFragment:Fragment(R.layout.fragment_fifth) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val signOut = view?.findViewById<Button>(R.id.btnSignOut)

        signOut?.setOnClickListener(){
            Log.i("Good", "SignOut Button Clicked")
            val intent = Intent (activity, LoginActivity::class.java)
            activity?.startActivity(intent)
        }

    }
}
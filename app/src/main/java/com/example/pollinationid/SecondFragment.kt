package com.example.pollinationid

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment:Fragment(R.layout.fragment_second) {

//    lateinit var auth: FirebaseAuth
//    lateinit var etHotel: EditText
//    lateinit var db : FirebaseFirestore
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        auth = FirebaseAuth.getInstance()
//
//        etHotel = view.findViewById(R.id.hotelInputText)
//
//        view.nextHotelIDBtn?.setOnClickListener {
//            checkHotel()
//        }
//    }
//
//    private fun checkHotel() {
//        val hotelInput = etHotel.text.toString()
//
//        auth.signInWithEmailAndPassword(hotelInput).addOnCompleteListener(this) {
//            if (it.isSuccessful) {
//                Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
//
//                //once successful open up the main activity
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                finish()
//            } else
//                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
//        }
//    }
}
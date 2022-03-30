package com.example.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class PrivacyPolicyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        val fifthFragment=FifthFragment()

        val linkToTextView = findViewById<TextView>(R.id.txtTCLink)
        linkToTextView.movementMethod = LinkMovementMethod.getInstance()
/*
        when(btnBack){
            setCurrentFragment(fifthFragment)->R.id.btnBack
        }
*/
    }
/*
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
*/
}
package com.example.pollinationid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_privacy_policy.*
import org.w3c.dom.Text

class PrivacyPolicyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        val fifthFragment=FifthFragment()

        val linkToTextView = findViewById<TextView>(R.id.txtPrivPolicyHyperLink)
        linkToTextView.movementMethod = LinkMovementMethod.getInstance()

        when(btnBack){
            setCurrentFragment(fifthFragment)->R.id.btnBack
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

}
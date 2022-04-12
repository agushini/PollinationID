package com.example.pollinationid

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class PrivacyPolicyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        val fifthFragment=FifthFragment()


        val linkToTextView = findViewById<TextView>(R.id.txtContactsLink)
        linkToTextView.movementMethod = LinkMovementMethod.getInstance()
    }

}
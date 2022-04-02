package com.example.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgotpassword.*

class forgotpasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)

    btnSubmit.setOnClickListener {
         val email: String = etEmailAddress.text.toString().trim { it < ' ' }
 if (email.isEmpty()) {
 Toast.makeText(
     this,
     "Enter Email",Toast.LENGTH_SHORT).show()


 }

    }

}
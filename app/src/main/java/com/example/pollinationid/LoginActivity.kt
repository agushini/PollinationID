package com.example.pollinationid

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var tvRedirectSignUp: TextView
    private lateinit var etEmail: EditText
    private lateinit var etPass: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvForgotpassword: TextView


    // Creating firebaseAuth object
    private lateinit var auth: FirebaseAuth

    /*public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            

        }
    }*/

   /* private fun reload() {
        startActivity(Intent(this, LoginActivity::class.java))
    }*/
   var sp: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login2)

        if(sp?.getBoolean("logged",false) == true) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
   /*     else{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/

        // "login","no" means default string value is "no", so if you didn't set yes after login, it will be no as default
        // "login","no" means default string value is "no", so if you didn't set yes after login, it will be no as default

        auth = Firebase.auth

        // View Binding
        tvRedirectSignUp = findViewById(R.id.tvRedirectSignUp)
        btnLogin = findViewById(R.id.btnLogin)
        etEmail = findViewById(R.id.etEmail)
        etPass = findViewById(R.id.etPassword)
        tvForgotpassword = findViewById(R.id.tv_ForgotPassword)

        // initialising Firebase auth object
        auth = FirebaseAuth.getInstance()

        btnLogin.setOnClickListener {
            login()
        }

        tvRedirectSignUp.setOnClickListener {
            val intent = Intent(this, RegestrationActivity::class.java)
            startActivity(intent)
            // using finish() to end the activity
            finish()
        }

        //set click listener for the forgot password button
        tvForgotpassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }


        /*val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            // User is signed in
            val i = Intent(this, MainActivity::class.java)
//            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(i)
        } else {
            // User is signed out
//            startActivity(Intent(this, LoginActivity::class.java))
//                Log.v("SignOut Button", "Clicked")
            val intent = Intent(this, LoginActivity::class.java)
            this?.startActivity(intent)
        }*/

    }

    private fun login() {

        val email = etEmail.text.toString()
        val pass = etPass.text.toString()
        // calling signInWithEmailAndPassword(email, pass)
        // function using Firebase auth object
        // On successful response Display a Toast
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_SHORT).show()

                //once successful open up the main activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }



//        val firebaseAuth: FirebaseAuth
//        val mAuthListener: AuthStateListener
//        firebaseAuth = FirebaseAuth.getInstance()
//
//        mAuthListener = AuthStateListener {
//            val user = FirebaseAuth.getInstance().currentUser
//            if (user != null) {
//                val intent = Intent(this@LoginActivity, FirstFragment::class.java)
//                startActivity(intent)
//                finish()
//            }
//        }

    }
}

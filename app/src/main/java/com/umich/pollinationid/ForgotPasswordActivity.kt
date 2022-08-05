package edu.umich.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.umich.pollinationid.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgotpassword.*

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpassword)

        btnSubmit.setOnClickListener {
            val email: String = etEmailAddress.text.toString().trim { it <= ' ' }
            if (email.isEmpty()) {
                Toast.makeText(
                    this,
                    "Enter Email address", Toast.LENGTH_SHORT
                ).show()
            } else {
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this,
                                "Email sent successfully",
                                Toast.LENGTH_LONG
                            ).show()
                            finish()
                        } else {
                            Toast.makeText(
                                this,
                                task.exception!!.message.toString(), Toast.LENGTH_LONG
                            ).show()
                        }

                    }
            }

        }

    }
}
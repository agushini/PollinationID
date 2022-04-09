package com.example.pollinationid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.AuthStateListener
import kotlinx.android.synthetic.main.fragment_fifth.view.*

private val mAuthListener: AuthStateListener? = null
private val mAuth: FirebaseAuth? = null
class FifthFragment:Fragment(R.layout.fragment_fifth) {
   /* override fun onStop() {
        FirebaseAuth.getInstance().signOut();
        super.onStop()
        if (mAuthListener != null) {
            if (mAuth != null) {
                mAuth.removeAuthStateListener(mAuthListener)
            }
        }
    }*/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view: View = inflater!!.inflate(R.layout.fragment_fifth, container, false)

        view.btnSignOut.setOnClickListener { view ->
            Log.v("SignOut Button", "Clicked")
            val intent = Intent(activity, LoginActivity::class.java)
            activity?.startActivity(intent)
        }

        view.BtnPassReset.setOnClickListener { view ->
            Log.v("Reset Password Button", "Clicked")
            val intent = Intent(activity, ForgotPasswordActivity::class.java)
            activity?.startActivity(intent)
        }

        view.BtnPNProject.setOnClickListener { view ->
            Log.v("PolliNation Project Btn", "Clicked")
            val intent = Intent(activity, PolinationProjectActivity::class.java)
            activity?.startActivity(intent)
        }

        view.BtnPrivPolicy.setOnClickListener { view ->
            Log.v("Privacy Policy Button", "Clicked")
            val intent = Intent(activity, PrivacyPolicyActivity::class.java)
            activity?.startActivity(intent)
        }

        view.BtnTC.setOnClickListener { view ->
            Log.v("Terms & Conditions Btn", "Clicked")
            val intent = Intent(activity, TermsConditionsActivity::class.java)
            activity?.startActivity(intent)
        }

        view.BtnContact.setOnClickListener { view ->
            Log.v("Contact Button", "Clicked")
            val intent = Intent(activity, ContactsActivity::class.java)
            activity?.startActivity(intent)
        }

        return view
    }
}

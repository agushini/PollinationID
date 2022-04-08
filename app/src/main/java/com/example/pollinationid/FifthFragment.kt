package com.example.pollinationid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_fifth.view.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.android.synthetic.main.fragment_third.view.*


class FifthFragment:Fragment(R.layout.fragment_fifth) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        val view: View = inflater!!.inflate(R.layout.fragment_fifth, container, false)

        view.btnSignOut.setOnClickListener { view ->
            Log.v("SignOut Button", "Clicked")
            val intent = Intent(activity, RegestrationActivity::class.java)
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

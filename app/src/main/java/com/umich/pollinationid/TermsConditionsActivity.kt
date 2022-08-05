package edu.umich.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import edu.umich.pollinationid.R

class TermsConditionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_conditions)

        val fifthFragment=FifthFragment()

        val linkToTextView = findViewById<TextView>(R.id.txtContactsLink)
        linkToTextView.movementMethod = LinkMovementMethod.getInstance()
    }
}
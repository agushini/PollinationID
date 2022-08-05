package edu.umich.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import edu.umich.pollinationid.R

class PolinationProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polination_project)
        setupHyperlink()
    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.PoliProjectInfo4)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        val linkTextView1 = findViewById<TextView>(R.id.PoliProjectHyperLink)
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());
        val linkTextView2 = findViewById<TextView>(R.id.PoliProjectHyperLink2)
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
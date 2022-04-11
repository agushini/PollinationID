package com.example.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.pollinationid.IdFragment.NumberOfWingsFragment

class PollinatorIDKeyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pollinator_idactivity)

        val buttonOpen: Button = findViewById(R.id.wingTypeButton)
        buttonOpen.setOnClickListener {
            val numberOfWingsFragment = NumberOfWingsFragment()
            val fragment: Fragment? =

            supportFragmentManager.findFragmentByTag(NumberOfWingsFragment::class.java.simpleName)

            if (fragment !is NumberOfWingsFragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.linearLayoutPollinatorID, numberOfWingsFragment, NumberOfWingsFragment::class.java.simpleName)
                    .commit()
            }
            buttonOpen.visibility = View.GONE
        }

    }
}

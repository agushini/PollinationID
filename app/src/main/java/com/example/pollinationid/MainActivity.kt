package com.example.pollinationid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.FirebaseOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

import kotlinx.android.synthetic.main.activity_main.*
private lateinit var auth: FirebaseAuth


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth

        val firstFragment=FirstFragment()
        val secondFragment= SecondFragment()
        val thirdFragment=ThirdFragment()
        val fourthFragment=FourthFragment()
        val fifthFragment=FifthFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(firstFragment)
                R.id.book->setCurrentFragment(secondFragment)
                R.id.camera->setCurrentFragment(thirdFragment)
                R.id.map->setCurrentFragment(fourthFragment)
                R.id.menu->setCurrentFragment(fifthFragment)
            }
            true
        }

    }

    //this needs to be edited, i was trying to figure out how to change the action bar
    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
           /* if (fragment == FirstFragment()){
                supportActionBar?.title = "SECOND FRAGMENT";
            }
            else {
                supportActionBar?.title = "PollinationID";
            }*/

            commit()
        }



}


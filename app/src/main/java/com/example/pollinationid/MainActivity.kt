package com.example.pollinationid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Home Page";

        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
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
            if (fragment == FirstFragment()){
                supportActionBar?.title = "SECOND FRAGMENT";
            }
            else {
                supportActionBar?.title = "PollinationID";
            }

            commit()
        }

}


package com.example.pollinationid.IdFragment
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.pollinationid.PollinatorIDKeyActivity
import com.example.pollinationid.R
import com.example.pollinationid.databinding.FragmentSecondBinding
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_photo.*

class SecondFragment:Fragment(R.layout.fragment_second) {

    lateinit var checkHotelButton: Button
    lateinit var hotelId: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*checkHotelButton.setOnClickListener{
            hotelId = HotelIDInputPhoto.text.toString().uppercase() //get the input from the hotel text field

            if (hotelId != ""){
                val mFireStore = FirebaseFirestore.getInstance()
                val hotelRef = mFireStore.collection("Hotels").document(hotelId) //give it the hotel path

                hotelRef.get().addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val document = task.result
                        if(document != null) {
                            if (document.exists()) {
                                Log.i("PHOTO ACTIVITY", "Hotel exists.")
                                if (displayDate.text != ""){ //if date entered
                                    Log.i("PHOTO ACTIVITY","Date entered")
                                    Toast.makeText(
                                        this,
                                        "Valid Date and Hotel!",
                                        Toast.LENGTH_LONG
                                    ).show()

                                    Log.i("PHOTO ACTIVITY", "Before OuputGen Call")





                                }else{
                                    Log.i("Photo Activity", "Date not entered")
                                    Toast.makeText(
                                        this,
                                        "Please enter in a valid date",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            } else {
                                Log.e("Photo Activity", "Unexpected firebase input from documents. This message shouldn't show")
                            }
                        }
                    } else {
                        Toast.makeText(
                            this,
                            "Please enter in a valid hotel id",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }else{
                Toast.makeText(
                    this,
                    "Please enter in a valid hotel id",
                    Toast.LENGTH_LONG
                ).show()
            }
        }*/

        //button click to date and time page
        val bind = FragmentSecondBinding.inflate (layoutInflater)
        bind.dateAndTimeButton.setOnClickListener {
            val intent = Intent(this@SecondFragment.requireContext(), PollinatorIDKeyActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }

}
package edu.umich.pollinationid.IdFragment
import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import edu.umich.pollinationid.PollinatorIDKeyActivity
import edu.umich.pollinationid.R
import edu.umich.pollinationid.databinding.FragmentSecondBinding
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_photo.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment:Fragment(R.layout.fragment_second) {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var hotel = ""

        //button click to date and time page
        val bind = FragmentSecondBinding.inflate(layoutInflater)
        bind.dateAndTimeButton.setOnClickListener {
            Log.e("Second Fragment", "Check")
            Log.e("Second Fragment", "Button Clicked")

            hotel = DKHotelIDInput.text.toString().uppercase() //get the input from the hotel text field

            if (hotel != "") {
                val mFireStore = FirebaseFirestore.getInstance()
                val hotelRef =
                    mFireStore.collection("Hotels").document(hotel) //give it the hotel path

                hotelRef.get().addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val document = task.result
                        if (document != null) {
                            if (document.exists()) {

                                Log.i("Second Fragment", "Hotel exists.")
                                Toast.makeText(
                                    getActivity(),
                                    "Valid Hotel!",
                                    Toast.LENGTH_LONG
                                ).show()

                                Log.i("Second Fragment", hotel)

                                val intent = Intent(this@SecondFragment.requireContext(), PollinatorIDKeyActivity::class.java)
                                intent.putExtra("dkHotel", hotel)

                                startActivity(intent)

                            } else {
                                Toast.makeText(
                                    getActivity(),
                                    "Please enter in a valid hotel id",
                                    Toast.LENGTH_LONG
                                ).show()
                                Log.e("Second Fragment", "Unexpected firebase input from documents. This message shouldn't show")
                            }
                        }
                    }
                }

            } else {
                Toast.makeText(
                    getActivity(),
                    "Please enter in a valid hotel id",
                    Toast.LENGTH_LONG
                ).show()
                Log.e("Second Fragment", "Unexpected firebase input from documents. This message shouldn't show")
            }
        }
        return bind.root
    }
}
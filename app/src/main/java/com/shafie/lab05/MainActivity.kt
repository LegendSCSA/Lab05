package com.shafie.lab05

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shafie.lab05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //ActivityMain => Reverse of our activity name (MainActivity)
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            var pizzaSizePrice = 0.0 //type double
            var toppingsPrice = 0.0 //type double (implicit typing)

            //Hanya satu yg akan dipilih, kita gunakan when if else if

            when {
                //isCheck is the property to see if an item is selected
                binding.smallRadioBtn.isChecked -> pizzaSizePrice = 5.0
                binding.mediumRadioBtn.isChecked -> pizzaSizePrice = 7.0
                binding.largeRadioBtn.isChecked -> pizzaSizePrice = 10.0

            }

            //multiple toppings can be selected, if, (not else if else)
            if (binding.olivesBox.isChecked) {
                toppingsPrice += 2.0
            }
            if (binding.onionsBox.isChecked) {
                toppingsPrice += 1.0
            }
            if (binding.tomatoesBox.isChecked) {
                toppingsPrice += 3.0
            }

            binding.totalTextView.text = "Total price is RM ${pizzaSizePrice+toppingsPrice}"
        }


    }
}
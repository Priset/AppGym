package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.grupoe.runconcola.databinding.ActivityNutritionalTableBinding

class NutritionalTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNutritionalTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutritionalTableBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.optionChiken.setOnClickListener{
            Toast.makeText(this, "Deficit Calórico", Toast.LENGTH_SHORT).show()
        }
        binding.optionAvocado.setOnClickListener{
            Toast.makeText(this, "Superavit Calórico", Toast.LENGTH_SHORT).show()
        }
        binding.optionEgg.setOnClickListener{
            Toast.makeText(this, "Superavit Calórico", Toast.LENGTH_SHORT).show()
        }
        binding.optionBroccoli.setOnClickListener{
            Toast.makeText(this, "Deficit Calórico", Toast.LENGTH_SHORT).show()
        }
    }

}
package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.grupoe.runconcola.databinding.ActivityNutritionalTableBinding

class NutritionalTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNutritionalTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutritionalTableBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun superavit(view: View){
        Toast.makeText(this, "Superavit Calórico", Toast.LENGTH_LONG).show()

    }

    fun deficit(view: View) {
        Toast.makeText(this, "Deficit Calórico", Toast.LENGTH_LONG).show()
    }
}
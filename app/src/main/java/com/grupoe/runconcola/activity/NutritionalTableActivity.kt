package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityNutritionalTableBinding

class NutritionalTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNutritionalTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutritionalTableBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
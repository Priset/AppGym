package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.grupoe.runconcola.R
import com.grupoe.runconcola.databinding.ActivityAvailableOptionsBinding
import com.grupoe.runconcola.databinding.ActivityLoginBinding

class AvailableOptionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAvailableOptionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAvailableOptionsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun Leg(view: View) {
        val legview = Intent(this,SpecificExerciseActivity::class.java)
        startActivity(legview)
    }
}
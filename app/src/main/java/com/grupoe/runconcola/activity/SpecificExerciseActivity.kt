package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivitySpecificExerciseBinding

class SpecificExerciseActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpecificExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpecificExerciseBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
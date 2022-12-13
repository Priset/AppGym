package com.grupoe.runconcola.activity.legsActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityExerciseLegsBinding

class ExerciseLegsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseLegsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseLegsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
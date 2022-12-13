package com.grupoe.runconcola.activity.backActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityExerciseBackBinding

class ExerciseBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBackBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
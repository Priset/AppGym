package com.grupoe.runconcola.activity.chestActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityExerciseChestBinding


class ExerciseChestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseChestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseChestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
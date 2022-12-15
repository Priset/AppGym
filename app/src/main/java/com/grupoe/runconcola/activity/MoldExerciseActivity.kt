package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityMoldExerciseBinding

class MoldExerciseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMoldExerciseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoldExerciseBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExit.setOnClickListener {
            val intent = Intent(this,OptionsRecycleActivity::class.java)
            startActivity(intent)
        }
    }
}
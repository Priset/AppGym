package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityGymNotesBinding

class GymNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGymNotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGymNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupoe.runconcola.databinding.ActivityLoginBinding
import com.grupoe.runconcola.databinding.ActivityMainBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
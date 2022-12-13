package com.grupoe.runconcola.activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.grupoe.runconcola.R
import com.grupoe.runconcola.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_gym_notes.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonLogin.setOnClickListener{
            val intent  = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.buttonRegister.setOnClickListener{
            val intent  = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}
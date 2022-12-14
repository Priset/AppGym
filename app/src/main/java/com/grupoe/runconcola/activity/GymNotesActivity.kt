package com.grupoe.runconcola.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth
import com.grupoe.runconcola.R
import com.grupoe.runconcola.databinding.ActivityGymNotesBinding
import kotlinx.android.synthetic.main.activity_gym_notes.*

class GymNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGymNotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGymNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonAddNote.setOnClickListener{
            val intent  = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

        //Nico
        //setup()
    }

    // Nico
    /*
    private fun setup(){
        button_logout.setOnClickListener {
            //borrado de datos
            val prefs= getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
            prefs.clear()
            prefs.apply()
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
    override fun onBackPressed() {
        finishAffinity()
    }
    */


}
package com.grupoe.runconcola.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.grupoe.runconcola.R
import com.grupoe.runconcola.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_gym_notes.*
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()
        //Nico
        //session()
    }

        private fun setup(){
        button_to_options.setOnClickListener {
            if (edit_text_email_login.text.isNotEmpty() && edit_text_password_login.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(edit_text_email_login.text.toString(),
                    edit_text_password_login.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        showOptions()
                    }else {
                        alert()
                    }
                }
            }
        }
    }

    private  fun alert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Usuario o contraseña no válido")
        builder.setPositiveButton("aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showOptions(){
        val loginIntent = Intent(this,GymNotesActivity::class.java).apply {
        }
        startActivity(loginIntent)
    }

    //Nico
    /*
    private fun session(){
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        showOptions()
    }

    override fun onStart() {
        super.onStart()
        layout_login.visibility= View.VISIBLE
    }

     */

}


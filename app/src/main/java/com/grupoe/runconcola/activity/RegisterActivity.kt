package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isEmpty
import com.google.firebase.auth.FirebaseAuth
import com.grupoe.runconcola.databinding.ActivityMainBinding
import com.grupoe.runconcola.databinding.ActivityRegisterBinding
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.buttonRegister.setOnClickListener{
            val intent  = Intent(this, Login::class.java)
            startActivity(intent)
        }

        setup()
        emptyValues()
    }

    private fun setup(){
        button_register.setOnClickListener {
            if (edit_text_email.text.toString().isNotEmpty() && edit_text_password.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(edit_text_email.text.toString(),
                    edit_text_password.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(applicationContext, "Usuario registrado exitosamente", Toast.LENGTH_LONG).show()
                        showLogin()
                    }else {
                        alert()
                    }
                }
            }
        }
    }

private fun emptyValues(){
    button_register.setOnClickListener {
        if (edit_text_number.text.toString().isEmpty() && edit_text_age.text.toString().isEmpty() && edit_text_height.text.toString().isEmpty() &&
                edit_text_weight.text.toString().isEmpty()) {
            alert2()
        }
    }
}

    private  fun alert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se produjo un error de autenticación")
        builder.setPositiveButton("aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private  fun alert2(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Campos de registro incompletos")
        builder.setPositiveButton("aceptar",null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showLogin(){
        val loginIntent = Intent(this,Login::class.java).apply {
        }
        startActivity(loginIntent)
    }
}
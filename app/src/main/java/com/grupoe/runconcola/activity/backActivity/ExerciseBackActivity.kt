package com.grupoe.runconcola.activity.backActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.databinding.ActivityExerciseBackBinding

class ExerciseBackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseBackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBackBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExitBack.setOnClickListener {
            val intent = Intent(this, OptionsRecycleActivity::class.java)
            startActivity(intent)
        }
    }

    private fun descriptionBackOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("Hay que tener en cuenta un factor determinante antes " +
                "de hacer el ejercicio. Realizar el movimiento de forma correcta, " +
                "requiere de práctica y dedicación. No es un movimiento sencillo. " +
                "Te recomendamos, en unas primeras sesiones, hacerlo lentamente y " +
                "no excederte demasiado en las repeticiones. Una mala ejecución puede " +
                "derivar en alguna lesión o contractura en la espalda.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionBackOne(view: View){
        val desc1 = descriptionBackOne()
    }
}
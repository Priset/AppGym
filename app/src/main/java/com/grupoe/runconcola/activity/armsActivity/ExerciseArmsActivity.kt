package com.grupoe.runconcola.activity.armsActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.activity.activity_AvailableOptions
import com.grupoe.runconcola.databinding.ActivityExerciseArmsBinding

class ExerciseArmsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseArmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseArmsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExit.setOnClickListener {
            val intent = Intent(this,activity_AvailableOptions::class.java)
            startActivity(intent)
        }
    }

    fun exerciseTwo(view: View) {
        val armsTwo = Intent(this,ArmsTwoFragment::class.java)
        startActivity(armsTwo)
    }

    fun exerciseTwoBack(view: View) {
        val armsTwo = Intent(this,ExerciseArmsActivity::class.java)
        startActivity(armsTwo)
    }

    private fun descritionArms(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("Para ejecutarlo simplemente colocamos la polea en la posición más elevada  " +
                "con el accesorio de la cuerda y, con las piernas ligeramente flexionadas y la espalda recta, " +
                "sujetamos ambos extremos con cada mano. Comenzamos con los brazos en un ángulo de 90º y los " +
                "estiramos por completo quedando estos al lado del cuerpo. Luego volvemos a la posición anterior " +
                "para terminar una repetición.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionArmosOne(view: View){
        val desc1 = descritionArms()
    }

}
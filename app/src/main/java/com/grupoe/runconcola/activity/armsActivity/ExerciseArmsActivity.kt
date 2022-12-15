package com.grupoe.runconcola.activity.armsActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.dataClasses.Exercise
import com.grupoe.runconcola.databinding.ActivityExerciseArmsBinding

class ExerciseArmsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseArmsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseArmsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExitArms.setOnClickListener {
            val intent = Intent(this,OptionsRecycleActivity::class.java)
            startActivity(intent)
        }
    }

    fun exerciseTwo(view: View) {
        //setDataExercise(Exercise("Brazos",))
    }

    /*
    fun exerciseTwoBack(view: View) {
        val armsTwoBack = Intent(this,ExerciseArmsActivity::class.java)
        startActivity(armsTwoBack)
    }

     */

    private fun descriptionArmsOne(){
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

    fun clickDescriptionArmsOne(view: View){
        val desc1 = descriptionArmsOne()
    }

    fun setDataExercise(data: Exercise){
        binding.armsOne.text = data.title_exercise
        binding.armsImageOne.setImageResource(data.image_exercise)
        binding.armsExerciseOne.text = data.type_exercise
        binding.numSetsArms.text = data.number_sets
        binding.numRepetitionArms.text = data.number_repetitions
        binding.showDescriptionArms.text = data.how_do
    }
}
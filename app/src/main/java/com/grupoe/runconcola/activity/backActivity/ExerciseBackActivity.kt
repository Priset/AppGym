package com.grupoe.runconcola.activity.backActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.R
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.dataClasses.Exercise
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

        var contador = 0
        binding.buttonNextBack.setOnClickListener {
            val lista = listBack()
            setDataExercise(lista[contador])
            contador++
            if (contador == lista.size)
                contador = 0
        }
    }

    fun listBack():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Espalda", R.drawable.back2, "Remo con barra", "3 series", "6-8 repeticiones"),
            Exercise("Espalda", R.drawable.back3, "Remo con mancuerna", "3 series", "10-12 repeticiones"),
            Exercise("Espalda", R.drawable.back4, "Jalon al pecho", "3 series", "15 repeticiones"),
            Exercise("Espalda", R.drawable.back5, "Encogimientos", "3 series", "15 repeticiones"),
            Exercise("Espalda", R.drawable.back6, "Pull Over con mancuerna", "2 series", "12 repeticiones")
        )
        return mutableList
    }

    private fun descriptionBackOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("El desarrollo de una espalda ancha y voluminosa " +
                "puede mejorar enormemente tu aspecto físico. Para conseguirla, " +
                "tendrás que atacar la espalda con una serie de ejercicios para " +
                "espalda enfocados a ciertos músculos.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionBackOne(view: View){
        val desc1 = descriptionBackOne()
    }

    fun setDataExercise(data: Exercise){
        binding.backOne.text = data.title_exercise
        binding.backImageOne.setImageResource(data.image_exercise)
        binding.backExerciseOne.text = data.type_exercise
        binding.numSetsBack.text = data.number_sets
        binding.numRepetitionBack.text = data.number_repetitions
    }
}
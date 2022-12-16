package com.grupoe.runconcola.activity.armsActivity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.grupoe.runconcola.R
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

        var contador = 0
        binding.buttonNextArms.setOnClickListener {
            val lista = listArm()
            setDataExercise(lista[contador])
            contador++
            if (contador == lista.size){
                  contador = 0
            }
        }
    }

    fun listArm():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Brazos", R.drawable.arms2, "Curl de Bicep con Barra", "3 series", "12 repeticiones"),
            Exercise("Brazos", R.drawable.arms3, "Fondos Triceps", "3 series", "8-12 repeticiones"),
            Exercise("Brazos", R.drawable.arms4, "Curl de Bicep con mancuerna", "3 series", "12 repeticiones"),
            Exercise("Brazos", R.drawable.arms5, "Press de hombro", "3 series", "12 repeticiones")
        )
        return mutableList
    }


    private fun descriptionArmsOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("En este entrenamiento además vamos a hacer dos superseries " +
                "en las que vamos a combinar el trabajo de bíceps y tríceps e intentar " +
                "descansar lo menos posible para conseguir esa sensación de sobrecarga que " +
                "buscamos. Por tanto, los primeros cuatro ejercicios del entrenamiento a " +
                "continuación los hacemos en grupos de dos y sin descanso entre ellos.")
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
    }
}
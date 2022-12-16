package com.grupoe.runconcola.activity.chestActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.R
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.dataClasses.Exercise
import com.grupoe.runconcola.databinding.ActivityExerciseChestBinding


class ExerciseChestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseChestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseChestBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExitChest.setOnClickListener {
            val intent = Intent(this, OptionsRecycleActivity::class.java)
            startActivity(intent)
        }

        var contador = 0
        binding.buttonNextChest.setOnClickListener {
            val lista = listChest()
            setDataExercise(lista[contador])
            contador++
            if (contador == lista.size)
                contador = 0
        }
    }

    fun listChest():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Pecho", R.drawable.chest1, "Press de banca", "3 series", "12 repeticiones"),
            Exercise("Pecho", R.drawable.chest2, "Press inclinado", "3 series", "9-12 repeticiones"),
            Exercise("Pecho", R.drawable.chest3, "Apertura con mancuernas", "3 series", "10-12 repeticiones"),
            Exercise("Pecho", R.drawable.chest4, "Fondos en paralelas", "3 series", "12-14 repeticiones"),
            Exercise("Pecho", R.drawable.chest5, "Cruce con poleas", "3 series", "12-14 repeticiones"),
            Exercise("Pecho", R.drawable.chest6, "Press declinado", "3 series", "9-12 repeticiones")
        )
        return mutableList
    }

    private fun descriptionChestOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("Túmbate en un banco plano. En el bench press, los hombros " +
                "se echan hacia atrás y al mismo tiempo se crea una pequeña lordosis. " +
                "La línea que se prolonga entre los hombros y el comienzo de las vértebras " +
                "lumbares debe estar apoyada en el banco. Por debajo del extensor dorsal " +
                "inferior se debe poder extender un brazo. La cabeza queda apoyada sobre el " +
                "banco y los ojos se fijan en la barra, mientras que las piernas se colocan " +
                "firmes en el suelo formando un ángulo de 90°.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionChestOne(view: View){
        val desc1 = descriptionChestOne()
    }

    fun setDataExercise(data: Exercise){
        binding.chestOne.text = data.title_exercise
        binding.chestImageOne.setImageResource(data.image_exercise)
        binding.chestExerciseOne.text = data.type_exercise
        binding.numSetsChest.text = data.number_sets
        binding.numRepetitionChest.text = data.number_repetitions
    }

}
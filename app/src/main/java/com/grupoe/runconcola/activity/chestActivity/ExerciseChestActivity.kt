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
        builder.setMessage("Probad a utilizar el mayor peso posible con una buena ejecución " +
                "y concentraos siempre en activar todas las fibras musculares. Apretad en cada " +
                "contracción como si el pecho fuera una esponja y le quisierais extraer el agua. " +
                "El pecho necesita movimientos potentes y controlados. El control de la fase " +
                "excéntrica (negativa) resulta esencial para atacar al mayor número de fibras, " +
                "lo mismo que los movimientos explosivos (concéntricos) de subida, intentando " +
                "usar el máximo peso posible.")
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
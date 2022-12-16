package com.grupoe.runconcola.activity.legsActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.R
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.dataClasses.Exercise
import com.grupoe.runconcola.databinding.ActivityExerciseLegsBinding

class ExerciseLegsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseLegsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseLegsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExitLegs.setOnClickListener {
            val intent = Intent(this, OptionsRecycleActivity::class.java)
            startActivity(intent)
        }

        var contador = 0
        binding.buttonNextLegs.setOnClickListener {
            val lista = listLegs()
            setDataExercise(lista[contador])
            contador++
            if (contador == lista.size)
                contador = 0
        }
    }

    fun listLegs() :List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Piernas", R.drawable.legs2, "Prensa cuadriceps", "5 series", "10 repeticiones"),
            Exercise("Piernas", R.drawable.legs3, "Curl de femoral", "3 series", "10-12 repeticiones"),
            Exercise("Piernas", R.drawable.legs4, "Zancadas con mancuerna", "4 series", "20 repeticiones"),
            Exercise("Piernas", R.drawable.legs5, "Elevaciones de gemelos", "4 series", "15 repeticiones"),
            Exercise("Piernas", R.drawable.legs6, "Front Squad", "4 series", "6-8 repeticiones")
        )
        return mutableList
    }

    private fun descriptionLegsOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("Realiza series de aproximación para los ejercicios " +
                "con los que vayas a comenzar tu rutina si son grupos musculares " +
                "diferentes. Usamos los ejercicios multiarticulares para cargar más " +
                "peso y dado que la mayor parte son con peso libre, vas a necesitar " +
                "ser un master en la técnica antes de comenzar a subirle discos " +
                "a la barra. Es fundamental sentir como se activan tus músculos durante " +
                "el recorrido del movimiento. Te va a mantener alejado de lesiones y " +
                "va a aumentar el desarrollo muscular notablemente.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionLegsOne(view: View){
        val desc1 = descriptionLegsOne()
    }

    fun setDataExercise(data: Exercise){
        binding.legsOne.text = data.title_exercise
        binding.legsImageOne.setImageResource(data.image_exercise)
        binding.legsExerciseOne.text = data.type_exercise
        binding.numSetsLegs.text = data.number_sets
        binding.numRepetitionLegs.text = data.number_repetitions
    }
}
package com.grupoe.runconcola.activity.chestActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.activity.OptionsRecycleActivity
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
}
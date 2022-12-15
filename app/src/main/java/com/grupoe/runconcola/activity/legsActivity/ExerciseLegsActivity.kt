package com.grupoe.runconcola.activity.legsActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.grupoe.runconcola.activity.OptionsRecycleActivity
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
    }

    private fun descriptionLegsOne(){
        val builder= AlertDialog.Builder(this)
        builder.setTitle("¿Como hacerlo?")
        builder.setMessage("Para realizar correctamente una sentadilla con barra, " +
                "no solo debemos prestar atención a la posición, sino también al " +
                "movimiento. Aunque mucha gente piensa que se trata de un movimiento " +
                "vertical al levantar el cuerpo, esto no es del todo así. La barra " +
                "también debe moverse con cierto ángulo mientras se realiza la sentadilla.")
        builder.setPositiveButton("Entendido!",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }

    fun clickDescriptionLegsOne(view: View){
        val desc1 = descriptionLegsOne()
    }
}
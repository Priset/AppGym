package com.grupoe.runconcola.activity

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.grupoe.runconcola.R
import com.grupoe.runconcola.adapter.AvailableOptionsAdapter
import com.grupoe.runconcola.dataClasses.Exercise
import com.grupoe.runconcola.dataClasses.Muscle
import com.grupoe.runconcola.databinding.ActivityOptionsRecycleBinding

class OptionsRecycleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOptionsRecycleBinding

    private val availableOptionsAdapter by lazy { AvailableOptionsAdapter() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOptionsRecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecyclerView()
    }
    fun listArm():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Brazos", R.drawable.arms1, "Extensiones de Tricep", "3 series","12 repeticiones"),
            Exercise("Brazo", R.drawable.arms2, "Curl de Bicep con Barra", "3 series", "12 repeticiones"),
        )
        return mutableList
    }
    fun listChest():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Pecho", R.drawable.chest1, "Press de banca", "3 series", "12 repeticiones")
        )
        return mutableList
    }
    fun listBack():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Espelade", R.drawable.back1, "Peso Muerto", "3 sets", "6-8 repeticiones")
        )
        return mutableList
    }
    fun listLeg() :List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Pierna", R.drawable.legs1, "Sentadilla con Barra", "4 series", "6-8 repeticiones")
        )
        return mutableList
    }
    /*fun listTableNut():List<>{
        val mutableList = mutableListOf<>(

        )
    }
    */

    fun setRecyclerView(){
        val mutablelist = mutableListOf<Muscle>(
            Muscle("Pierna", R.drawable.pierna_day, listLeg()),
            Muscle("Brazo", R.drawable.arm_exercises, listArm()),
            Muscle("Pecho", R.drawable.chest_day, listChest()),
            Muscle("Espalda", R.drawable.back_day, listBack()),
          //  Muscle("Tabla Nutricional", R.drawable.nutritional_table),
           // Muscle("Gym Notes",R.drawable.gymnotes) //share references

        )




        availableOptionsAdapter.addOptions(mutablelist)

        binding.recyclerExercise.apply{
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = availableOptionsAdapter
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }

}
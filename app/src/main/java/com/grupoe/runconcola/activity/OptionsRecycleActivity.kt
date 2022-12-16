package com.grupoe.runconcola.activity

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.R
import com.grupoe.runconcola.adapter.AvailableOptionsAdapter
import com.grupoe.runconcola.dataClasses.Exercise
import com.grupoe.runconcola.dataClasses.Food
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



    fun setRecyclerView(){
        val mutablelist = mutableListOf<Muscle>(
            Muscle("Pierna", R.drawable.pierna_day),
            Muscle("Brazo", R.drawable.arm_exercises),
            Muscle("Pecho", R.drawable.chest_day),
            Muscle("Espalda", R.drawable.back_day),
            Muscle("Tabla Nutricional", R.drawable.nutritional_table),
            Muscle("Gym Notes",R.drawable.gymnotes) //share references

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
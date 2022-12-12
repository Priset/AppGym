package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.grupoe.runconcola.R
import com.grupoe.runconcola.adapter.AvailableOptionsAdapter
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
        val mutablelist = mutableListOf<String>()
        mutablelist.add("Pierna")
        mutablelist.add("Brazo")
        mutablelist.add("Pecho")
        mutablelist.add("Espalda")
        mutablelist.add("Tabla Nutricional")
        mutablelist.add("Gym Notes")

        availableOptionsAdapter.addOptions(mutablelist)

        binding.recyclerExercise.apply{
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = availableOptionsAdapter
        }
    }



}
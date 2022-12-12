package com.grupoe.runconcola.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.databinding.ActivityAvailableOptionsBinding

class AvailableOptionsAdapter: RecyclerView.Adapter<AvailableOptionsAdapter.AvailableOptionsActivityViewHolder>() {
    private val availableOptions = mutableListOf<String>()//

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AvailableOptionsActivityViewHolder =
        AvailableOptionsActivityViewHolder(
            ActivityAvailableOptionsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    override fun onBindViewHolder(holder: AvailableOptionsActivityViewHolder, position: Int){
        holder.binding(availableOptions[position])
    }
    override fun getItemCount(): Int = availableOptions.size

    inner class AvailableOptionsActivityViewHolder(private val binding: ActivityAvailableOptionsBinding):
    RecyclerView.ViewHolder(binding.root){
        fun binding(data: String){
            binding.exerciseName.text = data
        }
    }


        fun addOptions(list: List<String>){
            availableOptions.clear()
            availableOptions.addAll(list)
        }
}


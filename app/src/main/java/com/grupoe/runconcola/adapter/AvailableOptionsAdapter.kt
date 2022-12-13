package com.grupoe.runconcola.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.dataClasses.Muscle
import com.grupoe.runconcola.databinding.ActivityAvailableOptionsBinding

class AvailableOptionsAdapter: RecyclerView.Adapter<AvailableOptionsAdapter.AvailableOptionsActivityViewHolder>() {
    private val availableOptions = mutableListOf<Muscle>()//

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
        fun binding(data: Muscle){
            binding.exerciseName.text = data.type
            binding.legDay.setImageResource(data.image)

        }
    }


        fun addOptions(list: MutableList<Muscle>){
            availableOptions.clear()
            availableOptions.addAll(list)
        }
}


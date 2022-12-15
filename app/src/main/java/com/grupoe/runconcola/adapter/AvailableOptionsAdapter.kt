package com.grupoe.runconcola.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.activity.GymNotesActivity
import com.grupoe.runconcola.activity.NutritionalTableActivity
import com.grupoe.runconcola.activity.OptionsRecycleActivity
import com.grupoe.runconcola.activity.armsActivity.ExerciseArmsActivity
import com.grupoe.runconcola.activity.backActivity.ExerciseBackActivity
import com.grupoe.runconcola.activity.chestActivity.ExerciseChestActivity
import com.grupoe.runconcola.activity.legsActivity.ExerciseLegsActivity
import com.grupoe.runconcola.dataClasses.Muscle
import com.grupoe.runconcola.databinding.ItemAvailableOptionsBinding

class AvailableOptionsAdapter: RecyclerView.Adapter<AvailableOptionsAdapter.AvailableOptionsActivityViewHolder>() {
    private val availableOptions = mutableListOf<Muscle>()
    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):AvailableOptionsActivityViewHolder {
        context = parent.context
        return AvailableOptionsActivityViewHolder(
            ItemAvailableOptionsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: AvailableOptionsActivityViewHolder, position: Int){
        holder.binding(availableOptions[position])
    }
    override fun getItemCount(): Int = availableOptions.size

    inner class AvailableOptionsActivityViewHolder(private val binding: ItemAvailableOptionsBinding):
    RecyclerView.ViewHolder(binding.root){
        fun binding(data: Muscle){
            binding.exerciseName.text = data.type
            binding.itemOption.setImageResource(data.image)
            binding.card1.setOnClickListener{

                lateinit var intent:Intent
                when (absoluteAdapterPosition) {
                    0 -> intent = Intent(context,ExerciseLegsActivity::class.java)
                    1 -> intent = Intent(context,ExerciseArmsActivity::class.java)
                    2 -> intent = Intent(context,ExerciseBackActivity::class.java)
                    3 -> intent = Intent(context,ExerciseChestActivity::class.java)
                    4 -> intent = Intent(context,NutritionalTableActivity::class.java)
                    5 -> intent = Intent(context,GymNotesActivity::class.java)


                }
                context?.startActivity(intent)
            }

        }
    }

        fun addOptions(list: MutableList<Muscle>){
            availableOptions.clear()
            availableOptions.addAll(list)
        }
}


package com.grupoe.runconcola.activity
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
            Exercise("Brazos", R.drawable.arms1, "Extensiones de Triceps", "3 series","12 repeticiones"),
            Exercise("Brazos", R.drawable.arms2, "Curl de Bicep con Barra", "3 series", "12 repeticiones"),
            Exercise("Brazos", R.drawable.arms3, "Fondos Triceps", "3 series", "8-12 repeticiones"),
            Exercise("Brazos", R.drawable.arms4, "Curl de Bicep con mancuerna", "3 series", "12 repeticiones"),
            Exercise("Brazos", R.drawable.arms5, "Press de hombro", "3 series", "12 repeticiones")
        )
        return mutableList
    }
    fun listChest():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Pecho", R.drawable.chest1, "Press de banca", "3 series", "12 repeticiones"),
            Exercise("Pecho", R.drawable.chest2, "Press inclinado", "3 series", "9-12 repeticiones"),
            Exercise("Pecho", R.drawable.chest3, "Apertura con mancuernas", "3 series", "10-12 repeticiones"),
            Exercise("Pecho", R.drawable.chest4, "Fondos en paralelas", "3 series", "12-14 repeticiones"),
            Exercise("Pecho", R.drawable.chest5, "Cruce con poleas", "3 series", "12-14 repeticiones"),
            Exercise("Pecho", R.drawable.chest6, "Press declinado", "3 series", "9-12 repeticiones")
        )
        return mutableList
    }
    fun listBack():List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Espalda", R.drawable.back1, "Peso muerto", "3 sets", "6-8 repeticiones"),
            Exercise("Espalda", R.drawable.back2, "Remo con barra", "3 sets", "6-8 repeticiones"),
            Exercise("Espalda", R.drawable.back3, "Remo con mancuerna", "3 sets", "10-12 repeticiones"),
            Exercise("Espalda", R.drawable.back4, "Jalon al pecho", "3 sets", "15 repeticiones"),
            Exercise("Espalda", R.drawable.back5, "Encogimientos", "3 sets", "15 repeticiones"),
            Exercise("Espalda", R.drawable.back6, "Pull Over con mancuerna", "2 sets", "12 repeticiones")
        )
        return mutableList
    }
    fun listLeg() :List<Exercise>{
        val mutableList = mutableListOf<Exercise>(
            Exercise("Pierna", R.drawable.legs1, "Back Squad", "4 series", "6-8 repeticiones"),
            Exercise("Pierna", R.drawable.legs2, "Prensa cuadriceps", "5 series", "10 repeticiones"),
            Exercise("Pierna", R.drawable.legs3, "Curl de femoral", "3 series", "10-12 repeticiones"),
            Exercise("Pierna", R.drawable.legs4, "Zancadas con mancuerna", "4 series", "20 repeticiones"),
            Exercise("Pierna", R.drawable.legs5, "Elevaciones de gemelos", "4 series", "15 repeticiones"),
            Exercise("Pierna", R.drawable.legs6, "Front Squad", "4 series", "6-8 repeticiones")
        )
        return mutableList
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
package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.grupoe.runconcola.R
import com.grupoe.runconcola.adapter.NotesAdapter
import com.grupoe.runconcola.dataClasses.Notes
import com.grupoe.runconcola.databinding.ActivityGymNotesBinding

class GymNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGymNotesBinding

    val mutablelist = mutableListOf<Notes>()

    private val notesAdapter by lazy { NotesAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGymNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dateInput: TextView = findViewById(R.id.text_date)
        val descriptionInput: TextView = findViewById(R.id.text_description)

        binding.buttonAddNote.setOnClickListener {
            Toast.makeText(applicationContext, "Nota guardada exitosamente", Toast.LENGTH_SHORT)
                .show()

            val date: String = dateInput.text.toString()
            val description: String = descriptionInput.text.toString()
            val note = Notes(date, description)

            mutablelist.add(note)
            notesAdapter.addOptions(mutablelist)
            dateInput.setText("")
            descriptionInput.setText("")
            setRecyclerView()
        }
    }

    fun setRecyclerView() {
        binding.notesRecycler.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = notesAdapter
        }
    }
}


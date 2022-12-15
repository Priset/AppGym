package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.grupoe.runconcola.adapter.NotesAdapter
import com.grupoe.runconcola.dataClasses.Notes
import com.grupoe.runconcola.databinding.ActivityGymNotesBinding

class GymNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGymNotesBinding

    private val notesAdapter by lazy { NotesAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGymNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonAddNote.setOnClickListener{
            val intent  = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

        setRecyclerView()
    }

    fun setRecyclerView(){
        val mutablelist = mutableListOf<Notes>(
            Notes("XXYYZZ", "Nueva Nota")
        )

        notesAdapter.addOptions(mutablelist)

        binding.notesRecycler.apply{
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = notesAdapter
        }
    }
}
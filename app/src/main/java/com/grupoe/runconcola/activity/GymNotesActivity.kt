package com.grupoe.runconcola.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.grupoe.runconcola.R
import com.grupoe.runconcola.adapter.NotesAdapter
import com.grupoe.runconcola.dataClasses.Notes
import com.grupoe.runconcola.databinding.ActivityGymNotesBinding

class GymNotesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGymNotesBinding
    // private lateinit var preference: SharedPreferences

    val mutablelist = mutableListOf<Notes>()

    private val notesAdapter by lazy { NotesAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGymNotesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dateInput: EditText = findViewById(R.id.text_date)
        val descriptionInput: EditText = findViewById(R.id.text_description)

        binding.buttonAddNote.setOnClickListener {
            val date: String = dateInput.text.toString()
            val description: String = descriptionInput.text.toString()
            val note = Notes(date, description)
            Toast.makeText(applicationContext, "Nota guardada exitosamente", Toast.LENGTH_LONG).show()


            mutablelist.add(note)
            notesAdapter.addOptions(mutablelist)
            dateInput.setText("")
            descriptionInput.setText("")
            setRecyclerView()

            /*
val id = "Notes"
preference = PreferenceManager.getDefaultSharedPreferences(this)
    val editor = preference.edit()
    editor.putString(id, dateInput.text.toString())
    editor.putString(id, descriptionInput.text.toString())
    editor.apply()

 */
/*
            val pref = getSharedPreferences(note.toString(), Context.MODE_PRIVATE)
            val editor = pref.edit()
            editor.putString("date", dateInput.text.toString())
            editor.putString("description", descriptionInput.text.toString())
            editor.commit()
            Toast.makeText(applicationContext, "Las Notas se guardaron", Toast.LENGTH_LONG).show()

 */

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
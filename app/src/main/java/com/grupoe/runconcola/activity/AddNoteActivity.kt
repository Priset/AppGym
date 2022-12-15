package com.grupoe.runconcola.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.grupoe.runconcola.R
import com.grupoe.runconcola.dataClasses.Notes
import com.grupoe.runconcola.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val dateInput: EditText = findViewById(R.id.text_date)
        val descriptionInput: EditText = findViewById(R.id.text_description)
        val saveButton: AppCompatButton = findViewById(R.id.button_save_note)

        saveButton.setOnClickListener{
            val date: String = dateInput.text.toString()
            val description: String = descriptionInput.text.toString()

            Notes(date,description)
            Toast.makeText(applicationContext, "Nota guardada exitosamente", Toast.LENGTH_LONG).show()
            finish()
        }
    }

}
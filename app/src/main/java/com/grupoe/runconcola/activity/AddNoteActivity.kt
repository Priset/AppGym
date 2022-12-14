package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.auth.FirebaseAuth
import com.grupoe.runconcola.R
import com.grupoe.runconcola.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var dateInput: EditText = findViewById(R.id.text_date)
        var descriptionInput: EditText = findViewById(R.id.text_description)
        var saveButton: AppCompatButton = findViewById(R.id.button_save_note)

        saveButton.setOnClickListener{
            var date: String = dateInput.text.toString()
            var description: String = descriptionInput.text.toString()
            var createdTime: Long = System.currentTimeMillis()

            Toast.makeText(applicationContext, "Nota guardada exitosamente", Toast.LENGTH_LONG).show()
            finish()
        }
    }

}
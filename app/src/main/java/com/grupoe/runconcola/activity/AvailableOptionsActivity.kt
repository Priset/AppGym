package com.grupoe.runconcola.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.grupoe.runconcola.R

class AvailableOptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_available_options)
    }

    fun Leg(view: View) {
        val legview = Intent(this,SpecificExerciseActivity::class.java)
        startActivity(legview)
    }
}
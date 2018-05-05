package com.example.irmablanco.appofthrones

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button

class CharactersActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        val button: Button = findViewById(R.id.button_character)
        button.setOnClickListener{
            val intent: Intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)

        }
    }
}
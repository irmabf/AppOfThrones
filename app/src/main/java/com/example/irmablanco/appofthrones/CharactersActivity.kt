package com.example.irmablanco.appofthrones

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Button

class CharactersActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

<<<<<<< HEAD
        val list: RecyclerView = findViewById(R.id.list)

        list.layoutManager = LinearLayoutManager(this)

        val characters: MutableList<Character> = CharactersRepo.characters


=======
        val characters: MutableList<Character> = CharactersRepo.characters
        Log.v("CharactersActivity", "${characters.size}")
>>>>>>> Add characters repo with singleton model

    }

    fun showDetails(button: View) {
        val intent: Intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}
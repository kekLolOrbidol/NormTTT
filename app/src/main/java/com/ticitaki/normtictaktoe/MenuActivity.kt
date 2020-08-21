package com.xoox.memorama

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ticitaki.normtictaktoe.MainActivity
import com.ticitaki.normtictaktoe.R


class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun selectGame(view: View){
        if(view.id == R.id.tic){
            val ticIntent = Intent(this, MainActivity::class.java).apply {
                putExtra("name", "Tic Tac Toe")
            }
            startActivity(ticIntent)
        } else if (view.id == R.id.memorama) {
            val ticIntent = Intent(this, MainActivity::class.java).apply {
                putExtra("name", "Memorama")
            }
            startActivity(ticIntent)
        }
    }
}

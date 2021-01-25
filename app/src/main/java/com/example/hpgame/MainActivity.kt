package com.example.hpgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var board: RecyclerView
    private lateinit var numMoves: TextView
    private lateinit var numPairs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = findViewById(R.id.board_recyclerview);
        numMoves = findViewById(R.id.moves_textview);
        numPairs = findViewById(R.id.pairs_textview);

        


    }
}
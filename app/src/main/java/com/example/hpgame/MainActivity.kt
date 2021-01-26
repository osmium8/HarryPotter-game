package com.example.hpgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hpgame.models.BoardSize
import com.example.hpgame.models.MemoryCard
import com.example.hpgame.models.MemoryGame
import com.example.hpgame.utils.DEFAULT_ICONS

class MainActivity : AppCompatActivity() {

    private lateinit var board: RecyclerView
    private lateinit var numMoves: TextView
    private lateinit var numPairs: TextView

    private var boardSize : BoardSize = BoardSize.EASY;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = findViewById(R.id.board_recyclerview);
        numMoves = findViewById(R.id.moves_textview);
        numPairs = findViewById(R.id.pairs_textview);

        val memoryGame : MemoryGame = MemoryGame(boardSize);

        board.adapter = MemoryBoardAdapter(this, boardSize, memoryGame.cards, object : MemoryBoardAdapter.CardClickListener {
            override fun onCardClicked(position: Int) {
                Log.i("MainActivity", "Card clicked $position")
            }
        });
        board.setHasFixedSize(true);
        board.layoutManager = GridLayoutManager(this, boardSize.getWidth());


    }
}
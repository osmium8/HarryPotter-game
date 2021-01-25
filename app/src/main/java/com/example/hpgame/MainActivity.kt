package com.example.hpgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hpgame.models.BoardSize
import com.example.hpgame.utils.DEFAULT_ICONS

class MainActivity : AppCompatActivity() {

    private lateinit var board: RecyclerView
    private lateinit var numMoves: TextView
    private lateinit var numPairs: TextView

    private var boardSize : BoardSize = BoardSize.HARD;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = findViewById(R.id.board_recyclerview);
        numMoves = findViewById(R.id.moves_textview);
        numPairs = findViewById(R.id.pairs_textview);

        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs());
        val randomizedImages = (chosenImages + chosenImages).shuffled()

        board.adapter = MemoryBoardAdapter(this, boardSize, randomizedImages);
        board.setHasFixedSize(true);
        board.layoutManager = GridLayoutManager(this, boardSize.getWidth());


    }
}
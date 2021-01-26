package com.example.hpgame.models

import com.example.hpgame.utils.DEFAULT_ICONS

/**
    1. Represents state of a game
    2. contains logic to populate list of cards in MainActivity
    3.
 **/

class MemoryGame(private val boardSize: BoardSize) {

    val cards: List<MemoryCard>
    var numPairsFound = 0

    init {
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs());
        val randomizedImages: List<Int> = (chosenImages + chosenImages).shuffled()
        cards = randomizedImages.map{ MemoryCard(it) }
    }
}


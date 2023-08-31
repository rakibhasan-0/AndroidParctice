package com.example.dicebutton

class Dice (val numOfSlides: Int){

    fun rollDice(): Int {
        return (1..6).random()
    }
}
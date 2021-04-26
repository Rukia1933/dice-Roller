package com.example.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {

    /**
     * This method is called when the Activity is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)
        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener {
            rollDice()
        }
        val rollButton3: Button = findViewById(R.id.button3)
        rollButton3.setOnClickListener {
            rollDice1()
        }
        val rollButton4: Button = findViewById(R.id.button4)
        rollButton4.setOnClickListener {
            rollDice2()
        }
        val rollButton5: Button = findViewById(R.id.button5)
        rollButton5.setOnClickListener {
            rollDice3()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice1() {
        val dice = Dice(8)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice2() {
        val dice = Dice(10)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice3() {
        val dice = Dice(20)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 * Dice with a fixed number of sides.
 */
class Dice(val numSides: Int) {
    /**
     * Do a random dice roll and return the result.
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}

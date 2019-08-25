package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Welcome, You're always a winner", Toast.LENGTH_LONG).show()
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }



    private fun rollDice() {
       val diceText : TextView = findViewById(R.id.dice_text)
        val randomInt = Random().nextInt(6) + 1
        diceText.text = randomInt.toString()

        val rolled = when(randomInt) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(rolled)

    }
}

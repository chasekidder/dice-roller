package com.example.android.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create a button variable that corresponds with the roll button
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.text = "Let's Roll"

        //Create a click listener on the roll button
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {

        //val resultText: TextView = findViewById(R.id.result_text)

        val randInt = Random().nextInt(6) + 1


        val drawableResource = when (randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //resultText.text = randInt.toString()



        diceImage.setImageResource(drawableResource)


    }
}

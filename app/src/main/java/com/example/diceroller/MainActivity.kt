package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //rather than using findviewbyid, use lateinit
    //best method to use over findviewbyid to avoid slow speed
    //lateinit will be initialized later
    //used to extract image view variable
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

        //added after including lateinit var
        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {

        //random numbers
        val randomInt = Random.nextInt(6) +1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //delete below after setting lateinit
//        val diceImage: ImageView = findViewById(R.id.dice_image)
        //assign drawableResource to diceImage
        diceImage.setImageResource(drawableResource)
    }
}

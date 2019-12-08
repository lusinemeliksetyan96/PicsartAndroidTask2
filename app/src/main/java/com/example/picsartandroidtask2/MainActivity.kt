package com.example.picsartandroidtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var firstDice: ImageView
    lateinit var secondDice: ImageView
    lateinit var btnRollDice: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewsById()

        btnRollDice.setOnClickListener(View.OnClickListener {
            firstDice.setImageResource(rollDice())
            secondDice.setImageResource(rollDice())
        })
    }

    private fun findViewsById() {
        firstDice = findViewById(R.id.firstDice)
        secondDice = findViewById(R.id.secondDice)
        btnRollDice = findViewById(R.id.btnRollDice)
    }

    private fun rollDice() = when (Random.nextInt(6)) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}

package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var btClick: Button
    lateinit var myDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btClick = findViewById(R.id.btClickme)
        myDice = findViewById<ImageView>(R.id.diceImage)
        btClick.setOnClickListener {
            btClicked()
        }
    }

    private fun btClicked() {
        var rNumber = 0
        rNumber = Random.nextInt(6) + 1
        when(rNumber) {
            1 -> myDice.setImageResource(R.drawable.one_icon)
            2 -> myDice.setImageResource(R.drawable.two_icon)
            3 -> myDice.setImageResource(R.drawable.three_icon)
            4 -> myDice.setImageResource(R.drawable.four_icon)
            5 -> myDice.setImageResource(R.drawable.five_icon)
            6 -> myDice.setImageResource(R.drawable.six_icon)
            else -> Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show()
        }
    }
}
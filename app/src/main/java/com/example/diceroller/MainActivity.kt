package com.example.diceroller

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import android.widget.ImageView

lateinit var diceImage: ImageView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById<ImageView>(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage.setImageResource(drawableResource)
    }
}
package com.example.imada2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlin.random.Random

class secondscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondscreen)

    val feedButton = findViewById<Button>(R.id.feedButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val display = findViewById<ImageView>(R.id.petDisplay)
        val feedDisplay = findViewById<ImageView>(R.id.feedDisplay)
        val playDisplay = findViewById<ImageView>(R.id.playDisplay)
        val cleanDisplay = findViewById<ImageView>(R.id.cleanDisplay)
        val happyBar = findViewById<ProgressBar>(R.id.happyBar)
        val cleanBar = findViewById<ProgressBar>(R.id.cleanBar)
        val hungryBar = findViewById<ProgressBar>(R.id.hungryBar)

        //Sets all the image views to either visible ot not
        feedDisplay.isVisible = false
        display.isVisible = true
        playDisplay.isVisible = false
        cleanDisplay.isVisible = false

        val randomNum = Random.nextInt(20, 50) // Generates a random number from 20 to 50

        // Set all the minimum and maximum of each of the progress bars
        happyBar.min = 15
        happyBar.progress = randomNum // Gives each bar a random starting number
        happyBar.max = 100

        cleanBar.min = 15
        cleanBar.progress = randomNum
        cleanBar.max = 100

        hungryBar.min = 15
        hungryBar.progress = randomNum
        hungryBar.max = 100


 feedButton.setOnClickListener{// Checks if button is clicked and executes the code
     feedDisplay.isVisible = true    // Changes all the image views to visible or not based on the button clicked
     display.isVisible = false
     cleanDisplay.isVisible = false
     playDisplay.isVisible = false
     happyBar.progress -= randomNum  // Reduces this bar by a random number between 20 and 50
     cleanBar.progress -= randomNum  // Reduces this bar by a random number between 20 and 50
     hungryBar.progress = 100        // Sets bar progress to 100
    }

        cleanButton.setOnClickListener{// Checks if button is clicked and executes the code
    cleanDisplay.isVisible = true            // Changes all the image views to visible or not based on the button clicked
    display.isVisible = false
            feedDisplay.isVisible = false
            playDisplay.isVisible = false
            happyBar.progress -= randomNum   // Reduces this bar by a random number between 20 and 50
            cleanBar.progress = 100          // Sets bar progress to 100
            hungryBar.progress -= randomNum  // Reduces this bar by a random number between 20 and 50
        }

        playButton.setOnClickListener{// Checks if button is clicked and executes the code
            playDisplay.isVisible = true    // Changes all the image views to visible or not based on the button clicked
            display.isVisible = false
            feedDisplay.isVisible = false
            cleanDisplay.isVisible = false
            happyBar.progress = 100           // Sets bar progress to 100
            cleanBar.progress -= randomNum   // Reduces this bar by a random number between 20 and 50
            hungryBar.progress -= randomNum  // Reduces this bar by a random number between 20 and 50
        }
 }

}

package dev.marawanxmamdouh.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the button by id
        val btn = findViewById<Button>(R.id.calculateBtn)

        // Set the button click listener
        btn.setOnClickListener {
            // Get weight and height from the edit text fields
            val weight = findViewById<EditText>(R.id.weightEditText).text.toString().toDouble()
            var height = findViewById<EditText>(R.id.heightEditText).text.toString().toDouble()

            // convert height to meters
            height /= 100

            // Calculate BMI
            var bmi = weight / (height * height)

            // round double bmi to 2 decimal places
            bmi = String.format("%.2f", bmi).toDouble()

            // Display BMI to the user
            val result = findViewById<TextView>(R.id.resultTextView)
            result.text = "Your BMI is: $bmi"
        }
    }
}
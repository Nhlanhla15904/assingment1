package vcmsa.ci.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Retrieve UI elements
        val timeMealType = findViewById<EditText>(R.id.timeofday)
        val button = findViewById<Button>(R.id.suggestionsbutton)
        val textView = findViewById<TextView>(R.id.suggestions)
        val resetButton = findViewById<Button>(R.id.resetbutton)

        // Set OnClickListener for the suggestion button
        button.setOnClickListener {
            val userInput = timeMealType.text.toString().trim() // Trim extra spaces

            when (userInput.lowercase()) {
                "breakfast", "morning" -> textView.text =
                    "Suggestions: Full English breakfast, Oatmeal, Yogurt and fruits"

                "brunch" -> textView.text =
                    "Suggestions: Eggs Benedict, Pancakes, Waffles, French Toast"

                "lunch" -> textView.text =
                    "Suggestions: Spinach Salad, English Tea Sandwiches, Salad"

                "dinner", "supper" -> textView.text =
                    "Suggestions: Steak, Grilled Chicken, Easy Pad Thai"

                else -> textView.text = "Please input Morning, Brunch, Lunch, or Dinner"
            }
        }

        // Reset button listener
        resetButton.setOnClickListener {
            timeMealType.text.clear()  // Clears EditText
            textView.text =
                "Your meal suggestions will be shown here" // Resets TextView// Retrieve UI elements
            val timeMealType = findViewById<EditText>(R.id.timeofday)
            val button = findViewById<Button>(R.id.suggestionsbutton)
            val textView = findViewById<TextView>(R.id.suggestions)
            val resetButton = findViewById<Button>(R.id.resetbutton)

            // Set OnClickListener for the suggestion button
            button.setOnClickListener {
                val userInput = timeMealType.text.toString().trim() // Trim extra spaces

                when (userInput.lowercase()) {
                    "breakfast", "morning" -> textView.text =
                        "Suggestions: Full English breakfast, Oatmeal, Yogurt and fruits"

                    "brunch" -> textView.text =
                        "Suggestions: Eggs Benedict, Pancakes, Waffles, French Toast"

                    "lunch" -> textView.text =
                        "Suggestions: Spinach Salad, English Tea Sandwiches, Salad"

                    "dinner", "supper" -> textView.text =
                        "Suggestions: Steak, Grilled Chicken, Easy Pad Thai"

                    else -> textView.text = "Please input Morning, Brunch, Lunch, or Dinner"
                }
            }

            // Reset button listener
            resetButton.setOnClickListener {
                timeMealType.text.clear()  // Clears EditText
                textView.text = "Your meal suggestions will be shown here" // Resets TextView
            }
        }
    }
    }
//Title: assignment1
//Author: Nhlanhla Zungu
// Date: 30 March 2025
// Version: 1.0
// Available: https://www.w3schools.com/kotlin/index.php
// Additional reference: https://developer.android.com/reference/android/widget/button

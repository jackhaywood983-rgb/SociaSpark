package com.example.socialspark

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTime = findViewById<EditText>(R.id.inputTime)
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val suggestionView = findViewById<TextView>(R.id.suggestionView)

        submitBtn.setOnClickListener {
            val time = inputTime.text.toString().replaceFirstChar { it.uppercase() }
            val spark = when (time) {
                "Morning" -> "Send a 'Good morning' text to a family member."
                "Mid-morning" -> "Reach out to a colleague with a quick 'Thank you'."
                "Afternoon" -> "Share a funny meme or interesting link with a friend."
                "Afternoon Snack Time" -> "Send a quick 'thinking of you' message."
                "Dinner" -> "Call a friend or relative for a 5-minute catch-up."
                "After Dinner" -> "Leave a thoughtful comment on a friend's post."
                else -> "Try entering a valid time (Morning, Mid-morning, Afternoon, etc.)."
            }
            suggestionView.text = spark
        }

        resetBtn.setOnClickListener {
            inputTime.text.clear()
            suggestionView.text = ""
        }
    }
}

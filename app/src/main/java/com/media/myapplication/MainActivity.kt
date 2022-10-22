package com.media.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: EditText = findViewById(R.id.num1)
        var num2: EditText = findViewById(R.id.num2)
        var btnAdd: Button = findViewById(R.id.btnAdd)
        var result: TextView = findViewById(R.id.result)

        btnAdd.setOnClickListener {
            try {
                val num1: Int = num1.text.toString().toInt()
                val num2: Int = num2.text.toString().toInt()
                val sum: Int = num1 + num2
                result.text = "RESULT: $sum"
            } catch(e: NumberFormatException) {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Please enter a valid number")
                    .show()
            }
        }
    }
}
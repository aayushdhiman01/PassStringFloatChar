package com.aayush.passstringfloatchar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var String: EditText
    lateinit var Float: TextView
    lateinit var Double: EditText
    lateinit var Char: EditText
    lateinit var btnPassValue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        String = findViewById(R.id.etString)
        Float = findViewById(R.id.etFloat)
        Double = findViewById(R.id.etDouble)
        Char = findViewById(R.id.etChar)
        btnPassValue = findViewById(R.id.pass)

        btnPassValue.setOnClickListener {
            if (String.text.toString().isNullOrEmpty()) {
                String.error = resources.getString(R.string.please_enter_string)
                String.requestFocus()
            } else {
                var intent = Intent(this, result::class.java)
                intent.putExtra("String", String.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
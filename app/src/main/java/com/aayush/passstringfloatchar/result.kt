package com.aayush.passstringfloatchar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aayush.passstringfloatchar.databinding.ActivityMainBinding

class result : AppCompatActivity() {
    var pFloat: Float= 0f
    var pString: String=""
    var pDouble: Double = 0.0
    var pChar: Char='\u0000'
    lateinit  var tvDouble: TextView
    lateinit  var tvFloat: TextView
    lateinit  var tvString: TextView
    lateinit var tvChar:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        intent?.let { abc->
            if (abc.hasExtra("String"))
                pString=abc.getStringExtra("String") as String
            if (abc.hasExtra("Float"))
                pFloat=abc.getFloatExtra("Float",0f)
            if (abc.hasExtra("Double"))
                pDouble=abc.getDoubleExtra("Double",0.0)
            if (abc.hasExtra("Char"))
                pChar=abc.getCharExtra("Char",'\u0000')
        }?:kotlin.run{ }
        tvString=findViewById(R.id.tvString)
        tvString.setText(pString)
        tvFloat=findViewById(R.id.tvFloat)
        tvFloat.setText(pFloat.toString())
        tvDouble=findViewById(R.id.tvDouble)
        tvDouble.setText(pDouble.toString())
        tvChar = findViewById(R.id.tvChar)
        tvChar.setText(pChar.toString())
    }
}
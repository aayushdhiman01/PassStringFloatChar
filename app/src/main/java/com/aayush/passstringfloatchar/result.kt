package com.aayush.passstringfloatchar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aayush.passstringfloatchar.databinding.ActivityMainBinding

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var pFloat: Float= 0f
        var pString: String=""
        var pDouble: Double = 0.0
        var pChar: Character=""
        lateinit  var tvDouble: TextView
        lateinit  var tvFloat: TextView
        lateinit  var tvString: TextView
        lateinit var tvChar:TextView
        intent?.let { abc->
            if (abc.hasExtra("String"))
                pString=abc.getStringExtra("String") as String
            if (abc.hasExtra("Float"))
                pFloat=abc.getFloatExtra("Float",0f)
            if (abc.hasExtra("Double"))
                pDouble=abc.getDoubleExtra("Double",0.0)
            if (abc.hasExtra("Char"))
                pChar=abc.getCharExtra("Char",)
        }?:kotlin.run{ }
        tvString=findViewById(R.id.tvString)
        tvString.setText(pString)
        tvFloat=findViewById(R.id.tvFloat)
        var  rFloat = Integer.parseInt(pFloat)
        tvFloat.setText(pFloat.toString())
        tvDouble=findViewById(R.id.tvDouble)
        var  rDouble = Integer.parseInt(pDouble)
        tvDouble.setText(rDouble)
        tvChar=findViewById(R.id.tvChar)
        tvChar.setText(rDouble)


    }
}
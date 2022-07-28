package com.aayush.passstringfloatchar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var pString: String=" "
        lateinit  var tvString: TextView
        intent?.let { abc->
            if (abc.hasExtra("String"))
                pString=abc.getStringExtra("String") as String
        }?:kotlin.run{ }
        tvString=findViewById(R.id.tvString)
        tvString.setText(pString)
    }
}
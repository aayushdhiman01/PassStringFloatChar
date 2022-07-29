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
        var pFloat: String=" "
        var pString: String=" "
        lateinit  var tvFloat: TextView
        lateinit  var tvString: TextView
        intent?.let { abc->
            if (abc.hasExtra("String"))
                pString=abc.getStringExtra("String") as String
            if (abc.hasExtra("Float"))
                pFloat=abc.getStringExtra("Float") as String
        }?:kotlin.run{ }
        tvString=findViewById(R.id.tvString)
        tvString.setText(pString)
        tvFloat=findViewById(R.id.tvFloat)
        var  rFloat = Integer.parseInt(pFloat)
        tvFloat.setText(rFloat)

        var pDouble: String=" "
        lateinit  var tvDouble: TextView
        intent?.let { abc->
            if (abc.hasExtra("Double"))
                pDouble=abc.getStringExtra("Double") as String
        }?:kotlin.run{ }
        tvDouble=findViewById(R.id.tvDouble)
        var  rDouble = Integer.parseInt(pDouble)
        tvFloat.setText(rDouble)
    }
}
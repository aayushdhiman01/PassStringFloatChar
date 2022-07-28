package com.aayush.passstringfloatchar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aayush.passstringfloatchar.databinding.ActivityMainBinding

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMainBinding
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pString: String=" "
        lateinit  var tvString: TextView
        intent?.let { abc->
            if (abc.hasExtra("String"))
                pString=abc.getStringExtra("String") as String
        }?:kotlin.run{ }
        tvString=findViewById(R.id.tvString)
        tvString.setText(pString)


        var pFloat: String=" "
        lateinit  var tvFloat: TextView
        intent?.let { abc->
            if (abc.hasExtra("Float"))
                pFloat=abc.getStringExtra("Float") as String
        }?:kotlin.run{ }
        tvFloat=findViewById(R.id.tvFloat)
        var  rFloat = Integer.parseInt(pFloat)
        tvFloat.setText(rFloat)
        var pDouble: String=" "
        lateinit  var tvDouble: TextView
        intent?.let { abc->
            if (abc.hasExtra("Double"))
                pDouble=abc.getStringExtra("Double") as String
        }?:kotlin.run{ }
        tvFloat=findViewById(R.id.tvFloat)
        var  rFloat = Integer.parseInt(pFloat)
        tvFloat.setText(rFloat)
    }
}
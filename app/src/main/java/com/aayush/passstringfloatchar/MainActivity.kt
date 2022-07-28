package com.aayush.passstringfloatchar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.aayush.passstringfloatchar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.pass.setOnClickListener {
            if (binding.etString.text.toString().isNullOrEmpty()) {
                binding.etString.error = resources.getString(R.string.please_enter_string)
                binding.etString.requestFocus()
            } else {
                var intent = Intent(this, result::class.java)
                intent.putExtra("String",binding.etString.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
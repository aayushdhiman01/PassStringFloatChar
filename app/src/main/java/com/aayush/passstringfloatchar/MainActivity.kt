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
            }
            else if(binding.etFloat.text.toString().isNullOrEmpty()) {
                binding.etFloat.error = resources.getString(R.string.please_enter_string)
                binding.etFloat.requestFocus()
            }
            else if(binding.etDouble.text.toString().isNullOrEmpty()) {
                binding.etDouble.error = resources.getString(R.string.please_enter_string)
                binding.etDouble.requestFocus()
            }
            else if(binding.etChar.text.toString().isNullOrEmpty()) {
                binding.etChar.error = resources.getString(R.string.please_enter_string)
                binding.etChar.requestFocus()
            }
            else if(binding.etBoolean.text.toString().isNullOrEmpty()){
                binding.etBoolean.error = resources.getString(R.string.please_enter_string)
                binding.etBoolean.requestFocus()
            }
            else {
                System.out.print("binding.etBoolean.text.toString().toBoolean() ${binding.etBoolean.text.toString().toBoolean()}")
                var isTrue = false
                if(binding.etBoolean.text.toString().equals("1", true)){
                    isTrue = true
                }

                var intent = Intent(this, result::class.java)
                intent.putExtra("String", binding.etString.text.toString())
                intent.putExtra("Float", binding.etFloat.text.toString().toFloat())
                intent.putExtra("Double", (binding.etDouble.text.toString()).toDouble())
                intent.putExtra("Char", binding.etChar.text.toString().get(0))
                intent.putExtra("Boolean", isTrue)
                startActivity(intent)
                finish()
            }
//            ____________________________________________________________
//            {WRONG CODE}
//                var intentF = Intent(this, result::class.java)
//                intentF.putExtra("Float",binding.etFloat.text.toString())
//                startActivity(intentF)
//                finish()
//                var intentD = Intent(this, result::class.java)
//                intentD.putExtra("Double",binding.etDouble.text.toString())
//                startActivity(intentD)
//                finish()
//                var intentC = Intent(this, result::class.java)
//                intentC.putExtra("Char",binding.etChar.text.toString())
//                startActivity(intentC)
//                finish()
//            _____________________________________________________________


        }


    }
}
package com.example.count

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.count.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var i = 0
    private var isplus = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPlus.setOnClickListener {
            if (isplus){
                i++
                if (i == 10){
                    binding.btnPlus.text = "-1"
                    isplus = false
                }
            }else{
                i--
                if (i == 0){
                    startActivity(Intent(this, MainActivity2::class.java))
                    isplus = true
                    binding.btnPlus.text = "+1"
                }
            }

                binding.textView.text = i.toString()
            }
        }

    }


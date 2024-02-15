package com.example.homework_for_doubletapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_for_doubletapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("SecondActivity", "onCreate")
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSecond.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Log.d("SecondActivity", "Navigate to the main activity")
            startActivity(intent)
        }
        val intent = intent
        binding.changingNum.setText(intent.getStringExtra(numFromMain))
        Log.d("SecondActivity", "got instance from MainActivity = ${binding.changingNum.text}")
        var pow =
            binding.changingNum.text.toString().toInt() * binding.changingNum.text.toString()
                .toInt()
        binding.changingNum.setText(pow.toString())

    }

    override fun onDestroy() {
        Log.d("SecondActivity", "onDestroy")
        super.onDestroy()
    }

    override fun onPause() {
        Log.d("SecondActivity", "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d("SecondActivity", "onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d("SecondActivity", "onStop")
        super.onStop()
    }

    companion object {
        val numFromMain = "KEY"
    }

}
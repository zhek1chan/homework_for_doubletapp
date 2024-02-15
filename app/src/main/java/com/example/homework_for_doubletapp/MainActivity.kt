package com.example.homework_for_doubletapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_for_doubletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("MainActivity", "OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMain.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.numFromMain, binding.changingNum.text.toString())
            Log.d("MainActivity", "Navigate to the second activity")
            startActivity(intent)
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(key, binding.changingNum.text.toString())
        Log.d("MainActivity", "SavedInstance = ${binding.changingNum.text}")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding.changingNum.text = ((savedInstanceState!!.getString(key)!!.toInt() + 1).toString())
        Log.d("MainActivity", "RestoredInstance = ${savedInstanceState.getString(key)!!}")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy")
        super.onDestroy()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d("MainActivity", "onStop")
        super.onStop()
    }

    companion object {
        val key = "NUM"
    }
}

package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity: ", "onCreate: ")
        Toast.makeText(this, "onCreate 1 Activity", Toast.LENGTH_SHORT).show()

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val myIntent = Intent(this,SecondActivity::class.java)
            startActivity(myIntent)
        }

    }
    override fun onPause() {
        super.onPause()
        Log.d("Activity1: ", "onPause: ")
        Toast.makeText(this, "onPause 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity1: ", "onDestroy: ")
        Toast.makeText(this, "onDestroy 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity1: ", "onStop: ")
        Toast.makeText(this, "onStop 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity1: ", "onStart: ")
        Toast.makeText(this, "onStart 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity1: ", "onRestart: ")
        Toast.makeText(this, "onRestart 1 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity1: ", "onResume: ")
        Toast.makeText(this, "onResume 1 Activity", Toast.LENGTH_SHORT).show()
    }
}
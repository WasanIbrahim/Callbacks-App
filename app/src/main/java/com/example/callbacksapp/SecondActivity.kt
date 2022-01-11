package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("SecondActivity ", "onCreate: ")
        Toast.makeText(this, "onCreate 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity2: ", "onPause: ")
        Toast.makeText(this, "onPause 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity2: ", "onDestroy: ")
        Toast.makeText(this, "onDestroy 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity2: ", "onStop: ")
        Toast.makeText(this, "onStop 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity2: ", "onStart: ")
        Toast.makeText(this, "onStart 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity2: ", "onRestart: ")
        Toast.makeText(this, "onRestart 2 Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity2: ", "onResume: ")
        Toast.makeText(this, "onResume 2 Activity", Toast.LENGTH_SHORT).show()
    }
}
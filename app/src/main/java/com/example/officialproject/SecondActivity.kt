package com.example.officialproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import com.example.schoolscientistsexample.ServerCommand

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    // это все переходы к активити
    fun tea(view: View) {
        val randomIntent = Intent(this, ThirdActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }

    fun banana(view: View) {
        val randomIntent = Intent(this, FourthActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }

    fun pizza(view: View) {
        val randomIntent = Intent(this, FifthActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)

    }
}
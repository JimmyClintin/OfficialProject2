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
    var t = ServerCommand()

    fun ledOn(view: View){
        t.ledOn()
        val randomIntent = Intent(this, ThirdActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }

    fun ledOff(view: View){
        t.ledOff()
        val randomIntent = Intent(this, ThirdActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }

}
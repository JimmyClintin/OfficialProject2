package com.example.officialproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.schoolscientistsexample.ServerCommand
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_third.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        ServerCommand()
        ShowPinCode2()
    }

    private fun ShowPinCode2() {
        val t = ServerCommand()
        val str = t.createOrder(5)

        textView2.text = str

        val myToast = Toast.makeText(this, str, Toast.LENGTH_SHORT)
        myToast.show()
    }
}
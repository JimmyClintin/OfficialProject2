package com.example.officialproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.schoolscientistsexample.ServerCommand
import kotlinx.android.synthetic.main.activity_fifth.*
import kotlinx.android.synthetic.main.activity_third.*

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        ServerCommand()
        ShowPinCode3()
    }
    private fun ShowPinCode3() {
        val p = ServerCommand()
        val str = p.createOrder(6)

        textView3.text = str

        val myToast = Toast.makeText(this, str, Toast.LENGTH_SHORT)
        myToast.show()
}
}
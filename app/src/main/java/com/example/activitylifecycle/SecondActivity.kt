package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn :Button = findViewById(R.id.btnAdd)
        val tv : TextView = findViewById(R.id.tvResult)

        btn.setOnClickListener(){
            count+=1
            tv.text = count.toString()
        }
    }

}
package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btn : Button
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        textview = findViewById(R.id.textview)
        btn = findViewById(R.id.btn)
        textview.text = "Count is: ${viewModel.count}"

        btn.setOnClickListener {
            viewModel.increse()
            textview.text = "Count is: ${viewModel.count}"
        }
    }
}
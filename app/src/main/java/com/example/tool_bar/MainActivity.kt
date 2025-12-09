package com.example.tool_bar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
        lateinit var btAdd: Button
        lateinit var btEnquiry: Button
        lateinit var tbToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btAdd = findViewById(R.id.btAdd)
        btEnquiry = findViewById(R.id.btEnquiry)
        tbToolbar = findViewById(R.id.toolbar)

        setSupportActionBar(tbToolbar)

        val actionBar = supportActionBar
        actionBar?.title = " Welcome !!!"

        btAdd.setOnClickListener {
            startActivity(Intent(this@MainActivity, AddStudent::class.java))
        }

        btEnquiry.setOnClickListener {
            startActivity(Intent(this@MainActivity, EnquiryStudent::class.java))
        }

    }

}


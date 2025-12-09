package com.example.tool_bar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnquiryStudent : AppCompatActivity() {
    lateinit var tbToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enquiry_student)

        tbToolbar = findViewById(R.id.toolbar)

        setSupportActionBar(tbToolbar)

        val actionBar = supportActionBar
        actionBar?.title = " Enquiry Student"

        tbToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        tbToolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
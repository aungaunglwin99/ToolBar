package com.example.tool_bar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class AddStudent : AppCompatActivity() {
    lateinit var tbToolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        tbToolbar = findViewById(R.id.toolbar)

        setSupportActionBar(tbToolbar)

        val actionBar = supportActionBar
        actionBar?.title = " Add Student"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        tbToolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)

        tbToolbar.setNavigationOnClickListener {
            finish()
        }

    }

}

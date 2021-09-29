package com.android.testing.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.testing.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is a new commit change!")
        println("local changes")
    }
}
package com.yogesh.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("TAG", "onCreate: first commit log" )
        Log.e("TAG", "onCreate: second commit on another branch" )
        Log.e("TAG", "onCreate: third commit on another branch" )
    }
}
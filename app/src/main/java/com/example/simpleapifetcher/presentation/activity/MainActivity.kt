package com.example.simpleapifetcher.presentation.activity

import android.os.Bundle
import com.example.simpleapifetcher.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
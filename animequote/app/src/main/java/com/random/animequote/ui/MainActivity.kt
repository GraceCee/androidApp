package com.random.animequote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.random.animequote.R
import com.random.animequote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        
    }
    
    
    
}
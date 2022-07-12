package com.random.animequote

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.random.animequote.databinding.ActivitySplashBinding
import com.random.animequote.ui.SingleRandomQuote

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this, SingleRandomQuote::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
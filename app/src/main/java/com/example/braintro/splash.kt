package com.example.braintro

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var progressText: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        progressBar = findViewById(R.id.progressBar)
        progressText = findViewById(R.id.progressText)

        startLoading()
    }

    private fun startLoading() {
        val handler = Handler(Looper.getMainLooper())
        var progress = 0

        val runnable = object : Runnable {
            override fun run() {
                if (progress <= 100) {
                    progressBar.progress = progress
                    progressText.text = "$progress%"
                    progress += 5
                    handler.postDelayed(this, 100) // update every 100ms
                } else {
                    val intent = Intent(this@SplashActivity, CategoryActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
        handler.post(runnable)
    }
}

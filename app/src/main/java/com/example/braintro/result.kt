package com.example.braintro

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class ResultActivity : AppCompatActivity() {

    private lateinit var scoreTextView: TextView
    private lateinit var congratulationsTextView: TextView
    private lateinit var scoreMessageTextView: TextView
    private lateinit var restartButton: Button
    private lateinit var trophyImageView: ImageView
    private lateinit var confettiAnimationView: LottieAnimationView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Initialize views
        scoreTextView = findViewById(R.id.scoreTextView)
        congratulationsTextView = findViewById(R.id.congratulationsTextView)
        scoreMessageTextView = findViewById(R.id.scoreMessageTextView)
        restartButton = findViewById(R.id.restartButton)
        trophyImageView = findViewById(R.id.trophyImageView)
        confettiAnimationView = findViewById(R.id.confettiAnimationView)

        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 0)
        val userName = intent.getStringExtra("USER_NAME") ?: "Player"

        scoreTextView.text = "$score/$totalQuestions"
        congratulationsTextView.text = "Congratulations, $userName!"

        val percentage = if (totalQuestions > 0) (score * 100) / totalQuestions else 0
        scoreMessageTextView.text = when {
            percentage >= 80 -> "Excellent! You're a quiz master!"
            percentage >= 60 -> "Good job! You know your stuff!"
            percentage >= 40 -> "Not bad! Keep learning!"
            else -> "Keep practicing to improve!"
        }

        if (percentage >= 80) {
            confettiAnimationView.visibility = View.VISIBLE
            confettiAnimationView.repeatCount = LottieDrawable.INFINITE
            confettiAnimationView.playAnimation()

            val pulse = AnimationUtils.loadAnimation(this, R.anim.pulse)
            trophyImageView.startAnimation(pulse)
        } else {
            val shake = AnimationUtils.loadAnimation(this, R.anim.shake)
            scoreMessageTextView.startAnimation(shake)
        }

        // Restart quiz
        restartButton.setOnClickListener {
            startActivity(Intent(this, CategoryActivity::class.java))
            finish()
        }
    }
}

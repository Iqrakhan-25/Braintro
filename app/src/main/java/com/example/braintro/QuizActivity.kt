package com.example.braintro

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.braintro.data.QuestionRepository
import com.example.braintro.model.Question

class QuizActivity : AppCompatActivity() {

    private lateinit var questionNumberTextView: TextView
    private lateinit var questionTextView: TextView
    private lateinit var optionsContainer: LinearLayout
    private lateinit var nextButton: Button
    private lateinit var timerTextView: TextView

    private lateinit var currentQuestion: Question
    private var questionIndex = 0
    private var score = 0
    private var selectedOption: View? = null
    private lateinit var countDownTimer: CountDownTimer

    private val questions: MutableList<Question> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        questionNumberTextView = findViewById(R.id.questionNumberTextView)
        questionTextView = findViewById(R.id.questionTextView)
        optionsContainer = findViewById(R.id.optionsContainer)
        nextButton = findViewById(R.id.nextButton)
        timerTextView = findViewById(R.id.timerTextView)

        val category = intent.getStringExtra("CATEGORY") ?: "General Knowledge"
        loadQuestions(category)

        nextButton.setOnClickListener { proceedToNextQuestion() }

        startQuiz()
    }

    private fun loadQuestions(category: String) {
        questions.addAll(QuestionRepository.getQuestionsByCategory(category))
        questions.shuffle()
    }

    private fun startQuiz() {
        if (questions.isNotEmpty()) {
            showQuestion(questions[questionIndex])
            startTimer()
        }
    }

    private fun showQuestion(question: Question) {
        currentQuestion = question
        questionNumberTextView.text = "Question ${questionIndex + 1}/${questions.size}"
        questionTextView.text = question.question

        optionsContainer.removeAllViews()
        selectedOption = null

        question.options.forEachIndexed { index, option ->
            val optionView = LayoutInflater.from(this)
                .inflate(R.layout.item_option, optionsContainer, false)
            optionView.findViewById<TextView>(R.id.optionText).text = option
            optionView.tag = index

            optionView.setOnClickListener {
                handleOptionSelection(optionView, index)
            }

            optionsContainer.addView(optionView)
        }

        nextButton.visibility = View.GONE
    }

    private fun handleOptionSelection(optionView: View, selectedIndex: Int) {
        selectedOption?.setBackgroundResource(R.drawable.rounded_dialog_bg)
        optionView.setBackgroundResource(R.drawable.option_background_selected)
        selectedOption = optionView

        val isCorrect = selectedIndex == currentQuestion.correctAnswerIndex
        if (isCorrect) {
            score++
            optionView.setBackgroundResource(R.drawable.bg_option_correct)
        } else {
            optionView.setBackgroundResource(R.drawable.bg_option_wrong)
            val correctOption =
                optionsContainer.findViewWithTag<View>(currentQuestion.correctAnswerIndex)
            correctOption?.setBackgroundResource(R.drawable.bg_option_correct)
        }

        for (i in 0 until optionsContainer.childCount) {
            optionsContainer.getChildAt(i).isClickable = false
        }

        nextButton.visibility = View.VISIBLE
        countDownTimer.cancel()
    }

    private fun proceedToNextQuestion() {
        questionIndex++
        if (questionIndex < questions.size) {
            showQuestion(questions[questionIndex])
            startTimer()
        } else {
            showResult()
        }
    }

    private fun startTimer() {
        countDownTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val minutes = (millisUntilFinished / 1000) / 60
                val seconds = (millisUntilFinished / 1000) % 60
                timerTextView.text = String.format("%02d:%02d", minutes, seconds)
            }

            override fun onFinish() {
                proceedToNextQuestion()
            }
        }.start()
    }

    private fun showResult() {
        val userName = PreferencesManager.getInstance(this).getUserName()
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("TOTAL_QUESTIONS", questions.size)
        intent.putExtra("USER_NAME", userName)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::countDownTimer.isInitialized) {
            countDownTimer.cancel()
        }
    }
}

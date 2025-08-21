package com.example.braintro.model

data class Category(
    val name: String,
    val icon: Int
)
data class Question(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)
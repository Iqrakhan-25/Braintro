package com.example.braintro

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager private constructor(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("QuizAppPrefs", Context.MODE_PRIVATE)

    companion object {
        @Volatile
        private var instance: PreferencesManager? = null

        fun getInstance(context: Context): PreferencesManager {
            return instance ?: synchronized(this) {
                instance ?: PreferencesManager(context.applicationContext).also { instance = it }
            }
        }
    }

    fun saveUserName(name: String) {
        sharedPreferences.edit().putString("user_name", name).apply()
    }

    fun getUserName(): String {
        return sharedPreferences.getString("user_name", "Player") ?: "Player"
    }
}

// Extension functions for easier access
fun Context.saveUserName(name: String) {
    PreferencesManager.getInstance(this).saveUserName(name)
}

fun Context.getUserName(): String {
    return PreferencesManager.getInstance(this).getUserName()
}

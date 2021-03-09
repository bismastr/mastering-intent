package com.example.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MoveWithData : AppCompatActivity() {
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvMoveWithData: TextView = findViewById(R.id.tvMoveWithData)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        tvMoveWithData.text = "My name is $name, and my age is $age"
    }
}
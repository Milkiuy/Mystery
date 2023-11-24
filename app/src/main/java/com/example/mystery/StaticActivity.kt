package com.example.mystery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mystery.databinding.ActivityMainBinding
import com.example.mystery.databinding.ActivityStaticBinding

class StaticActivity : AppCompatActivity() {
    lateinit var binding: ActivityStaticBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStaticBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.TxtRightAnswer.text = "Правильных ответов: " + intent.getStringExtra("rightNumberAnswer")
        binding.TxtWrongAnswer.text = "Неправильных ответов: " + intent.getStringExtra("wrongNumberAnswer")
    }

    fun onClickBackBtn(view:View)
    {
        finish()
    }
}
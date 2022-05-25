package com.naim.differentactivitylaunchmodeandroid.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.differentactivitylaunchmodeandroid.databinding.CommonActivityBinding

class DActivity : AppCompatActivity() {
    private var _binding: CommonActivityBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = CommonActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTitle?.text = "D activity start"
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        binding.tvTitle.text = "D activity started by new intent"
    }
}
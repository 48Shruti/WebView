package com.shruti.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shruti.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webView.loadUrl("https://www.amazon.in/")
        binding.webView.settings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(binding.webView.canGoBack()){
            binding.webView.goBack()
        }
        else{
            finish()
        }
    }
}
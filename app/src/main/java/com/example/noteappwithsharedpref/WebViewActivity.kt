package com.example.noteappwithsharedpref

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible

class WebViewActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var button: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView = findViewById(R.id.webView)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextTextPersonName)
        progressBar = findViewById(R.id.progressBar)

        val webViewClient = WebViewClient()
        webView.webViewClient = webViewClient
        webView.settings.javaScriptEnabled = true
        webView.settings.supportZoom()

        button.setOnClickListener {
            progressBar.isVisible = true
            val webSite = editText.text.toString().trim()
            if (webSite.isNotBlank()) {
                webView.loadUrl("https://$webSite")
                progressBar.isVisible = false
            } else {
                Toast.makeText(this, "Enter web-site url!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
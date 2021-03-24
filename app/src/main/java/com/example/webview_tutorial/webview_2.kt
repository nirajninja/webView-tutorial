package com.example.webview_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_webview_2.*

class webview_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview_2)


        webview.webViewClient = WebViewClient()

        // this will load the url of the website
        webview.loadUrl("https://www.geeksforgeeks.org/")
    }
}
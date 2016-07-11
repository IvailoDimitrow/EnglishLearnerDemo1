package com.example.acer.englishlearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewDictionary extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_webview);
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://translate.google.bg/?hl=bg");
    }
}

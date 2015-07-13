package com.example.navigationdrawerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MentorActivity extends Activity {

    private WebView mWebView;

    public MentorActivity() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);

       // mWebView = (WebView) findViewById(R.id.webview);
        // Enable Javascript
        //WebSettings webSettings = mWebView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        //mWebView.loadUrl("https://docs.google.com/forms/d/1IjfXRGAFEoskViuCaDeX8AbPVYti_JMhhblE7k2UcT4/viewform?");
        // Force links and redirects to open in the WebView instead of in a browser
        //mWebView.setWebViewClient(new WebViewClient());WebViewClient

    }


}

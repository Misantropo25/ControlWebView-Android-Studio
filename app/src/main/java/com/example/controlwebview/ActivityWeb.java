package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {
    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wb1 = (WebView) findViewById(R.id.webView1);

        //Recuperar valores por el intent
        String URL = getIntent().getStringExtra("sitio");

        //Permitira al user navegar solo en el app
        wb1.setWebViewClient(new WebViewClient());

        //Abrira el sitio que solicito
        wb1.loadUrl(URL);
    }

    public void cerrar(View view) {
        finish();
    }
}
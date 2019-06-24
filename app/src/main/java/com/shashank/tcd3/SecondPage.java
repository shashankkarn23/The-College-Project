package com.shashank.tcd3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class SecondPage extends AppCompatActivity {
    WebView webView3;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        webView3= findViewById(R.id.webviewsecondpage1);
        webView3.setWebViewClient(new WebViewClient());
        webView3.loadUrl("http://www.notesneighbour.com/SecondPage-android.html");

        btn1=findViewById(R.id.button1secondpage);
        btn2=findViewById(R.id.button2secondpage);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString="https://docs.google.com/forms/d/e/1FAIpQLScM1LdAOfSJcK_MWZPbG5dH99P-58UX5krRUd3VQVmgbURIRQ/viewform";
                Intent intent4=new Intent(Intent.ACTION_VIEW);
                Uri uri4=Uri.parse(urlString);
                intent4.setData(uri4);
                startActivity(intent4);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlString2="https://docs.google.com/forms/d/e/1FAIpQLSe7ZEeDNuBzaPLeo_9z1Umeohu4fAFqAJMrsoy_RygSRbYSNg/viewform";
                Intent intent5=new Intent(Intent.ACTION_VIEW);
                Uri uri5=Uri.parse(urlString2);
                intent5.setData(uri5);
                startActivity(intent5);
            }
        });
    }
}

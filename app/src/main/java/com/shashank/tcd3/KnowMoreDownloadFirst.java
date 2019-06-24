package com.shashank.tcd3;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.io.File;

public class KnowMoreDownloadFirst extends AppCompatActivity {

    WebView webViewkmorefirst;
    Button unit1,unit3,unit5;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more_download_first);

        webViewkmorefirst=findViewById(R.id.webviewKnowMore);
        webViewkmorefirst.setWebViewClient(new WebViewClient());
        webViewkmorefirst.loadUrl("http://notesneighbour.com/index3%20-%20Copy.html");

        unit1= findViewById(R.id.knowmoredownloadfirstbtn1);
        unit3= findViewById(R.id.knowmoredownloadfirstbtn2);
        unit5= findViewById(R.id.knowmoredownloadfirstbtn3);

        unit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/pdf01.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManager.enqueue(request);
            }
        });

        unit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/pdf02.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManager.enqueue(request);
            }
        });
        unit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/Daa_Unit_5[1].pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManager.enqueue(request);
            }
        });

    }
}

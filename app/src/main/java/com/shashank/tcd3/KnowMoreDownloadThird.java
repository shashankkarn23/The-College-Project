package com.shashank.tcd3;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class KnowMoreDownloadThird extends AppCompatActivity {

    WebView webViewkmorethird;
    Button unit1kmorethird,unit3kmorethird,unit5kmorethird;
    DownloadManager downloadManagerthird,downloadManagerthirdPart2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more_download_third);

        webViewkmorethird=findViewById(R.id.webviewKnowMoreThird);
        webViewkmorethird.setWebViewClient(new WebViewClient());
        webViewkmorethird.loadUrl("http://notesneighbour.com/index3%20-android%20adarsh.html");

        unit1kmorethird= findViewById(R.id.knowmoredownloadthirdbtn1);
        unit3kmorethird= findViewById(R.id.knowmoredownloadthirdbtn2);
        unit5kmorethird= findViewById(R.id.knowmoredownloadthirdbtn3);

        unit1kmorethird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagerthird= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/STAUnit1.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagerthird.enqueue(request);
                downloadManagerthirdPart2= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri2= Uri.parse("http://www.notesneighbour.com/PDF/STAUnit2.pdf");
                DownloadManager.Request request2= new DownloadManager.Request(uri2);
                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference2= downloadManagerthird.enqueue(request);
            }
        });
        unit3kmorethird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagerthird= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/STAUnit3.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagerthird.enqueue(request);
                downloadManagerthirdPart2= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri2= Uri.parse("http://www.notesneighbour.com/PDF/STAUnit4.pdf");
                DownloadManager.Request request2= new DownloadManager.Request(uri2);
                request2.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference2= downloadManagerthird.enqueue(request);
            }
        });
        unit5kmorethird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagerthird= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/STAUnit5.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagerthird.enqueue(request);
            }
        });

    }
}

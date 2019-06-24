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

public class KnowMoreDownloadSecond extends AppCompatActivity {

    WebView webViewkmoresecond;
    Button unit1kmoresecond,unit3kmoresecond,unit5kmoresecond;
    DownloadManager downloadManagersecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more_download_second);

        webViewkmoresecond=findViewById(R.id.webviewknowmoredownloadsecond);
        webViewkmoresecond.setWebViewClient(new WebViewClient());
        webViewkmoresecond.loadUrl("http://notesneighbour.com/index3%20-android%20shreya.html");

        unit1kmoresecond= findViewById(R.id.knowmoredownloadsecondbtn1);
        unit3kmoresecond= findViewById(R.id.knowmoredownloadsecondbtn2);
        unit5kmoresecond= findViewById(R.id.knowmoredownloadsecondbtn3);

        unit1kmoresecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagersecond= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/DBMSUNIT1.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagersecond.enqueue(request);

            }
        });
        unit3kmoresecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagersecond= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/DBMSunit3and4.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagersecond.enqueue(request);

            }
        });

        unit5kmoresecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManagersecond= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("http://www.notesneighbour.com/PDF/DBMSUnit5.pdf");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference= downloadManagersecond.enqueue(request);

            }
        });

    }
}

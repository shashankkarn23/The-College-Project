package com.shashank.tcd3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {

    ImageView imageviewfirst,imageViewsec,getImageViewthird;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        imageviewfirst= findViewById(R.id.imageview1);

        imageViewsec= findViewById(R.id.imageview2);

        getImageViewthird= findViewById(R.id.imageview3);

        btn1=findViewById(R.id.buttonfirst);
        btn2=findViewById(R.id.buttonsecond);
        btn3=findViewById(R.id.buttonthird);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(FirstPage.this,KnowMoreDownloadFirst.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(FirstPage.this,KnowMoreDownloadSecond.class);
                startActivity(intent2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(FirstPage.this,KnowMoreDownloadThird.class);
                startActivity(intent3);
            }
        });
    }
}

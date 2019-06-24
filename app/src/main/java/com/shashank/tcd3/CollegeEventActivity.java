package com.shashank.tcd3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class CollegeEventActivity extends AppCompatActivity {

    ImageView img1collegeeventActivity,img2collegeeventActivity,img3collegeeventActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_event);

        img1collegeeventActivity=findViewById(R.id.appLabel9collegeevent);
        img2collegeeventActivity=findViewById(R.id.appLabe20collegeevent);
        img3collegeeventActivity= findViewById(R.id.appLabe21collegeevent);

        img1collegeeventActivity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                String urlString4="https://techkriti.org/";
                Intent intent10=new Intent(Intent.ACTION_VIEW);
                Uri uri8=Uri.parse(urlString4);
                intent10.setData(uri8);
                startActivity(intent10);
                return false;
            }
        });

    img2collegeeventActivity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                String urlString5="https://www.cognizance.org.in/";
                Intent intent11=new Intent(Intent.ACTION_VIEW);
                Uri uri9=Uri.parse(urlString5);
                intent11.setData(uri9);
                startActivity(intent11);
                return false;
            }
        });
    img3collegeeventActivity.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                String urlString6="https://www.technex.in/";
                Intent intent12=new Intent(Intent.ACTION_VIEW);
                Uri uri10=Uri.parse(urlString6);
                intent12.setData(uri10);
                startActivity(intent12);
                return false;
            }
        });

    }
}

package com.shashank.tcd3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView applab1,applab2,applab3,applab4,applab5,applab6,applab7,applab8,applab9,applab10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applab1=findViewById(R.id.appLabel2);
        applab2=findViewById(R.id.appLabel3);
        applab3=findViewById(R.id.appLabel4);
        applab4=findViewById(R.id.appLabel5);
        applab5=findViewById(R.id.appLabel6);
        applab6=findViewById(R.id.appLabel7);
        applab7=findViewById(R.id.appLabel8);
        applab8=findViewById(R.id.appLabel9);
        applab9=findViewById(R.id.appLabel20);
        applab10=findViewById(R.id.appLabel21);;

        applab1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent1= new Intent(MainActivity.this,FirstPage.class);
                startActivity(intent1);
                return false;
            }
        });
        applab2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent2= new Intent(MainActivity.this,SecondPage.class);
                startActivity(intent2);
                return false;
            }
        });
        applab3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                Intent intent6= new Intent(MainActivity.this,BlogsMainActivity.class);
                startActivity(intent6);

                return false;
            }
        });
        applab4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                Intent intent7= new Intent(MainActivity.this,CollegeEventActivity.class);
                startActivity(intent7);

                return false;
            }
        });
        applab5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent16= new Intent(MainActivity.this,CollegeNewsActivity.class);
                startActivity(intent16);
                return false;
            }
        });
        applab7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent12= new Intent(MainActivity.this,CollegeElearningActivity.class);
                startActivity(intent12);
                return false;
            }
        });
        applab6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent14= new Intent(MainActivity.this,CollegeGalleryActivity.class);
                startActivity(intent14);
                return false;
            }
        });
        applab9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent14= new Intent(MainActivity.this,VideoChatActivity.class);
                startActivity(intent14);
                return false;
            }
        });
        applab10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent14= new Intent(MainActivity.this,AxisMerchandiseActivity.class);
                startActivity(intent14);

                return false;
            }
        });
    }
}

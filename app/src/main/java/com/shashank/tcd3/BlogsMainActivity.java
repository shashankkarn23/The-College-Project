package com.shashank.tcd3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlogsMainActivity extends AppCompatActivity {

    Button btn1BlogsMainActivity,btn2BlogsMainActivity,btn3BlogsMainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogs_main);

        btn1BlogsMainActivity=findViewById(R.id.CircleButton1);
        btn2BlogsMainActivity=findViewById(R.id.CircleButton2);
        btn3BlogsMainActivity=findViewById(R.id.CircleButton3);

        btn1BlogsMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8= new Intent(BlogsMainActivity.this,FirstBlogActivity.class);
                startActivity(intent8);
            }
        });

    }
}

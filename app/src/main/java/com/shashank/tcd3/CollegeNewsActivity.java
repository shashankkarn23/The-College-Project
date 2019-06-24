package com.shashank.tcd3;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CollegeNewsActivity extends AppCompatActivity {

    private ViewPager   sliderViewPager1;
    private LinearLayout dotsLinearLayout1;
    private SliderAdapter sliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_news);

        sliderViewPager1=findViewById(R.id.slideViewPager);
        dotsLinearLayout1=findViewById(R.id.dotsLayout);
        sliderAdapter= new SliderAdapter(this);

        sliderViewPager1.setAdapter(sliderAdapter);

    }


}

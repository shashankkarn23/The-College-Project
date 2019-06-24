package com.shashank.tcd3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FadeInActivity extends Activity implements Animation.AnimationListener {

    ImageView txtMessage;
    Animation animFadein;

    private static int SPLASH_TIME_OUT= 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadein);

        txtMessage = findViewById(R.id.textmessage);
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animFadein.setAnimationListener(this);
        txtMessage.setVisibility(View.VISIBLE);
        txtMessage.startAnimation(animFadein);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i= new Intent(FadeInActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }



    @Override
    public void onAnimationStart(Animation animation) {
    }

    @Override
    public void onAnimationEnd(Animation animation) {
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
    }
}

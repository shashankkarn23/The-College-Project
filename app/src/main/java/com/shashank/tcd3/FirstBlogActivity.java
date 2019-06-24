package com.shashank.tcd3;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class FirstBlogActivity extends AppCompatActivity {

    private TextToSpeech mTTS;
    private Button mButtonSpeak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_blog);

        mButtonSpeak=findViewById(R.id.ReadForMefirst);
        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i==TextToSpeech.SUCCESS){
                   int result=  mTTS.setLanguage(Locale.ENGLISH);
                    if(result==TextToSpeech.LANG_MISSING_DATA ||
                            result==TextToSpeech.LANG_NOT_SUPPORTED){

                        Log.e("TTS","Language Not Supported");
                    }
                    else{
                        mButtonSpeak.setEnabled(true);
                    }
                }
                else{
                    Log.e("TTS","Initialization Failed");
                }
            }
        });

        mButtonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak();
            }
        });
    }


    private void speak(){
        String text="Steven Jobs was born February 24, 1955, in San Francisco, California, and was adopted by Paul and Clara Jobs. He grew up with one sister, Patty. Paul Jobs was a machinist and fixed cars as a hobby. Jobs remembers his father as being very skilled at working with his hands.\n" +
                "\n" +
                "In 1961 the family moved to Mountain View, California. This area, just south of Palo Alto, California, was becoming a center for electronics. Electronics form the basic elements of devices such as radios, televisions, stereos, and computers. At that time people started to refer to the area as \"Silicon Valley.\" This is because a substance called silicon is used in the manufacturing of electronic parts.\n" +
                "\n" +
                "As a child, Jobs preferred doing things by himself. He swam competitively, but was not interested in team sports or other group activities. He showed an early interest in electronics and gadgetry. He spent a lot of time working in the garage workshop of a neighbor who worked at Hewlett-Packard, an electronics manufacturer.\n" +
                "\n" +
                "Jobs also enrolled in the Hewlett-Packard Explorer Club. There he saw engineers demonstrate new products, and he saw his first computer at the age of twelve. He was very impressed, and knew right away that he wanted to work with computers.\n" +
                "\n" +
                "While in high school Jobs attended lectures at the Hewlett-Packard plant. On one occasion he boldly asked William Hewlett (1931–2001), the president, for some parts he needed to complete a class project. Hewlett was so impressed he gave Jobs the parts, and offered him a summer internship at Hewlett-Packard. ";
        mTTS.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }

    @Override
    protected void onDestroy() {
        if(mTTS!=null){
            mTTS.stop();
            mTTS.shutdown();
        }
        super.onDestroy();
    }

}

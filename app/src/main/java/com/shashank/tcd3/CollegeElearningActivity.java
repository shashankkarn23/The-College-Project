package com.shashank.tcd3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class CollegeElearningActivity extends AppCompatActivity {

    RecyclerView rvCollegeElearningActivity;
    Vector<CollegeElearningYouTubeVideos> youTubeVideos= new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_elearning);

        rvCollegeElearningActivity=findViewById(R.id.collegeelearningrecyclerview);
        rvCollegeElearningActivity.setHasFixedSize(true);
        rvCollegeElearningActivity.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/atw7hUrg3_8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/vT5eOKjsKrs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/gCsfk2ei2R8\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new CollegeElearningYouTubeVideos("<iframe width=\"100%\" height=\"93%\" src=\"https://www.youtube.com/embed/xlUFkMKSB3Y\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter= new VideoAdapter(youTubeVideos);
        rvCollegeElearningActivity.setAdapter(videoAdapter);
    }
}

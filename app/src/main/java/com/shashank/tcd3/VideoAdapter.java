package com.shashank.tcd3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<CollegeElearningYouTubeVideos> youtubeVideosList;

    public VideoAdapter(){

    }

    public VideoAdapter(List<CollegeElearningYouTubeVideos> youtubeVideosList){
        this.youtubeVideosList=youtubeVideosList;
    }
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_college_elearning,parent, false);

        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.VideoViewHolder holder, int position) {

        holder.webviewVideoAdapter.loadData(youtubeVideosList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideosList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView webviewVideoAdapter;

        public VideoViewHolder(View itemView) {
            super(itemView);

            webviewVideoAdapter= itemView.findViewById(R.id.collegeelearningwebview1);
            webviewVideoAdapter.getSettings().setJavaScriptEnabled(true);
            webviewVideoAdapter.setWebChromeClient( new WebChromeClient(){

            });

        }

    }

}

package com.shashank.tcd3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] slideImages={ R.drawable.eat_icon,R.drawable.sleep_icon,R.drawable.code_icon};

    public String[] slideHeadings={"REMINDER","SLEEP","CODE"};

    public String[] slideDesc={
            "All the students are hereby informed that day to day attendance is being uploaded on AKTU ERP. The students may get detained also by the university in case of low attendance. Hence the students are advised to attend all the classes in order to avoid any problems in future.In case of any problem like detainment etc., the whole sole responsibility will be of students only " ,
            "Hii guys my name is Shreya Tiwari I am pursuing B.tech from Axis Institute of Technology and Management. I am a C.S.E 3rd year student, and I think these notes are very help full for those students who starts study at the semester end. These are the notes of D.B.M.S(Data Base Management System) as per A.K.T.U Syllabus." ,
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit,sed do eiusmod tempor incididunt ut labore et dolore magna"+
                     " ANUJ TRIPATHI."};

    @Override
    public int getCount() {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==(RelativeLayout)o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.slideImage);
        TextView slideTextViewHeading = (TextView)view.findViewById(R.id.slideHeading);
        TextView slideTextViewDesc= (TextView)view.findViewById(R.id.slideDesc);

        slideImageView.setImageResource(slideImages[position]);
        slideTextViewHeading.setText(slideHeadings[position]);
        slideTextViewDesc.setText(slideDesc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}

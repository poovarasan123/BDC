package com.mastermind.bdc;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mastermind.bdc.Achivement.Achivement;
import com.mastermind.bdc.Announcement.Announcement;
import com.mastermind.bdc.ExamSchedule.ExamSchedule;
import com.mastermind.bdc.Fees.Fees;
import com.mastermind.bdc.Profile.Profile;
import com.mastermind.bdc.Result.Result;
import com.mastermind.bdc.TimeTable.TimeTable;
import com.mastermind.bdc.attendance.Attendance;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;

    int[] images ={R.drawable.logo, R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6};

    SliderData sliderData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing the slider view.
        SliderView sliderView = findViewById(R.id.slider);

        //Initialize adapter
        sliderData = new SliderData(images);
        //set Adapter
        sliderView.setSliderAdapter(sliderData);
        //Set indicator animation
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        //Set transformation animation
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        //Set auto Cycle
        sliderView.startAutoCycle();


    }

    public void openResul(View view) {
        Intent i = new Intent(this, Result.class);
        startActivity(i);
    }

    public void openProfile(View view) {
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

    public void openFees(View view) {
        Intent i = new Intent(this, Fees.class);
        startActivity(i);
    }

    public void openAttendance(View view) {
        Intent i = new Intent(this, Attendance.class);
        startActivity(i);
    }

    public void logout(View view) {
        finish();
    }

    public void openAchivement(View view) {
        Intent i = new Intent(this, Achivement.class);
        startActivity(i);
    }

    public void openTimeTable(View view) {
        Intent i = new Intent(this, TimeTable.class);
        startActivity(i);
    }

    public void openExamSchedule(View view) {
        Intent i = new Intent(this, ExamSchedule.class);
        startActivity(i);
    }

    public void openAnnouncement(View view) {
        Intent i = new Intent(this, Announcement.class);
        startActivity(i);
    }
}
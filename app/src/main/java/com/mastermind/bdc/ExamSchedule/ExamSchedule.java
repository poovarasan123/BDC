package com.mastermind.bdc.ExamSchedule;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.mastermind.bdc.R;

import java.util.ArrayList;

public class ExamSchedule extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_exam_schedule);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Exam Schedule");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<examscheduleModel> examList = new ArrayList<>();

        examList.add(new examscheduleModel("CIA 1",getResources().getDrawable(R.drawable.a1)));
        examList.add(new examscheduleModel("CIA 2",getResources().getDrawable(R.drawable.a2)));
        examList.add(new examscheduleModel("CIA 3",getResources().getDrawable(R.drawable.a3)));
        examList.add(new examscheduleModel("MODEL 1",getResources().getDrawable(R.drawable.a4)));
        examList.add(new examscheduleModel("MODEL 2",getResources().getDrawable(R.drawable.a5)));
        examList.add(new examscheduleModel("Practical",getResources().getDrawable(R.drawable.a6)));
        examList.add(new examscheduleModel("CIA 1",getResources().getDrawable(R.drawable.a1)));
        examList.add(new examscheduleModel("CIA 2",getResources().getDrawable(R.drawable.a2)));
        examList.add(new examscheduleModel("CIA 3",getResources().getDrawable(R.drawable.a3)));
        examList.add(new examscheduleModel("MODEL 1",getResources().getDrawable(R.drawable.a4)));
        examList.add(new examscheduleModel("MODEL 2",getResources().getDrawable(R.drawable.a5)));
        examList.add(new examscheduleModel("Practical",getResources().getDrawable(R.drawable.a6)));
        examList.add(new examscheduleModel("CIA 1",getResources().getDrawable(R.drawable.a1)));
        examList.add(new examscheduleModel("CIA 2",getResources().getDrawable(R.drawable.a2)));
        examList.add(new examscheduleModel("CIA 3",getResources().getDrawable(R.drawable.a3)));
        examList.add(new examscheduleModel("MODEL 1",getResources().getDrawable(R.drawable.a4)));
        examList.add(new examscheduleModel("MODEL 2",getResources().getDrawable(R.drawable.a5)));
        examList.add(new examscheduleModel("Practical",getResources().getDrawable(R.drawable.a6)));

        examscheduleAdapter adapter = new examscheduleAdapter(this, examList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
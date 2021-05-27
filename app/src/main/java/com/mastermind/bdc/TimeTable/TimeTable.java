package com.mastermind.bdc.TimeTable;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.mastermind.bdc.R;

import java.util.ArrayList;

public class TimeTable extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<timetableModel> ttlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_time_table);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Time Table");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        recyclerView = findViewById(R.id.recyclerView);
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a1)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a2)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a3)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a4)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a5)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a6)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a1)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a2)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a3)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a4)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a5)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a6)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a1)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a2)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a3)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a4)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a5)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a6)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a1)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a2)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a3)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a4)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a5)));
        ttlist.add(new timetableModel("CS", getResources().getDrawable(R.drawable.a6)));

        timetableAdapter adapter = new timetableAdapter(this, ttlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
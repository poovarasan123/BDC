package com.mastermind.bdc.Professor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mastermind.bdc.AchivementOthers.ProfAchievement;
import com.mastermind.bdc.AddAttendance.DepAttendance;
import com.mastermind.bdc.ProfTimeTable.TimeTableProf;
import com.mastermind.bdc.R;

public class MainActivityProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prof);
    }

    public void openAttendance(View view) {
        Intent i = new Intent(this, DepAttendance.class);
        startActivity(i);
    }

    public void openTimeTableProf(View view) {
        Intent i = new Intent(this, TimeTableProf.class);
        startActivity(i);
    }

    public void openResul(View view) {
    }

    public void openFees(View view) {
    }

    public void openProfile(View view) {
    }

    public void logout(View view) {
        finish();
    }

    public void openProfessor(View view) {
    }

    public void openAddProfessor(View view) {
    }

    public void openAchivementProf(View view) {
        Intent i = new Intent(this, ProfAchievement.class);
        startActivity(i);
    }
}
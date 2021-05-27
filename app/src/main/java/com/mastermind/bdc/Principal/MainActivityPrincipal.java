package com.mastermind.bdc.Principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mastermind.bdc.Achivement.Achivement;
import com.mastermind.bdc.AchivementOthers.ProfAchievement;
import com.mastermind.bdc.AddProfessor.AddProfessor;
import com.mastermind.bdc.AddTimeTable.ProAddTimeTable;
import com.mastermind.bdc.ExamSchedule.ExamSchedule;
import com.mastermind.bdc.ProfTimeTable.TimeTableProf;
import com.mastermind.bdc.R;
import com.mastermind.bdc.TimeTable.TimeTable;

public class MainActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_principal);
    }

    public void logout(View view) {
        finish();
    }

    public void openAddProfessor(View view) {
        Intent i = new Intent(this, AddProfessor.class);
        startActivity(i);
    }

    public void openTimeTable(View view) {
        Intent i = new Intent(this, TimeTableProf.class);
        startActivity(i);
    }

    public void openExamSchedule(View view) {
        Intent i = new Intent(this, ExamSchedule.class);
        startActivity(i);
    }

    public void openAchivement(View view) {
        Intent i = new Intent(this, ProfAchievement.class);
        startActivity(i);
    }
}
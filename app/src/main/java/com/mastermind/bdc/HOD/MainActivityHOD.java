package com.mastermind.bdc.HOD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mastermind.bdc.Achivement.Achivement;
import com.mastermind.bdc.AchivementOthers.ProfAchievement;
import com.mastermind.bdc.AddProfessor.AddProfessor;
import com.mastermind.bdc.ProfTimeTable.TimeTableProf;
import com.mastermind.bdc.R;

public class MainActivityHOD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_h_o_d);
    }

    public void logout(View view) {
        finish();
    }

    public void openAddProfessor(View view) {
        Intent i = new Intent(this, AddProfessor.class);
        startActivity(i);
    }

    public void openAchivement(View view) {
        Intent i = new Intent(this, ProfAchievement.class);
        startActivity(i);
    }

    public void openPassword(View view) {
        Toast.makeText(this, "under construction!....", Toast.LENGTH_SHORT).show();
    }

    public void openProfTimeTable(View view) {
        Intent i = new Intent(this, TimeTableProf.class);
        startActivity(i);
    }
}
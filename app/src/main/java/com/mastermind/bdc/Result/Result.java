package com.mastermind.bdc.Result;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mastermind.bdc.R;
import com.mastermind.bdc.sems.Sem1;
import com.mastermind.bdc.sems.Sem2;
import com.mastermind.bdc.sems.Sem3;
import com.mastermind.bdc.sems.Sem4;
import com.mastermind.bdc.sems.Sem5;
import com.mastermind.bdc.sems.Sem6;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void openSem1(View view) {
        Intent i = new Intent(this, Sem1.class);
        startActivity(i);
    }

    public void openSem2(View view) {
        Intent i = new Intent(this, Sem2.class);
        startActivity(i);
    }

    public void openSem3(View view) {
        Intent i = new Intent(this, Sem3.class);
        startActivity(i);
    }

    public void openSem4(View view) {
        Intent i = new Intent(this, Sem4.class);
        startActivity(i);
    }

    public void openSem5(View view) {
        Intent i = new Intent(this, Sem5.class);
        startActivity(i);
    }

    public void openSem6(View view) {
        Intent i = new Intent(this, Sem6.class);
        startActivity(i);
    }

    public void openArrear(View view) {
        Toast.makeText(this, "Under Construction!....", Toast.LENGTH_SHORT).show();
    }
}
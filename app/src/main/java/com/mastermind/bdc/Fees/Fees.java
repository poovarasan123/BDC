package com.mastermind.bdc.Fees;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import com.mastermind.bdc.R;

public class Fees extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_fees);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fees");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);
    }
}
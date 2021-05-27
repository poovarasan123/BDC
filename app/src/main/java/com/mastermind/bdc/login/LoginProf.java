package com.mastermind.bdc.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.mastermind.bdc.Professor.MainActivityProf;
import com.mastermind.bdc.R;

public class LoginProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }
        setContentView(R.layout.activity_login_prof);
    }

    public void openlogin(View view) {
        Intent i = new Intent(this, MainActivityProf.class);
        startActivity(i);
    }
}
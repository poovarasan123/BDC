package com.mastermind.bdc.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mastermind.bdc.HOD.MainActivityHOD;
import com.mastermind.bdc.R;

public class HOD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_h_o_d);
    }

    public void openlogin(View view) {
        Intent i = new Intent(this, MainActivityHOD.class);
        startActivity(i);
    }
}
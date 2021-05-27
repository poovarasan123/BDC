package com.mastermind.bdc.login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mastermind.bdc.MainActivity;
import com.mastermind.bdc.R;
import com.mastermind.bdc.Register.Register;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }
        setContentView(R.layout.activity_login);
    }

    public void openlogin(View view) {
        Intent i = new Intent(Login.this, MainActivity.class);
        startActivity(i);
    }

    public void openregister(View view) {
        Intent i = new Intent(Login.this, Register.class);
        startActivity(i);
    }

    public void openProffessor(View view) {
        Intent i = new Intent(this,LoginProf.class);
        startActivity(i);
    }

    public void openHOD(View view) {
        Intent i = new Intent(this, HOD.class);
        startActivity(i);
    }

    public void openProfessor(View view) {
        Intent i = new Intent(this, LoginProf.class);
        startActivity(i);
    }

    public void openPrincipal(View view) {
        Intent i = new Intent(this, Principal.class);
        startActivity(i);
    }
}
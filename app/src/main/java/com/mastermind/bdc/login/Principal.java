package com.mastermind.bdc.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mastermind.bdc.Principal.MainActivityPrincipal;
import com.mastermind.bdc.R;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_principal);
    }

    public void openlogin(View view) {
        Intent i = new Intent(this, MainActivityPrincipal.class);
        startActivity(i);
    }
}
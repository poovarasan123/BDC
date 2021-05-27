package com.mastermind.bdc.AddAttendance;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.mastermind.bdc.R;

public class DepAttendance extends AppCompatActivity {

    TextView it,cdf,ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep_attendance);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Attendance");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        it = findViewById(R.id.it);
        cdf = findViewById(R.id.cdf);
        ba = findViewById(R.id.ba);

        it.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        cdf.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        ba.setEllipsize(TextUtils.TruncateAt.MARQUEE);

        it.setSelected(true);
        cdf.setSelected(true);
        ba.setSelected(true);
    }
}
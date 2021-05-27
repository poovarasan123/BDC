package com.mastermind.bdc.TimeTable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.mastermind.bdc.R;

public class ExtendTimeTable extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extend_time_table);

        imageView = findViewById(R.id.imageView);


    }
}
package com.mastermind.bdc.Achivement;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.mastermind.bdc.R;

import java.util.ArrayList;

public class Achivement extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<achivementModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_achivement);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Achivements");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        recyclerView = findViewById(R.id.recyclerView);
        list.add(new achivementModel("Parthipan","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Vasim akram","III year Computer Science B","CAR RACE","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Vijay","III year Computer Science B","CARD","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Arun","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Alex","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Naveen","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Gopal","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Siva","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Kalai","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Jeeva","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Santhosh","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Elango","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Dhamotharan","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Nirmal","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Prasath","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new achivementModel("Logeshwaran","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));

        achivementAdapter adapter = new achivementAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setItemClickListener(position -> {
            Toast.makeText(this, "position" + position, Toast.LENGTH_SHORT).show();
        });

    }
}
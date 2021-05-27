package com.mastermind.bdc.AchivementOthers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mastermind.bdc.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ProfAchievement extends AppCompatActivity {

    EditText name;
    EditText ydep;
    EditText etname;
    EditText wplace;
    EditText svence;
    Button post;

    DatabaseReference announceref;
    RecyclerView recyclerView;
    ArrayList<profachivementModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_prof_achievement);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Achivements");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        announceref = FirebaseDatabase.getInstance().getReference("announcement");

         name = findViewById(R.id.name);
        ydep = findViewById(R.id.department);
        etname = findViewById(R.id.eventname);
        wplace = findViewById(R.id.place);
        svence = findViewById(R.id.venue);


        recyclerView = findViewById(R.id.recyclerView);
        list.add(new profachivementModel("Parthipan","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Vasim akram","III year Computer Science B","CAR RACE","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Vijay","III year Computer Science B","CARD","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Arun","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Alex","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Naveen","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Gopal","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Siva","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Kalai","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Jeeva","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Santhosh","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Elango","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Dhamotharan","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Nirmal","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Prasath","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));
        list.add(new profachivementModel("Logeshwaran","III year Computer Science B","PUBG","Winner","Bharathidasan College of Atrs and Science Ellispettai, Erode"));

        profachivementAdapter adapter = new profachivementAdapter(this, list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setItemClickListener(position -> {
            Toast.makeText(this, "position" + position, Toast.LENGTH_SHORT).show();
        });
    }

    public void openAnnounceDialog(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View v = getLayoutInflater().inflate(R.layout.custome_achievement_dialog_box,null);
        builder.setView(v);

        /*
        post =findViewById(R.id.button);

        post.setOnClickListener(v1 -> {
            String firebaseid = announceref.push().getKey();
            String sname = name.getText().toString();
            String dep = ydep.getText().toString();
            String ename = etname.getText().toString();
            String place = wplace.getText().toString();
            String venue = svence.getText().toString();
            String date = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());

            if (!TextUtils.isEmpty(sname) && !TextUtils.isEmpty(dep) && !TextUtils.isEmpty(ename) && !TextUtils.isEmpty(place) && !TextUtils.isEmpty(venue)){
                announceTofirebase addannounce = new announceTofirebase(date,sname,dep,ename,place,venue);
                announceref.child(firebaseid).setValue(addannounce).addOnSuccessListener(aVoid ->
                        Toast.makeText(ProfAchievement.this, "Announcement Published!...", Toast.LENGTH_SHORT).show());
            }else{
                Toast.makeText(ProfAchievement.this, "Failed to Post Announcement!......", Toast.LENGTH_SHORT).show();
            }
        });
        */

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
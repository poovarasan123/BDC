package com.mastermind.bdc.ProfTimeTable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.mastermind.bdc.AddTimeTable.ProAddTimeTable;
import com.mastermind.bdc.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeTableProf extends AppCompatActivity implements timetableAdapter.ItemClickListener {

    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;
    ArrayList<timetableModel> ttlist;
    private ProgressBar progressBar;
    private FirebaseStorage fStorage;
    private timetableAdapter adapter;

    DatabaseReference databaseReference;
    private ValueEventListener valueEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.app_theme));
        }
        setContentView(R.layout.activity_time_table_prof);

        floatingActionButton = findViewById(R.id.floatingActionButton2);
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Time Table");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.app_theme)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ttlist = new ArrayList<>();

        Collections.reverse(ttlist);
        adapter = new timetableAdapter(TimeTableProf.this, ttlist);
        recyclerView.setAdapter(adapter);
        adapter.setItemClickListener(TimeTableProf.this);

        fStorage = FirebaseStorage.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("TimeTableDepName");
        valueEventListener = databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                ttlist.clear();

                for(DataSnapshot dataSnapshot: snapshot.getChildren()){
                    timetableModel upload = dataSnapshot.getValue(timetableModel.class);
                    upload.setKey(dataSnapshot.getKey());
                    ttlist.add(upload);

                    Log.d("ttadapter", "onDataChange: " + upload);

                }

                adapter.notifyDataSetChanged();

                progressBar.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(TimeTableProf.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        floatingActionButton.setOnClickListener(v->{
            Intent i = new Intent(this, ProAddTimeTable.class);
            startActivity(i);
        });

    }

    @Override
    public void onItemClickListener(int position) {
        Toast.makeText(this, "Long Press to Delete!.....", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDeleteClick(int position) {
        timetableModel deteletItem = ttlist.get(position);
        String selectedKey = deteletItem.getKey();

        StorageReference imgRef = fStorage.getReferenceFromUrl(deteletItem.getImage());
        imgRef.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                databaseReference.child(selectedKey).removeValue();
                Toast.makeText(TimeTableProf.this, "Table Deleted!.....", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        databaseReference.removeEventListener(valueEventListener);
    }
}
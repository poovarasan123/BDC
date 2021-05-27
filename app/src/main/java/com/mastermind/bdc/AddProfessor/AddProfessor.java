package com.mastermind.bdc.AddProfessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mastermind.bdc.R;

public class AddProfessor extends AppCompatActivity {

    EditText pname,profid,profmail,profmob,profaddr,profpass;
    Spinner dep;
    DatabaseReference profref;
    String role = "Professor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_professor);

        pname = findViewById(R.id.p_name);
        profid = findViewById(R.id.number);
        profmail = findViewById(R.id.mail_id);
        profmob = findViewById(R.id.m_number);
        profaddr = findViewById(R.id.address);
        profpass = findViewById(R.id.pass);
        dep = findViewById(R.id.spinner);

        profref = FirebaseDatabase.getInstance().getReference("professor_creds");
    }

    public void AddProfessor(View view) {
        String firebaseId = profref.push().getKey();
        String name = pname.getText().toString();
        String id = profid.getText().toString();
        String mail = profmail.getText().toString();
        String mob = profmob.getText().toString();
        String addr = profaddr.getText().toString();
        String pass = profpass.getText().toString();
        String selecteddep = dep.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(id) && !TextUtils.isEmpty(mail) && !TextUtils.isEmpty(mob) && !TextUtils.isEmpty(addr) &&
                !TextUtils.isEmpty(pass)){
            if (!selecteddep.equals(" --- Select Department --- ")){
                professorTofirebase addlogin = new professorTofirebase(name,id,mail,mob,addr,pass,selecteddep,role);
                profref.child(firebaseId).setValue(addlogin).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(AddProfessor.this, "Student Added", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });

            }else{
                Toast.makeText(this, "Select Department!....", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Please Fill All Fields!...", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.mastermind.bdc.Register;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mastermind.bdc.R;

public class Register extends AppCompatActivity {

    EditText sname,rnum,smail,smob,saddr,spass;
    Spinner spinnerdep,spinneryear;
    DatabaseReference studentRef;
    String role = "Student";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sname = findViewById(R.id.s_name);
        rnum = findViewById(R.id.r_number);
        smail = findViewById(R.id.mail_id);
        smob = findViewById(R.id.m_number);
        saddr = findViewById(R.id.address);
        spass = findViewById(R.id.pass);
        spinnerdep = findViewById(R.id.spinner);
        spinneryear = findViewById(R.id.spinneryear);

        studentRef = FirebaseDatabase.getInstance().getReference("credentials");
    }

    public void AddStudent(View view) {
        String firebaseId = studentRef.push().getKey();
        String name = sname.getText().toString();
        String reg = rnum.getText().toString();
        String mail = smail.getText().toString();
        String mobile = smob.getText().toString();
        String address = saddr.getText().toString();
        String pass = spass.getText().toString();
        String selecteddep = spinnerdep.getSelectedItem().toString();
        String selectedyear = spinneryear.getSelectedItem().toString();

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(reg) && !TextUtils.isEmpty(mail) && !TextUtils.isEmpty(mobile) && !TextUtils.isEmpty(address)
                && !TextUtils.isEmpty(pass)){
            if (!selecteddep.equals(" --- Select Department --- ") && !selectedyear.equals("--- Select Year ---")){
                    studentTofirebase addlogin = new studentTofirebase(name,reg,mail,mobile,address,pass,selecteddep,selectedyear,role);
                    studentRef.child(firebaseId).setValue(addlogin).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(Register.this, "Student Added", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    });
                }
            else{
                Toast.makeText(this, "Select Department and Year!....", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Please Fill All Fields!...", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.mastermind.bdc.AddTimeTable;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.mastermind.bdc.R;
import com.squareup.picasso.Picasso;

public class ProAddTimeTable extends AppCompatActivity {

    private EditText name;
    private Button picImage,upload;
    private ImageView imageView;
    private Uri imageUri;
    private ProgressBar progressBar;
    private StorageReference timetableref;
    private DatabaseReference depnameref;
    private StorageTask uploadtask;

    private static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_add_time_table);

        name = findViewById(R.id.editText);
        picImage = findViewById(R.id.pic_image);
        upload = findViewById(R.id.upload);
        imageView = findViewById(R.id.imageView2);
        progressBar = findViewById(R.id.progressBar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add TimeTable");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_700)));
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setElevation(0);

        depnameref = FirebaseDatabase.getInstance().getReference("TimeTableDepName");
        timetableref = FirebaseStorage.getInstance().getReference("TimeTable");

        picImage.setOnClickListener( v -> {
            openFileChooser();
        });


        upload.setOnClickListener( v -> {
            if (uploadtask  != null && uploadtask.isInProgress()){
                Toast.makeText(this, "Upload Task is Already In Progress!....", Toast.LENGTH_SHORT).show();
            }else{
                openUpload();
            }

        });
    }

    private String getFileExtansion(Uri uri){
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    private void openUpload() {
        if (imageUri != null && name != null){
            StorageReference storageReference = timetableref.child(System.currentTimeMillis()+"."+ getFileExtansion(imageUri));

            uploadtask = storageReference.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(0);
                        }
                    },500);

                    Toast.makeText(ProAddTimeTable.this, "Upload Successful!...", Toast.LENGTH_SHORT).show();

                    timetableToFirebase ttf = new timetableToFirebase(name.getText().toString().trim(),
                            taskSnapshot.getUploadSessionUri().toString());
                    String uploadid = depnameref.push().getKey();
                    depnameref.child(uploadid).setValue(ttf);

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(ProAddTimeTable.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                            long progress = (100 * snapshot.getBytesTransferred() / snapshot.getTotalByteCount());
                            progressBar.setProgress((int)progress);
                            progressBar.setVisibility(View.VISIBLE);
                        }
                    });
        }else{
            Toast.makeText(this, "Please Select Name and File!.....", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null){
            imageUri = data.getData();

            Picasso.get().load(imageUri).into(imageView);
        }
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }
}
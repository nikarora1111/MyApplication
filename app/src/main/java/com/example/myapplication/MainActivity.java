package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(getApplicationContext());
       FirebaseDatabase database = FirebaseDatabase.getInstance("https://myapplication-9f34c.firebaseio.com/");
        DatabaseReference databaseReference = database.getReferenceFromUrl("https://myapplication-9f34c.firebaseio.com/");
        databaseReference.child("perul").setValue("peruljain");



    }
}

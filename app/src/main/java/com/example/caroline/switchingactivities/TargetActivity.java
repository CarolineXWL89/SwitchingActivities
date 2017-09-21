package com.example.caroline.switchingactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        /*to receive data from the activity that launched this one
        1. retrieve the intent that got us here
        2. unpack the extra using the appropriate key
         */

        Intent i = getIntent();
        String messageFromMain = i.getStringExtra("message1");

        Toast.makeText(this, messageFromMain, Toast.LENGTH_SHORT).show();
    }
}

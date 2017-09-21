package com.example.caroline.switchingactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button switchActivitiesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchActivitiesButton = (Button) findViewById(R.id.button_switcher);
        switchActivitiesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                /*to change activiities, you make an Intent
                The intent describes where you're coming from, where you're going, and what if any info you're taking with you.
                */
                Intent i = new Intent(MainActivity.this, TargetActivity.class);
                //packing our bags - putting data into the intent
                i.putExtra("message1", "Hello from main activity");
                //once the bags are packed, start the trip
                startActivity(i);
            }
        });

    }



}

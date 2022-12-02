package com.example.to_do;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class add_task_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().hide();
        ImageButton start = (ImageButton) findViewById(R.id.arrowbackk);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();
            }
        });
    }
    public void go()
    {
        Intent intent = new Intent(this,home_activity.class);
        startActivity(intent);
    }



    }

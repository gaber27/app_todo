package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class create_acc_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc);
        getSupportActionBar().hide();
        Button start = (Button) findViewById(R.id.c11);
        ImageButton arr = (ImageButton) findViewById(R.id.arrowbackk);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();
            }


        });
        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }

        });
    }
public  void create()
    {
        Intent intent = new Intent(this,login_activity.class);
        startActivity(intent);

    }

    public void go()
    {
        Intent intent = new Intent(this,home_activity.class);
        startActivity(intent);
    }
}
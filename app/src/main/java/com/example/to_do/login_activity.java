package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        Button start = (Button) findViewById(R.id.c11);
        TextView cre= (TextView) findViewById(R.id.create);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();
            }

        });
        cre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }

        });
    }
    public void go()
    {
        Intent intent = new Intent(this,home_activity.class);
        startActivity(intent);
    }


    public  void create()
    {
        Intent intent = new Intent(this,create_acc_activity.class);
        startActivity(intent);

    }






    }

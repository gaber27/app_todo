package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {
    String emailUser, passwordUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        Button start = (Button) findViewById(R.id.c11);
        TextView create= (TextView) findViewById(R.id.create);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validationLogin();
            }

        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }

        });


    }

    // check for email validation

    private boolean validationLogin()
    {
        EditText EmailEditText = (EditText) findViewById(R.id.email);
        emailUser = EmailEditText.getText().toString().trim();
        String email = emailUser.toString().trim();
        EditText passwordEditText = (EditText) findViewById(R.id.password_new);
        passwordUser = passwordEditText.getText().toString().trim();
        String password = passwordUser.toString().trim();
        if(email.isEmpty())
        {
            Toast.makeText(this, "You did not enter a email", Toast.LENGTH_SHORT).show();
            return false ;
        }

        if(password.isEmpty())
        {
            Toast.makeText(this, "You did not enter a password", Toast.LENGTH_SHORT).show();
            return false ;
        }
        else
        {
            go();
            return true ;
        }
    }


    // go to home screen

    public void go()
    {
        Intent intent = new Intent(this, home_activity.class);
        startActivity(intent);

    }

    // go to sign up screen

    public  void create()
    {
        Intent intent = new Intent(this,create_acc_activity.class);
        startActivity(intent);

    }

    }

package com.example.to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class create_acc_activity extends AppCompatActivity {
    String emailUser, passwordUser,nameUser;

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
                validationSingUP();
            }


        });
        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create();
            }

        });
    }
    private boolean validationSingUP()
    {
        EditText FullnameEditText = (EditText) findViewById(R.id.fullname);
        nameUser = FullnameEditText.getText().toString().trim();
        String name = nameUser.toString().trim();
        EditText EmailEditText = (EditText) findViewById(R.id.email_new);
        emailUser = EmailEditText.getText().toString().trim();
        String email = emailUser.toString().trim();
        EditText passwordEditText = (EditText) findViewById(R.id.password_new);
        passwordUser = passwordEditText.getText().toString().trim();
        String password = passwordUser.toString().trim();
        if(name.isEmpty())
        {
            Toast.makeText(this, "You did not enter a name", Toast.LENGTH_SHORT).show();
            return false ;
        }

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
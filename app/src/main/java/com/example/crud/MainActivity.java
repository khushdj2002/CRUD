package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText id,uname,university;
    Button insert,display,update,delete;

    TextView description;

    Database dbc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id= findViewById(R.id.uid);
        uname=findViewById(R.id.uname);
        university=findViewById(R.id.university);
        insert=findViewById(R.id.insert);
        display=findViewById(R.id.display);
        update=findViewById(R.id.update);
        delete=findViewById(R.id.delete);
        description=findViewById(R.id.description);
        dbc = new Database(this);

    }
}
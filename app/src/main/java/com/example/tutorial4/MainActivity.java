package com.example.tutorial4;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tutorial4.Database.DBHelper;

public class MainActivity extends AppCompatActivity {

    Button ALL, ADD, DELETE, UPDATE, SIGIN;
    EditText username, password;
    DBHelper userDb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userDb = new DBHelper(this);
        SQLiteDatabase db = userDb.getReadableDatabase();


        ALL = findViewById(R.id.button2);
        ADD = findViewById(R.id.button3);
         DELETE= findViewById(R.id.button);
        UPDATE = findViewById(R.id.button4);
        SIGIN = findViewById(R.id.button6);
        username = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);

    }



}
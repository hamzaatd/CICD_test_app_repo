package com.maliksoft.cicd_project_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "hello from main activity", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "hello from main activity", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "hello from main activity", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "hello from main activity", Toast.LENGTH_SHORT).show();

    }
}
package com.maliksoft.cicd_project_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this, "this is feature-1 branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "this is feature-1 branch", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "this is feature-1 branch", Toast.LENGTH_SHORT).show();

        addnumber();




    }

    void addnumber(){
       int b =9;
       int c=10;
       int d =b+c;
       System.out.println(""+d);

    }


}
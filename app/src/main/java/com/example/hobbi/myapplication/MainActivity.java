package com.example.hobbi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Hello World!");
                setContentView(R.layout.test);
            }
        });
    }
}
package com.example.patanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coursedetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursedetail);
        Button bbs = (Button) findViewById(R.id.bbs);
        Button btn2=(Button) findViewById(R.id.cancelbtn1);

        bbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), courseregister.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), course.class);
                startActivity(intent);
            }
        });

    }
}
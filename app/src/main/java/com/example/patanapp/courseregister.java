package com.example.patanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class courseregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseregister);
        Button btn = (Button) findViewById(R.id.savebtn);
        Button btn1=(Button) findViewById(R.id.cancelbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), course.class);
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(), coursedetail.class);
                startActivity(intent);
            }
        });
    }
}
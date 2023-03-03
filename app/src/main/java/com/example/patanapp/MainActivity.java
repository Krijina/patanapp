package com.example.patanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerlayout);
        NavigationView navigationView = findViewById(R.id.nav_bar);
        navigationView.setNavigationItemSelectedListener(this);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if (item.getItemId()==R.id.home){
            intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.course){
            intent=new Intent(this,course.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.contact){
            intent=new Intent(this,contact.class);
            startActivity(intent);
        }
        return false;
    }
}
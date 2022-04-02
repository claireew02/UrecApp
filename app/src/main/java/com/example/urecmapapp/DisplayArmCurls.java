package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisplayArmCurls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_arm_curls);
    }
}
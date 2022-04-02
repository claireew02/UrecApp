package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisplayDumbbells extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dumbbells);

    }
}
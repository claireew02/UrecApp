package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Urec extends AppCompatActivity{

    private UrecInfo mUrecInfo;
    String userName;
    //TextView tvUserName = (TextView(().findViewById(R.id.urecText);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urec);
        mUrecInfo = UrecInfo.get();
        //userName = mUrecInfo.getClass().getName();



    }




}

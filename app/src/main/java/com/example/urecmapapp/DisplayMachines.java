package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class DisplayMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_machines);

        Intent arms = getIntent();
    }
    public void displayMachineData(View view) {

        Intent machineData = new Intent(this, MachineData.class);
        startActivity(machineData);

    }

}
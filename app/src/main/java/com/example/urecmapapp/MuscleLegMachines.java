package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuscleLegMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legmachines);
    }
    //method to display dumbbells location
    public void sendDumbbells(View view) {
        Intent dumbbells = new Intent(this, Dumbbells.class);
        startActivity(dumbbells);

    }
    //method to display leg press location
    public void sendLegPress(View view) {
        Intent legPress = new Intent(this, LegMachineLegPress.class);
        startActivity(legPress);

    }
    //method to display power rack
    public void sendPowerRack(View view) {
        Intent powerRack = new Intent(this, PowerRack.class);
        startActivity(powerRack);

    }
    //method to display leg curls
    public void sendLegCurls(View view) {
        Intent legCurls = new Intent(this, LegMachineLegCurls.class);
        startActivity(legCurls);

    }
    //method to display leg extensions
    public void sendLegExtensions(View view) {
        Intent legExtensions = new Intent(this, LegMachineLegExtensions.class);
        startActivity(legExtensions);

    }
    //method to display multi-jungle station
    public void sendCalfRaises(View view) {
        Intent calfRaises = new Intent(this, LegMachineCalfRaises.class);
        startActivity(calfRaises);

    }

}
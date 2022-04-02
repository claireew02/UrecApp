package com.example.urecmapapp;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class DisplayMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_machines_test);
    }

    //method to display dumbbells location
    public void sendDumbbells(View view) {
        Intent dumbbells = new Intent(this, DisplayDumbbells.class);
        startActivity(dumbbells);

    }
    //method to display seated dips location
    public void sendSeatedDips(View view) {
        Intent seatedDips = new Intent(this, DisplaySeatedDips.class);
        startActivity(seatedDips);

    }
    //method to display kettlebells
    public void sendKettlebells(View view) {
        Intent kettlebells = new Intent(this, DisplayKettlebells.class);
        startActivity(kettlebells);

    }
    //method to display arm curls
    public void sendArmCurls(View view) {
        Intent armCurls = new Intent(this, DisplayArmCurls.class);
        startActivity(armCurls);

    }
    //method to display dual action pulleys
    public void sendDualActionPulleys(View view) {
        Intent dualActionPulleys = new Intent(this, DisplayDualActionPulleys.class);
        startActivity(dualActionPulleys);

    }
    //method to display multi-jungle station
    public void sendMultiJungleStation(View view) {
        Intent multiJungleStation = new Intent(this, DisplayMultiJungleStation.class);
        startActivity(multiJungleStation);

    }


}
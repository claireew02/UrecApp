package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuscleBackMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.backmachines);
    }
    //method to display dumbbells location
    public void sendDumbbells(View view) {
        Intent dumbbells = new Intent(this, Dumbbells.class);
        startActivity(dumbbells);

    }
    //method to display power rack
    public void sendPowerRack(View view) {
        Intent powerRack = new Intent(this, PowerRack.class);
        startActivity(powerRack);

    }
    //method to display cable column
    public void sendCableColumn(View view) {
        Intent cableColumn = new Intent(this, CableColumn.class);
        startActivity(cableColumn);

    }
    //method to display pull up bar
    public void sendPullUpBar(View view) {
        Intent pullUpBar = new Intent(this, BackMachinePullUpBar.class);
        startActivity(pullUpBar);

    }
    //method to display rowers
    public void sendRowers(View view) {
        Intent rowers = new Intent(this, BackMachineRowers.class);
        startActivity(rowers);

    }
    //method to display Pec Dec Machine
    public void sendPecDecMachine(View view) {
        Intent pecDecMachine = new Intent(this, BackMachinePecDecMachine.class);
        startActivity(pecDecMachine);

    }

}
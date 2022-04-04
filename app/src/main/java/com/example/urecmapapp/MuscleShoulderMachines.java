package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MuscleShoulderMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shouldermachines);
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
    //method to display military press
    public void sendMilitaryPress(View view) {
        Intent militaryPress = new Intent(this, ShoulderMachineMilitaryPress.class);
        startActivity(militaryPress);

    }
    //method to display shoulder press
    public void sendShoulderPress(View view) {
        Intent shoulderpress = new Intent(this, ShoulderMachineShoulderPress.class);
        startActivity(shoulderpress);

    }
    //method to display shoulder raise machine
    public void sendShoulderRaiseMachine(View view) {
        Intent shoulderRaiseMachine = new Intent(this, ShoulderMachineShoulderRaiseMachine.class);
        startActivity(shoulderRaiseMachine);

    }
}
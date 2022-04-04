package com.example.urecmapapp;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MuscleArmMachines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.armmachines);
    }

    //method to display dumbbells location
    public void sendDumbbells(View view) {
        Intent dumbbells = new Intent(this, Dumbbells.class);
        startActivity(dumbbells);

    }
    //method to display seated dips location
    public void sendSeatedDips(View view) {
        Intent seatedDips = new Intent(this, ArmMachineSeatedDips.class);
        startActivity(seatedDips);

    }
    //method to display kettlebells
    public void sendKettlebells(View view) {
        Intent kettlebells = new Intent(this, ArmMachineKettlebells.class);
        startActivity(kettlebells);

    }
    //method to display arm curls
    public void sendArmCurls(View view) {
        Intent armCurls = new Intent(this, ArmMachineArmCurls.class);
        startActivity(armCurls);

    }
    //method to display dual action pulleys
    public void sendDualActionPulleys(View view) {
        Intent dualActionPulleys = new Intent(this, ArmMachineDualActionPulleys.class);
        startActivity(dualActionPulleys);

    }
    //method to display multi-jungle station
    public void sendMultiJungleStation(View view) {
        Intent multiJungleStation = new Intent(this, ArmMachineMultiJungleStation.class);
        startActivity(multiJungleStation);

    }


}
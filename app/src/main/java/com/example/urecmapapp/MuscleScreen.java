package com.example.urecmapapp;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MuscleScreen extends AppCompatActivity {

Toolbar appbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muscles);
        appbar = findViewById(R.id.toolbar);
        setSupportActionBar(appbar);

    }
    //method to display arm machines
    public void sendArms(View view) {
        Intent arms = new Intent(this, MuscleArmMachines.class);
        startActivity(arms);

    }

    //method to display leg machines
    public void sendLegs(View view) {
        Intent legs = new Intent(this, MuscleLegMachines.class);
        startActivity(legs);

    }

    //method to display back machines
    public void sendBack(View view) {
        Intent back = new Intent(this, MuscleBackMachines.class);
        startActivity(back);

    }

    //method to display shoulder machines
    public void sendShoulders(View view) {
        Intent shoulders = new Intent(this, MuscleShoulderMachines.class);
        startActivity(shoulders);

    }

    //method to display workout plan
    public void sendUser(View view) {
        Intent user = new Intent(this, Urec.class);
        startActivity(user);

    }




}

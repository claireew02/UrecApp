package com.example.urecmapapp;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MuscleScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muscles);


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




}

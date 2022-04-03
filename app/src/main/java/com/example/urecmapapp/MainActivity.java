package com.example.urecmapapp;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //method to display arm machines
    public void sendArms(View view) {
        Intent arms = new Intent(this, DisplayArmMachines.class);
        startActivity(arms);

    }

    //method to display leg machines
    public void sendLegs(View view) {
        Intent legs = new Intent(this, DisplayLegMachines.class);
        startActivity(legs);

    }

    //method to display back machines
    public void sendBack(View view) {
        Intent back = new Intent(this, DisplayBackMachines.class);
        startActivity(back);

    }

    //method to display shoulder machines
    public void sendShoulders(View view) {
        Intent shoulders = new Intent(this, DisplayShoulderMachines.class);
        startActivity(shoulders);

    }




}

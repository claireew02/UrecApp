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
    //send muscle to next page of machines
    public void sendArms(View view) {

        Intent arms = new Intent(this, DisplayMachines.class);
        startActivity(arms);

    }


}

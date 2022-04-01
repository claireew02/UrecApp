package com.example.urecmapapp;

import static java.security.AccessController.getContext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
        setContentView(R.layout.activity_display_machines);
        populateMachinesList();




    }

    private void populateMachinesList(){
        // Construct the data source
        ArrayList<Machine> arrayOfMachines;
        arrayOfMachines = Machine.getMachines();
        // Create the adapter to convert the array to views
        MachinesAdapter adapter = new MachinesAdapter(this, arrayOfMachines);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvMachines);
        listView.setAdapter(adapter);
    }

    public class MachinesAdapter extends ArrayAdapter<Machine> {
        public MachinesAdapter(@NonNull Context context, @NonNull ArrayList<Machine> machines) {
            super(context, 0, machines);
        }


        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            // Get the data item for this position
            Machine machine = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_machine, parent, false);
            }
            // Lookup view for data population
            TextView tvMachineName = (TextView) convertView.findViewById(R.id.tvMachineName);
            TextView tvMuscleGroup = (TextView) convertView.findViewById(R.id.tvMuscleGroup);
            TextView tvFloor = (TextView) convertView.findViewById(R.id.tvFloor);
            // Populate the data into the template view using the data object
            tvMachineName.setText(machine.machineName);
            tvMuscleGroup.setText(machine.machineMuscleGroup.toString());
            tvFloor.setText(machine.machineFloor);
            // Return the completed view to render on screen
            return convertView;
        }
    }


}
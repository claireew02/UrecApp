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
        Intent arms = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_machines);
        populateMachinesList();


    }

    private void populateMachinesList(){
        ListView listView = (ListView) findViewById(R.id.lvMachines);
        // Construct the data source
        ArrayList<Machine> arrayOfMachines = new ArrayList<Machine>();
        // this should add a machine to the list of machines to display
        arrayOfMachines.add(new Machine("Dumbbells", MuscleGroup.ARMS, 2));
        // Create the adapter to convert the array to views
        MachinesAdapter adapter = new MachinesAdapter(this, arrayOfMachines);
        // Attach the adapter to a ListView
        listView.setAdapter(adapter);
    }

    public class MachinesAdapter extends ArrayAdapter<Machine> {
        public MachinesAdapter(Context context, ArrayList<Machine> machines) {
            super(context, R.layout.item_machine, machines);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
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
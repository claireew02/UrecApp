package com.example.urecmapapp;

import java.util.ArrayList;

enum MuscleGroup {
    ARMS,
    BACK,
    LEGS
}

public class Machine {
    public String machineName;
    public MuscleGroup machineMuscleGroup;
    public int machineFloor;

    public Machine(String machineName, MuscleGroup machineMuscleGroup, int machineFloor) {
        this.machineName = machineName;
        this.machineMuscleGroup = machineMuscleGroup;
        this.machineFloor = machineFloor;
    }

    public String getMachineName(){
        return machineName;
    }

    public MuscleGroup getMachineMuscleGroup(){
        return machineMuscleGroup;
    }

    public int getMachineFloor(){
        return machineFloor;
    }

    public static ArrayList<Machine> getMachines(){
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Machine("Please Work", MuscleGroup.ARMS,6));
        machines.add(new Machine("Please Work", MuscleGroup.BACK,6));
        machines.add(new Machine("Please Work", MuscleGroup.LEGS,6));

        return machines;
    }
}

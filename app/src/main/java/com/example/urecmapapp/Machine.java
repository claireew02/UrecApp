package com.example.urecmapapp;

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
}
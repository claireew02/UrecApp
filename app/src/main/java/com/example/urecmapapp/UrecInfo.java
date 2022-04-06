package com.example.urecmapapp;

public class UrecInfo {

    private static String name;
    private static String address;
    private static String phoneNumbers;

    private static final UrecInfo INSTANCE = new UrecInfo();

    private UrecInfo() {
        this.name = "Urec";
        this.address = "102 Student Recreation Complex\n" +
                "Baton Rouge, LA 70803";
        this.phoneNumbers = "Operations Desk  225-578-8601\n" +
                "\n" +
                "Equipment Desk  225-578-8364\n" +
                "\n" +
                "Adventure Center  225-578-3431\n" +
                "\n" +
                "Inclement Weather Hotline  225-578-7246";
    }

    public static UrecInfo getInstance() {
        return INSTANCE;
    }

    public static String getName() {
        return name;
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhoneNumbers() {
        return phoneNumbers;
    }
}

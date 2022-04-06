package com.example.urecmapapp;

public class UrecInfo {

    private static String name;

    private UrecInfo() {
        name = "Joe";
    }

    private static UrecInfo mUrecInfo;

    public static UrecInfo get() {
        if (mUrecInfo == null) {
            mUrecInfo = new UrecInfo();
        }
        return mUrecInfo;
    }

    public static String getName() {
            return name;
}
}

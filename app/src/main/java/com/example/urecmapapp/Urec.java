package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Urec extends AppCompatActivity{


    private UrecInfo mUrecInfo;
    String name;
    String address;
    String phoneNumbers;
    String websiteLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urec);
        mUrecInfo = UrecInfo.getInstance();

        name = mUrecInfo.getName();
        TextView tvUrecText = (TextView) findViewById(R.id.name);
        tvUrecText.setText(name);

        address = mUrecInfo.getAddress();
        TextView tvUrecAddress = (TextView) findViewById(R.id.address);
        tvUrecAddress.setText(address);

        phoneNumbers = mUrecInfo.getPhoneNumbers();
        TextView tvPhoneNumbers = (TextView) findViewById(R.id.phoneNumbers);
        tvPhoneNumbers.setText(phoneNumbers);

        websiteLink = mUrecInfo.getWebsiteLink();
        TextView tvWebsiteLink = (TextView) findViewById(R.id.websiteLink);
        tvWebsiteLink.setText(websiteLink);
        //this doesnt work lol
        tvWebsiteLink.setMovementMethod(LinkMovementMethod.getInstance());



    }




}

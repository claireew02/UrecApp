package com.example.urecmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserPage extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.urecmapapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userpage);
    }

    public void sendUser(View view){
        Intent intent = new Intent(this, UserDisplay.class);
        EditText editText = (EditText) findViewById(R.id.UserName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
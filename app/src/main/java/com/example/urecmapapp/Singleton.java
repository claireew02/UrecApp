package com.example.urecmapapp;

import android.widget.EditText;


import com.google.firebase.firestore.auth.User;

public class Singleton {
    private UserSingleton(){

        User user = new User();
        EditText editText = (EditText) findViewById(R.id.UserName);
        String message = editText.getText().toString();
        user.setFirstName(message);

    }
}

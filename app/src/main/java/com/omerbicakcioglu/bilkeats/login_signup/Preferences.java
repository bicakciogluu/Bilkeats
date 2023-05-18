package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omerbicakcioglu.bilkeats.R;

public class Preferences extends AppCompatActivity {
    private boolean nutAlergy = false;
    private boolean lacotese = false;
    private boolean vegan = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);
    }


}
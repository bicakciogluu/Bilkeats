package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.omerbicakcioglu.bilkeats.R;

public class Preferences extends AppCompatActivity {
    private boolean isNutAllergic = false;
    private boolean isLactoseIntolerant = false;
    private boolean isVegan = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);



    }
    public void ok(){

        Switch veganSwitch = (Switch) findViewById(R.id.veganSwitch);
        if(veganSwitch.isChecked()){
            isVegan = true;
        }
        Switch lactose = (Switch) findViewById(R.id.lactose);
        if(lactose.isChecked()){
            isLactoseIntolerant = true;
        }
        Switch nutAllergy = (Switch) findViewById(R.id.nutAllergy);
        if(nutAllergy.isChecked()){
            isNutAllergic = true;
        }

    }
    public boolean getVegan(){
        return isVegan;
    }
    public boolean getLactose(){
        return isLactoseIntolerant;
    }
    public boolean getNut(){
        return isNutAllergic;
    }



}
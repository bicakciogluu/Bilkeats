package com.omerbicakcioglu.bilkeats.calorietracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.omerbicakcioglu.bilkeats.R;

public class calorie_ extends AppCompatActivity {
    public int carbonCalorie;
    public int proteinCalorie;
    public int fatCalorie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracking);
        EditText carbon = findViewById(R.id.outCarb);
        EditText protein = findViewById(R.id.outProt);
        EditText fat = findViewById(R.id.outFat);
        carbonCalorie = 0;
        proteinCalorie = 0;
        fatCalorie = 0;
    }

}
package com.omerbicakcioglu.bilkeats.calorietracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.omerbicakcioglu.bilkeats.R;

public class CalorieTracking extends AppCompatActivity {
    public int carbonCalorie;
    public int proteinCalorie;
    public int fatCalorie;
    public int sum;
    public int proteinCalorieRemain;
    public int fatCalorieRemain;
    public int carbonCalorieRemain;
    EditText carbon;
    EditText protein;
    EditText fat;
    TextView sumCalories;
    TextView remainProt;
    TextView remainCarb;
    TextView remainFat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracking);
        carbon = findViewById(R.id.outCarb);
        protein = findViewById(R.id.outProt);
        fat = findViewById(R.id.outFat);
        carbonCalorie = 0;
        proteinCalorie = 0;
        fatCalorie = 0;
        sum = 0;
        sumCalories = findViewById(R.id.textView);
        remainProt = findViewById(R.id.remainProt);
        remainCarb = findViewById(R.id.remainCarb);
        remainFat = findViewById(R.id.remainFat);
        remainCarb.setText("" +800);
        remainProt.setText("" +800);
        remainFat.setText("" +800);

    }

    public void outsideAdd(View view){
        carbonCalorie = Integer.parseInt(carbon.getText().toString());
        fatCalorie = Integer.parseInt(fat.getText().toString());
        proteinCalorie = Integer.parseInt(protein.getText().toString());
        fatCalorieRemain = Integer.parseInt(remainFat.getText().toString());
        proteinCalorieRemain = Integer.parseInt(remainProt.getText().toString());
        carbonCalorieRemain = Integer.parseInt(remainCarb.getText().toString());
        sum += carbonCalorie;
        sum += fatCalorie;
        sum += proteinCalorie;
        sumCalories.setText(sum);
        remainFat.setText(fatCalorieRemain - fatCalorie);
        remainCarb.setText(carbonCalorieRemain - carbonCalorie);
        remainProt.setText(proteinCalorieRemain - proteinCalorie);
    }
}
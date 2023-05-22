package com.omerbicakcioglu.bilkeats.calorietracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.databinding.ActivityCalorieTrackingBinding;

import org.checkerframework.checker.units.qual.A;

public class CalorieTrackingActivity extends AppCompatActivity {
    public int takeCarbon;
    public int takeProtein;
    public int takeFat;
    public int sum;
    public int shouldSumCalorie;
    public int proteinCalorieRemain;
    public int fatCalorieRemain;
    public int carbonCalorieRemain;


    ActivityCalorieTrackingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalorieTrackingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String gender = "Male";
        String activityString = "Ligth";
        double weigth = 80;
        double height = 180;
        int age = 20;
        double activity = 1.35;
        if(activityString.equals("Ligth")) activity = 1.2;
        else if (activityString.equals("Moderate")) activity = 1.35;
        else if (activityString.equals("Active")) activity = 1.5;

        if(gender.equals("Female"))
            shouldSumCalorie = (int)((655.1 + 9.56 * weigth + 1.85 * height - 4.67 * age) * activity);
        else if (gender.equals("Male"))
            shouldSumCalorie = (int)((66.5 + 13.75 * weigth + 5 * height - 6.77 * age) * activity);


        proteinCalorieRemain = (int)(shouldSumCalorie * 30.0/100);
        carbonCalorieRemain = (int)(shouldSumCalorie * 45.0/100);;
        fatCalorieRemain = (int)(shouldSumCalorie * 25.0/100);
        while(shouldSumCalorie != proteinCalorieRemain + carbonCalorieRemain + fatCalorieRemain){
            carbonCalorieRemain += 1;
        }

        binding.shouldSome.setText("of " + shouldSumCalorie + " kcal");
        binding.remainCarb.setText("" + carbonCalorieRemain);
        binding.remainProt.setText("" + proteinCalorieRemain);
        binding.remainFat.setText("" + fatCalorieRemain);
        binding.sumCalorie.setText("" + 0);
        binding.circularProgressIndicator.setProgress(0);


    }
    public void outsideAdd(View view){
        takeProtein = Integer.parseInt(binding.outProt.getText().toString());
        proteinCalorieRemain -= takeProtein;
        binding.remainProt.setText("" + proteinCalorieRemain);
        takeCarbon = Integer.parseInt(binding.outCarb.getText().toString());
        carbonCalorieRemain -= takeCarbon;
        binding.remainCarb.setText("" + carbonCalorieRemain);
        takeFat = Integer.parseInt(binding.outFat.getText().toString());
        fatCalorieRemain -= takeFat;
        binding.remainFat.setText("" + fatCalorieRemain);
        sum = Integer.parseInt(binding.sumCalorie.getText().toString());
        sum = sum + takeFat + takeCarbon + takeProtein;
        binding.sumCalorie.setText("" + sum);
        binding.circularProgressIndicator.setProgress(100*sum/shouldSumCalorie);

    }
}
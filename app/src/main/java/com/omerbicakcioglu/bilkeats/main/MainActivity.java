package com.omerbicakcioglu.bilkeats.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.TestActivity;
import com.omerbicakcioglu.bilkeats.calorietracking.CalorieTracking;
import com.omerbicakcioglu.bilkeats.databinding.ActivityMainBinding;
import com.omerbicakcioglu.bilkeats.lpd.LpdActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }

    // Temporary
    public void lpdButtonClicked(View view ) {
        startActivity(new Intent(this, LpdActivity.class));
    }

    public void calorie(View vies){
        startActivity(new Intent(this, TestActivity.class));
    }

}
package com.omerbicakcioglu.bilkeats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.omerbicakcioglu.bilkeats.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {
    public int takeCarbon;
    public int takeProtein;
    public int takeFat;
    public int sum;
    public int shouldSumCalorie;
    public int proteinCalorieRemain;
    public int fatCalorieRemain;
    public int carbonCalorieRemain;


    ActivityTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        proteinCalorieRemain = 800;
        carbonCalorieRemain = 800;
        fatCalorieRemain = 800;
        shouldSumCalorie = proteinCalorieRemain + carbonCalorieRemain + fatCalorieRemain;
        binding.shouldSome.setText("of " + shouldSumCalorie + " kcal");
        binding.remainCarb.setText("" + carbonCalorieRemain);
        binding.remainProt.setText("" + proteinCalorieRemain);
        binding.remainFat.setText("" + fatCalorieRemain);
        binding.sumCalorie.setText("" + 0);


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

    }
}
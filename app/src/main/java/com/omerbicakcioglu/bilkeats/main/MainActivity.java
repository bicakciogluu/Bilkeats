package com.omerbicakcioglu.bilkeats.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationBarView;
import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.calorietracking.CalorieTrackingActivity;
import com.omerbicakcioglu.bilkeats.databinding.ActivityMainBinding;
import com.omerbicakcioglu.bilkeats.lpd.LpdActivity;
import com.omerbicakcioglu.bilkeats.pianopage.PianoPage;
import com.omerbicakcioglu.bilkeats.settings.SettingsActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.home:
                        // Already in main
                        break;

                    case R.id.calorieTrack:
                        startActivity(new Intent(MainActivity.this, CalorieTrackingActivity.class));
                        break;

                    case R.id.settings:
                        startActivity(new Intent(MainActivity.this, SettingsActivity.class ));
                        break;

                    case R.id.piano:
                        startActivity(new Intent(MainActivity.this, PianoPage.class));
                        break;

                }
                return true;
            }
        });

    }





}
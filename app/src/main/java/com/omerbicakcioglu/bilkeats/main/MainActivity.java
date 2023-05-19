package com.omerbicakcioglu.bilkeats.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.TestActivity;
import com.omerbicakcioglu.bilkeats.databinding.ActivityMainBinding;
import com.omerbicakcioglu.bilkeats.lpd.LpdActivity;

public class MainActivity extends AppCompatActivity {

 BottomNavigationView nav;

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        nav = findViewById(R.id.nav);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.calorieTrack:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.piano:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                }



                return true;
            }
        });

    }

    // Temporary
    public void lpdButtonClicked(View view ) {
        startActivity(new Intent(this, LpdActivity.class));
    }

    public void calorie(View vies){
        startActivity(new Intent(this, TestActivity.class));
    }

}
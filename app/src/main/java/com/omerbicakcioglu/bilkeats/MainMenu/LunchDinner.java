package com.omerbicakcioglu.bilkeats.MainMenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;
import com.omerbicakcioglu.bilkeats.MainMenu.ui.main.SectionsPagerAdapter;
import com.omerbicakcioglu.bilkeats.databinding.ActivityLunchDinnerBinding;

public class LunchDinner extends AppCompatActivity {

    private ActivityLunchDinnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLunchDinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

     }
}
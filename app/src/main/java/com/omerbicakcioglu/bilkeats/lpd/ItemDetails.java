package com.omerbicakcioglu.bilkeats.lpd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.databinding.ActivityItemDetailsBinding;
import com.squareup.picasso.Picasso;

public class ItemDetails extends AppCompatActivity {
   private ActivityItemDetailsBinding binding;
   private Item itemClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityItemDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

         Intent intent = getIntent();
         itemClicked = (Item) intent.getSerializableExtra("item");

        Picasso.get().load(itemClicked.imageUrl).into(binding.declaredImage);
         binding.descriptionTextView.setText(itemClicked.description);
         binding.dateTextView.setText(itemClicked.date);
    }
}
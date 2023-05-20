package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.databinding.ActivityPreferencesBinding;
import com.omerbicakcioglu.bilkeats.lpd.DeclareActivity;
import com.omerbicakcioglu.bilkeats.lpd.LpdActivity;

import java.util.HashMap;

public class Preferences extends AppCompatActivity {
    private boolean isNutAllergic = false;
    private boolean isLactoseIntolerant = false;
    private boolean isVegan = false;
    private FirebaseFirestore firebaseFirestore;
    private FirebaseStorage firebaseStorage;
    private FirebaseAuth auth;
    private StorageReference storageReference;
    private ActivityPreferencesBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPreferencesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        firebaseStorage = FirebaseStorage.getInstance();
        auth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        storageReference = firebaseStorage.getReference();


    }

    // These method gives an error (can not find the veganswitch):

   /* public void okButtonClicked() {
        String stringPath = "Users/Allergens/" + auth.getCurrentUser().getEmail();


        Switch veganSwitch = (Switch) findViewById(binding.veganSwitch.getId());
        if (veganSwitch.isChecked()) {
            isVegan = true;
        }
        Switch lactose = (Switch) findViewById(binding.lactoseSwitch.getId());
        if (lactose.isChecked()) {
            isLactoseIntolerant = true;
        }
        Switch nutAllergy = (Switch) findViewById(binding.nutSwitch.getId());
        if (nutAllergy.isChecked()) {
            isNutAllergic = true;
        }
        firebaseStorage.getReference(stringPath).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Registering data into firebaseFirestore
                HashMap<String, Object> userFoodData = new HashMap<>();
                userFoodData.put("isVegan", isVegan);
                userFoodData.put("isLactoseIntolerant", isLactoseIntolerant);
                userFoodData.put("isNutAllergic", isNutAllergic);


                firebaseFirestore.collection("Users").add(userFoodData).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    public void onSuccess(DocumentReference documentReference) {
                        Intent intentToLpdActivity = new Intent(Preferences.this, LpdActivity.class);
                        intentToLpdActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intentToLpdActivity);
                    }


                });
            }
        });
    }*/
}
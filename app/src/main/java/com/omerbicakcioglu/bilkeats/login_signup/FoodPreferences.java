package com.omerbicakcioglu.bilkeats.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.storage.FirebaseStorage;
import com.omerbicakcioglu.bilkeats.R;

public class FoodPreferences extends AppCompatActivity {
    String[] foodPreferenceList={"meatSoup", "vegetableSoup" ,"yogurtSoup" ,"legumeSoup", "chickenBased", "legumeBased", "redMeatBased","fishBased", "vegetableBased", "rice", "pasta", "noodle","salad", "chocolateDessert","syrupDessert", "milkDessert", "pastry", "yogurt", "pickles", "fruits"};
    int[] foodPreferencePoints= new int[20];
    FirebaseStorage firebaseStorage = 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_preferences);
    }
    public double getSoupPoint(boolean m, boolean v, boolean l, boolean c){
        double result = 5;



    }


}
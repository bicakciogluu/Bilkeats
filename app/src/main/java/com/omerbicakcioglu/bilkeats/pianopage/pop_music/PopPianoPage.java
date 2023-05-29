package com.omerbicakcioglu.bilkeats.pianopage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.R;

public class PopPianoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_piano_page);
    }

    public void popMusic1(View view){
        Intent intent = new Intent(this, PopMusic1.class);
        startActivity(intent);
    }

    public void popMusic2(View view){
        Intent intent = new Intent(this, PopMusic2.class);
        startActivity(intent);
    }

    public void popMusic3(View view){
        Intent intent = new Intent(this, PopMusic3.class);
        startActivity(intent);
    }

    public void popMusic4(View view){
        Intent intent = new Intent(this, PopMusic4.class);
        startActivity(intent);
    }

    public void popMusic5(View view){
        Intent intent = new Intent(this, PopMusic5.class);
        startActivity(intent);
    }
}
package com.omerbicakcioglu.bilkeats.pianopage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omerbicakcioglu.bilkeats.R;

public class ClassicalMusic2 extends AppCompatActivity {

    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical_music2);

        backButton = findViewById(R.id.backButton2);

        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                onBackPressed();
            }
        });
    }
}
package com.omerbicakcioglu.bilkeats.pianopage.classical_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.pianopage.pop_music.PopPianoPage;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockPianoPage;

public class ClassicalPianoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical_piano_page);
    }

    public void classicalMusic1(View view){
        Intent intent = new Intent(this, ClassicalMusic1.class);
        startActivity(intent);
    }

    public void classicalMusic2(View view){
        Intent intent = new Intent(this, ClassicalMusic2.class);
        startActivity(intent);
    }

    public void classicalMusic3(View view){
        Intent intent = new Intent(this, ClassicalMusic3.class);
        startActivity(intent);
    }

    public void classicalMusic4(View view){
        Intent intent = new Intent(this, ClassicalMusic4.class);
        startActivity(intent);
    }

    public void classicalMusic5(View view){
        Intent intent = new Intent(this, ClassicalMusic5.class);
        startActivity(intent);
    }

    public void goToRock(View view){
        Intent intent = new Intent(this, RockPianoPage.class);
        startActivity(intent);
    }

    public void goToPop(View view){
        Intent intent = new Intent(this, PopPianoPage.class);
        startActivity(intent);
    }
}
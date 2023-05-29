package com.omerbicakcioglu.bilkeats.pianopage.rock_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omerbicakcioglu.bilkeats.R;
import com.omerbicakcioglu.bilkeats.pianopage.classical_music.ClassicalPianoPage;
import com.omerbicakcioglu.bilkeats.pianopage.pop_music.PopPianoPage;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockMusic1;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockMusic2;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockMusic3;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockMusic4;
import com.omerbicakcioglu.bilkeats.pianopage.rock_music.RockMusic5;

public class RockPianoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_piano_page);
    }

    public void rockMusic1(View view){
        Intent intent = new Intent(this, RockMusic1.class);
        startActivity(intent);
    }

    public void rockMusic2(View view){
        Intent intent = new Intent(this, RockMusic2.class);
        startActivity(intent);
    }

    public void rockMusic3(View view){
        Intent intent = new Intent(this, RockMusic3.class);
        startActivity(intent);
    }

    public void rockMusic4(View view){
        Intent intent = new Intent(this, RockMusic4.class);
        startActivity(intent);
    }

    public void rockMusic5(View view){
        Intent intent = new Intent(this, RockMusic5.class);
        startActivity(intent);
    }

    public void goToClassic(View view){
        Intent intent = new Intent(this, ClassicalPianoPage.class);
        startActivity(intent);
    }

    public void goToPop(View view){
        Intent intent = new Intent(this, PopPianoPage.class);
        startActivity(intent);
    }
}
package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma3);
    }

    //Choosing the right option "jump the fence"
    public void goDilemma4(View view) {
        Intent Dilemma4 = new Intent(this, Dilemma4.class);
        startActivity(Dilemma4);
    }

    //Choosing the wrong option "attempt to seduce him"
    public void goDilemma31(View view) {
        Intent Dilemma31 = new Intent(this, Dilemma31.class);
        startActivity(Dilemma31);
    }

    //Choosing the wrong option "go to the car and cry"
    public void goDilemma32(View view) {
        Intent Dilemma32 = new Intent(this, Dilemma32.class);
        startActivity(Dilemma32);
    }

}
package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dilemma5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma5);
    }

    //Choosing the right option "take the pill"
    public void goDilemma6(View view) {
        Intent Dilemma6 = new Intent(this, Dilemma6.class);
        startActivity(Dilemma6);
    }

    //Choosing the wrong option "refuse to take the pill"
    public void goDilemma51(View view) {
        Intent Dilemma51 = new Intent(this, Dilemma51.class);
        startActivity(Dilemma51);
    }
}
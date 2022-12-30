package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma2);
    }

    //Choosing the right option "buy expensive tickets"
    public void goDilemma3(View view) {
        Intent Dilemma3 = new Intent(this, Dilemma3.class);
        startActivity(Dilemma3);
    }

    //Choosing the wrong option "buy cheap tickets"
    public void goDilemma21(View view) {
        Intent Dilemma21 = new Intent(this, Dilemma21.class);
        startActivity(Dilemma21);
    }

}
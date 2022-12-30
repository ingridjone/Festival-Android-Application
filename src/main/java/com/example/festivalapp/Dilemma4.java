package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma4);
    }

    //Choosing the right option "sneak backstage"
    public void godilemma5(View view) {
        Intent dilemma5 = new Intent(this, dilemma5.class);
        startActivity(dilemma5);
    }

    //Choosing the wrong option "hide in a portable bathroom"
    public void goDilemma41(View view) {
        Intent Dilemma41 = new Intent(this, Dilemma41.class);
        startActivity(Dilemma41);
    }

    //Choosing the wrong option "give a heartfelt speech"
    public void goDilemma42(View view) {
        Intent Dilemma42 = new Intent(this, Dilemma42.class);
        startActivity(Dilemma42);
    }

}
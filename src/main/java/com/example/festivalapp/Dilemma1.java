package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma1);
        }

    //OnClick function to go to next screen
    public void goDilemma2(View view) {
        Intent Dilemma2 = new Intent(this, Dilemma2.class);
        startActivity(Dilemma2);
    }
}
package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma51);
    }

    //OnClick function to try again from the start
    public void goDilemma1(View view) {
        Intent Dilemma1 = new Intent(this, Dilemma1.class);
        startActivity(Dilemma1);
    }

}
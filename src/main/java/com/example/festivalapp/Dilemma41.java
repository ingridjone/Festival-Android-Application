package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma41);
    }

    //OnClick function to try again
    public void goDilemma4(View view) {
        Intent Dilemma4 = new Intent(this, Dilemma4.class);
        startActivity(Dilemma4);
    }

}
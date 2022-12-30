package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma21);
    }

    //OnClick function to try again
    public void goDilemma2(View view) {
        Intent Dilemma2 = new Intent(this, Dilemma2.class);
        startActivity(Dilemma2);
    }

}
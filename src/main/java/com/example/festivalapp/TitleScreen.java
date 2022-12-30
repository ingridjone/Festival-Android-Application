package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    //OnClick function to go to next screen
    public void goDilemma1(View view) {
        Intent Dilemma1 = new Intent(this, Dilemma1.class);
        startActivity(Dilemma1);
    }

 //All images have been designed using the app Canva and its royalty-free library
}
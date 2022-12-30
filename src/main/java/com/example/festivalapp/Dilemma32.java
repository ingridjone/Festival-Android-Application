package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma32);
    }

    //OnClick function to try again
    public void goDilemma3(View view) {
        Intent Dilemma3 = new Intent(this, Dilemma3.class);
        startActivity(Dilemma3);
    }

}
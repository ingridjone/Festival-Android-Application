package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma6);
    }

    //Choosing the right option "join the mosh pit"
    public void goDilemma7(View view) {
        Intent Dilemma7 = new Intent(this, Dilemma7.class);
        startActivity(Dilemma7);
    }

    //Choosing the wrong option "escape the circle"
    public void goDilemma61(View view) {
        Intent Dilemma61 = new Intent(this, Dilemma61.class);
        startActivity(Dilemma61);
    }

}
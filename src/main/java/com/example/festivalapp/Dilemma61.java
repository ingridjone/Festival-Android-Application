package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dilemma61 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma61);
    }

    //OnClick function to try again
    public void goDilemma6(View view) {
        Intent Dilemma6 = new Intent(this, Dilemma6.class);
        startActivity(Dilemma6);
    }

}
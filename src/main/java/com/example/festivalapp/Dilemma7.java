package com.example.festivalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dilemma7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilemma7);
    }

    //Choosing the option to rate festival survival
    public void goRate(View view) {
        Intent Rate = new Intent(this, Rate.class);
        startActivity(Rate);
    }

    //Choosing the option to replay the game
    public void goDilemma1(View view) {
        Intent Dilemma1 = new Intent(this, Dilemma1.class);
        startActivity(Dilemma1);
    }

    //Click image to reveal secret message and play sound
    public void msgReveal(View view) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ding);
        mediaPlayer.start();
        ImageView imgHospital = (ImageView) findViewById(R.id.imgHospital);
        imgHospital.animate().alpha(0).setDuration(5000);
    }
}
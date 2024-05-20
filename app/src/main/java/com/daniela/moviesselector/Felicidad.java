package com.daniela.moviesselector;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Felicidad extends AppCompatActivity {
    ImageView headF;
    MediaPlayer imgFelicidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicidad);

        headF = findViewById(R.id.headF);
        imgFelicidad = MediaPlayer.create(this, R.raw.felicidad);
        headF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFelicidad.start();
            }

        });

    }

    @Override
    public void onDestroy(){
        Felicidad.super.onDestroy();
        if (imgFelicidad != null){
            imgFelicidad.release();
            imgFelicidad = null;
        }
    }
}
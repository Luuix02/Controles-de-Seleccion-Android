package com.daniela.moviesselector;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Toy extends AppCompatActivity {

    ImageView headT;
    MediaPlayer imgToy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toy);

        headT = findViewById(R.id.headT);
        imgToy = MediaPlayer.create(this, R.raw.toy);
        headT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgToy.start();
            }
        });

    }
    @Override
    public void onDestroy(){
        Toy.super.onDestroy();
        if (imgToy != null){
            imgToy.release();
            imgToy = null;
        }
    }
}
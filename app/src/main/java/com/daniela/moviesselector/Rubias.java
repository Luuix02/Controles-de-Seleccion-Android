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

public class Rubias extends AppCompatActivity {
    ImageView headR;
    MediaPlayer imgRubias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubias);

        headR = findViewById(R.id.headR);
        imgRubias = MediaPlayer.create(this, R.raw.rubias);
        headR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgRubias.start();
            }
        });

    }
    @Override
    public void onDestroy(){
        Rubias.super.onDestroy();
        if (imgRubias != null){
            imgRubias.release();
            imgRubias = null;
        }
    }
}
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

public class Avengers extends AppCompatActivity {
    ImageView headA;
    MediaPlayer imgAveng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers);

        headA = findViewById(R.id.headA);
        imgAveng = MediaPlayer.create(this, R.raw.avengers);
        headA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAveng.start();
            }
        });

    }
    @Override
    public void onDestroy(){
        Avengers.super.onDestroy();
        if (imgAveng != null){
            imgAveng.release();
            imgAveng = null;
        }
    }
}
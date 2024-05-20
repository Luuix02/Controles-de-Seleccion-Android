package com.daniela.moviesselector;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Amor extends AppCompatActivity {

    ImageView head;

    MediaPlayer imgLove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amor);

        head = findViewById(R.id.head);
        imgLove = MediaPlayer.create(this, R.raw.amor);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               imgLove.start();
            }
        });
    }
    @Override
    public void onDestroy(){
        Amor.super.onDestroy();
        if (imgLove != null){
            imgLove.release();
            imgLove = null;
        }
    }
}

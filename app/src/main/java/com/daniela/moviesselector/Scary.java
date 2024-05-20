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

public class Scary extends AppCompatActivity {

    ImageView headS;

    MediaPlayer imgScary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scary);

        headS = findViewById(R.id.headS);
        imgScary = MediaPlayer.create(this, R.raw.scary);
        headS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgScary.start();
            }
        });
    }
    @Override
    public void onDestroy(){
        Scary.super.onDestroy();
        if (imgScary!= null){
            imgScary.release();
            imgScary = null;
        }
    }
}

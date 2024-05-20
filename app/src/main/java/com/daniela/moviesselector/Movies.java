package com.daniela.moviesselector;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Movies extends AppCompatActivity {

    ListView moviesP;
    String[] Peliculas = new String[]{"Amor redentor", "Toy Story", "Scari Movie", "The Avengers", "¿Dónde están las rubias?", "En busca de la felicidad"};
    ArrayAdapter<String> adapterPeliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);


        moviesP = findViewById(R.id.moviesP);
        moviesP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Movies.this, "Seleccionaste" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                String peliculaSeleccionada = Peliculas[position];
                if (peliculaSeleccionada.equals("Amor redentor")) {
                    Intent goLove = new Intent(Movies.this, Amor.class);
                    startActivity(goLove);
                } else if (peliculaSeleccionada.equals("Toy Story")) {
                    Intent goToy = new Intent(Movies.this, Toy.class);
                    startActivity(goToy);
                } else if (peliculaSeleccionada.equals("Scari Movie")) {
                    Intent goScari = new Intent(Movies.this, Scary.class);
                    startActivity(goScari);

                } else if (peliculaSeleccionada.equals("The Avengers")) {
                    Intent goAvengers = new Intent(Movies.this, Avengers.class);
                    startActivity(goAvengers);
                } else if (peliculaSeleccionada.equals("¿Dónde están las rubias?")) {
                    Intent goRubias = new Intent(Movies.this, Rubias.class);
                    startActivity(goRubias
                    );

                } else if (peliculaSeleccionada.equals("En busca de la felicidad")) {
                    Intent goFelicidad = new Intent(Movies.this, Felicidad.class);
                    startActivity(goFelicidad);

                }

            }

        });
        adapterPeliculas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Peliculas);
        moviesP.setAdapter(adapterPeliculas);


    }
}
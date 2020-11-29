package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));
        movies.add(new Movie("Мулан","fhdfh",R.drawable.film,"studio","5","fggfj"));

        recyclerView = findViewById(R.id.film_recycler);
        moviesAdapter = new MoviesAdapter(movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(moviesAdapter);
        moviesAdapter.setListener(new OnFilmClickListener() {
            @Override
            public void onClick() {
                startActivity(new Intent(MainActivity.this,DetailActivity.class));
            }
        });
    }

}
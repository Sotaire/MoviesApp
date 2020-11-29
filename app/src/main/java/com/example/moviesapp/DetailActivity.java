package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ImageView filmItem;
    TextView description;
    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        filmItem = findViewById(R.id.movies_iv);
        description = findViewById(R.id.detail_text);
        filmItem.setAnimation(AnimationUtils.loadAnimation(this,R.anim.animation));
        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                description.setMaxLines(Integer.MAX_VALUE);
            }
        });
        initRecycler();
    }

    private void initRecycler() {
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

        recyclerView = findViewById(R.id.recycler_deatil);
        moviesAdapter = new MoviesAdapter(movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(moviesAdapter);
    }
}
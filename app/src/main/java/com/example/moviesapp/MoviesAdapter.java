package com.example.moviesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    ArrayList<Movie> movies;
    OnFilmClickListener listener;

    public MoviesAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }

    public void setListener(OnFilmClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.film_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(movies.get(position).getTitle());
        holder.image.setImageResource(movies.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.movies_title);
            image = itemView.findViewById(R.id.movies_iv);
            image.setOnClickListener(view -> {
                listener.onClick();
            });
            Animations.itemAnimate(image,title,10,500);
        }
    }

}

package com.drozdova.otus_basic.filmsproject;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class FilmsListAdapter extends RecyclerView.Adapter<FilmsListAdapter.FilmViewHolder> {

    private List<Film> filmsList = new ArrayList<>();

    public void setFilmsList(Collection<Film> list) {
        filmsList.addAll(list);
        notifyDataSetChanged();
    }

    public void clearItems () {
        filmsList.clear();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item, parent, false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(filmsList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmsList.size();
    }

    class FilmViewHolder extends RecyclerView.ViewHolder {

        private TextView filmTitle;
        private ImageView filmImage;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);

            filmTitle = itemView.findViewById(R.id.title_film);
            filmImage = itemView.findViewById(R.id.image_film);
        }

        public void bind(Film film) {
            filmTitle.setText(film.getTitle());

            System.out.println("*********************");
            System.out.println(film.getImgName());
            System.out.println(Resources.class.getPackage().getName());
            System.out.println("*********************");
            int resID = Resources.class.getPackage().identifier(film.getImgName() , "drawable", "com.drozdova.otus_basic.filmsproject.res");
            System.out.println("======== id = " + resID);
            filmImage.setImageResource(resID);
        }
    }
}

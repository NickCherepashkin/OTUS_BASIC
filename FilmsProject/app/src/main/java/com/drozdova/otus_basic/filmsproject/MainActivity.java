package com.drozdova.otus_basic.filmsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private FilmsListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recView = findViewById(R.id.rv_films_list);
        recView.setLayoutManager(new GridLayoutManager(this, 2));

        adapter =  new FilmsListAdapter();
        recView.setAdapter(adapter);

        loadFilms();
    }

    private void loadFilms () {
        Collection<Film> filmsList = getFilmsList();
        adapter.setFilmsList(filmsList);
    }

    private Collection<Film> getFilmsList() {
        return Arrays.asList(
                new Film("Мобиус", "img_1"),
                new Film("Мания", "img_2"),
                new Film("Мания", "img_2.jpeg"),
                new Film("Мания", "img_2.jpeg"),
                new Film("Мания", "img_2.jpeg"),
                new Film("Мания", "img_2.jpeg"));
    }
}
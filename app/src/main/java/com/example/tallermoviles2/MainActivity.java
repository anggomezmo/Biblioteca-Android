package com.example.tallermoviles2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init ();

    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Cien años de soledad", "García Márquez", "Disponible"));
        elements.add(new ListElement("#607d8b", "Don Quijote", "Cervantes", "Prestado"));
        elements.add(new ListElement("#03a9f4", "Orgullo y Prejuicio", "Austen", "Disponible"));
        elements.add(new ListElement("#f44336", "Matar a un ruiseñor", "Lee", "No disponible"));
        elements.add(new ListElement("#009688", "1984", "Orwell", "Disponible"));
        elements.add(new ListElement("#9c27b0", "La Odisea", "Homero", "Disponible"));
        elements.add(new ListElement("#ff9800", "El Gran Gatsby", "Fitzgerald", "Prestado"));
        elements.add(new ListElement("#4caf50", "Crimen y Castigo", "Dostoievski", "Disponible"));
        elements.add(new ListElement("#03a9f4", "Los Miserables", "Hugo", "Disponible"));
        elements.add(new ListElement("#e91e63", "El Principito", "Saint-Exupéry", "Prestado"));



        ListAdapter listAdapter  = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}
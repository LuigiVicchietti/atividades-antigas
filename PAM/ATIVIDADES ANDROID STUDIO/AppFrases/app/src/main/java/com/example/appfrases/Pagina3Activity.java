package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);
    }

    public void chamarPag4 (View view) {

        Intent chamarPagina4 = new Intent(this, Pagina4Activity.class);
        startActivity(chamarPagina4);
    }

    public void chamarPag2 (View view) {

        Intent chamarPag2 = new Intent(this, Pagina2Activity.class);
        startActivity(chamarPag2);
    }

}
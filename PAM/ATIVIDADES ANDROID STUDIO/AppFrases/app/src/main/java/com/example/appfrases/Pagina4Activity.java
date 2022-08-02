package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina4);
    }

    public void chamarPag5 (View view) {

        Intent chamarPagina5 = new Intent(this, Pagina5Activity.class);
        startActivity(chamarPagina5);
    }

    public void chamarPag3 (View view) {

        Intent chamarPag3 = new Intent(this, Pagina3Activity.class);
        startActivity(chamarPag3);
    }

}
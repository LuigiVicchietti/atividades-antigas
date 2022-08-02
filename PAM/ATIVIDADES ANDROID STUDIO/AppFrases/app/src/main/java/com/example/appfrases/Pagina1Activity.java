package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);
    }

    public void chamarPag2 (View view) {

        Intent chamarPagina2 = new Intent(this, Pagina2Activity.class);
        startActivity(chamarPagina2);
    }

    public void chamarHome (View view) {

        Intent chamarHome = new Intent(this, MainActivity.class);
        startActivity(chamarHome);
    }

}
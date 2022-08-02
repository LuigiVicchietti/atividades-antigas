package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);
    }

    public void chamarPag3 (View view) {

        Intent chamarPagina3 = new Intent(this, Pagina3Activity.class);
        startActivity(chamarPagina3);
    }

    public void chamarPag1 (View view) {

        Intent chamarPag1 = new Intent(this, Pagina1Activity.class);
        startActivity(chamarPag1);
    }

}
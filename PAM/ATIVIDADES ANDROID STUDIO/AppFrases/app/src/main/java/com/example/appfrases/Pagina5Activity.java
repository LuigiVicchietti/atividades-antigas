package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pagina5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina5);
    }

    public void chamarHome (View view) {

        Intent chamarHome = new Intent(this, MainActivity.class);
        startActivity(chamarHome);
    }

    public void chamarPag4 (View view) {

        Intent chamarPag4 = new Intent(this, Pagina4Activity.class);
        startActivity(chamarPag4);
    }

}
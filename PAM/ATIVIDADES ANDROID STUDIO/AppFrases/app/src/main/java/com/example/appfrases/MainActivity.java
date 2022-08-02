package com.example.appfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarPag1 (View view) {

        Intent chamarPagina1 = new Intent(this, Pagina1Activity.class);
        startActivity(chamarPagina1);
    }

    public void chamarPag5 (View view) {

        Intent chamarPagina5 = new Intent(this, Pagina5Activity.class);
        startActivity(chamarPagina5);
    }

}
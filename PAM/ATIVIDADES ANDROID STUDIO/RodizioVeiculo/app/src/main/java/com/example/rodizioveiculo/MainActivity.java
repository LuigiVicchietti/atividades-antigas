package com.example.rodizioveiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificarResultado (View view){

        TextView tvResultadoRidizio = findViewById(R.id.tvResultadoRodizio);
        EditText edDigitarNumPlaca = findViewById(R.id.etDigitarNumPlaca);

        String placaNumero = edDigitarNumPlaca.getText().toString();
        int Valor = Integer.parseInt(placaNumero.substring(3,4).toString());

        if (Valor==1 | Valor==2) {
            tvResultadoRidizio.setText("Segunda Feira");
        } else if (Valor==3 | Valor==4){
            tvResultadoRidizio.setText("Terça Feira");
        } else if (Valor==5 | Valor==6) {
            tvResultadoRidizio.setText("Quarta Feira");
        } else if (Valor==7 | Valor==8) {
            tvResultadoRidizio.setText("Quinta Feira");
        } else if (Valor==9 | Valor==0) {
            tvResultadoRidizio.setText("Sexta Feira");
        } else {
            tvResultadoRidizio.setText("Digite corretamente o que se pede!");
        }
    }

}
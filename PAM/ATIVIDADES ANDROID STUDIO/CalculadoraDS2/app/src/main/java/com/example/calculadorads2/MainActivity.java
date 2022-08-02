package com.example.calculadorads2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spOpcoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spOpcoe = findViewById(R.id.spOpcoes);

        ArrayAdapter ITENS = ArrayAdapter.createFromResource
                (this, R.array.Opções, android.R.layout.simple_list_item_checked);
        spOpcoe.setAdapter(ITENS);
    }

    public void CalcularResultado (View view) {

        EditText etNumeroUm = findViewById(R.id.etNumeroUm);
        EditText etNumeroDois = findViewById(R.id.etNumeroDois);
        TextView tvResultado = findViewById(R.id.tvResultado);
        TextView tvQualOpcao = findViewById(R.id.tvQualOpcao);

        int posicao = spOpcoe.getSelectedItemPosition();

        if (posicao == 1) {
            int total = Integer.parseInt (etNumeroUm.getText().toString()) +
                    Integer.parseInt(etNumeroDois.getText().toString());

            String resultado = String.format("%d", total);

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

            tvResultado.setText(resultado);
        }
        else if (posicao == 2) {
            int total = Integer.parseInt (etNumeroUm.getText().toString()) -
                    Integer.parseInt(etNumeroDois.getText().toString());

            String resultado = String.format("%d", total);

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

            tvResultado.setText(resultado);
        }
        else if (posicao == 3) {
            int total = Integer.parseInt (etNumeroUm.getText().toString()) *
                    Integer.parseInt(etNumeroDois.getText().toString());

            String resultado= String.format("%d", total);

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

            tvResultado.setText(resultado);
        }
        else if (posicao == 4) {
            int total = Integer.parseInt (etNumeroUm.getText().toString()) /
                    Integer.parseInt(etNumeroDois.getText().toString());

            String resultado = String.format("%d", total);

            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();

            tvResultado.setText(resultado);
        }

        String qualOperacao = spOpcoe.getSelectedItem().toString();
        tvQualOpcao.setText(qualOperacao);

    }

}
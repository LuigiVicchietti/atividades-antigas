package com.example.restaurantebalaiodlenha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<i> extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularConta(View view) {

        EditText valorPorPessoa = findViewById(R.id.etDivCount);
        EditText consumoTotal = findViewById(R.id.etConsumoTT);
        EditText couverArtistico = findViewById(R.id.etCouvArt);
        TextView resultadoValorPPessoa = findViewById(R.id.tvVPPessoa);
        TextView resultadoTaxaDeServico = findViewById(R.id.tvTxDServico);
        TextView resultadoCFinal = findViewById(R.id.tvContaFinal);

        double totalTaxa = Double.parseDouble(consumoTotal.getText().toString()) / 10;
        double TxDServico = totalTaxa;
        double totalContaFinal = Double.parseDouble(consumoTotal.getText().toString()) +
                Double.parseDouble(couverArtistico.getText().toString()) + TxDServico;
        double contaFinal = totalContaFinal;
        double totalPorPessoa = contaFinal / Double.parseDouble(valorPorPessoa.getText().toString());

        String resultadoTxDServico = String.valueOf(String.format("R$%,.2f", TxDServico));
        resultadoTaxaDeServico.setText(resultadoTxDServico);

        String resultadoContaFinal = String.valueOf(String.format("R$%,.2f", totalContaFinal));
    resultadoCFinal.setText(resultadoContaFinal);

        String resultadoPorPessoa = String.valueOf(String.format("R$%,.2f", totalPorPessoa));
        resultadoValorPPessoa.setText(resultadoPorPessoa);

    }
}
package com.example.novosalrio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularSalario(View view) {

        EditText etSalario = findViewById(R.id.etSalario);
        TextView resultadoSalario = findViewById(R.id.resultadoSalario);
        RadioGroup rgOpcoes = findViewById(R.id.rgOpcoes);
        RadioButton rb10 = findViewById(R.id.rb10);
        RadioButton rb30 = findViewById(R.id.rb30);
        RadioButton rb50 = findViewById(R.id.rb50);

        double salario, novoSalario;
        int opcoes;
        String textOpcao;

        salario = Double.parseDouble(etSalario.getText().toString());
        opcoes = rgOpcoes.getCheckedRadioButtonId();

        if (opcoes == R.id.rb10) {
            novoSalario = salario*1.1;
            textOpcao = rb10.getText().toString();
        } else if (opcoes == R.id.rb30) {
            novoSalario = salario*1.3;
            textOpcao = rb30.getText().toString();
        } else {
            novoSalario = salario*1.5;
            textOpcao = rb50.getText().toString();
        }

        resultadoSalario.setText(String.format("O reajuste foi de %s e o valor do novo salário é de %,2f"
                , textOpcao, novoSalario));

    }
}
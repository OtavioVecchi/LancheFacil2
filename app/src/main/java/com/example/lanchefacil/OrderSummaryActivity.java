package com.example.lanchefacil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {

    private TextView textViewResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        textViewResumo = findViewById(R.id.textViewResumo);

        // Receber os dados passados pela OrderFormActivity
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String tipoPizza = intent.getStringExtra("tipoPizza");

        // Exibir o resumo do pedido
        textViewResumo.setText("Pedido de " + nome + "\nTipo de Pizza: " + tipoPizza);

        // Botão para voltar à tela inicial
        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(v -> {
            Intent voltar = new Intent(OrderSummaryActivity.this, WelcomeActivity.class);
            startActivity(voltar);
        });
    }
}

package com.example.lanchefacil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnIniciarPedido = findViewById(R.id.btnIniciarPedido);
        btnIniciarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega para a tela de pedido
                Intent intent = new Intent(WelcomeActivity.this, OrderFormActivity.class);
                startActivity(intent);
            }
        });
    }
}

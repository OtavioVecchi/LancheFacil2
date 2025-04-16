package com.example.lanchefacil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class OrderFormActivity extends AppCompatActivity {

    private EditText editTextName;
    private RadioGroup radioGroupPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

        editTextName = findViewById(R.id.editTextName);
        radioGroupPizza = findViewById(R.id.radioGroupPizza);

        Button btnConfirmarPedido = findViewById(R.id.btnConfirmarPedido);
        btnConfirmarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextName.getText().toString();
                int pizzaId = radioGroupPizza.getCheckedRadioButtonId();

                // Verificar qual pizza foi selecionada
                String tipoPizza = pizzaId == R.id.radioPizzaCalabresa ? "Calabresa" : "Mussarela";

                // Passar os dados para a próxima tela
                Intent intent = new Intent(OrderFormActivity.this, OrderSummaryActivity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("tipoPizza", tipoPizza);
                startActivity(intent);
            }
        });
    }
}

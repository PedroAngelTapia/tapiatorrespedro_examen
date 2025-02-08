package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio1Activity extends AppCompatActivity {

    private int counter = 0; // Contador inicializado a 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        Button btnVolver = findViewById(R.id.btnVolver1);
        Button btnIncrement = findViewById(R.id.btnIncrement);
        TextView txtCounter = findViewById(R.id.txtCounter);

        // Manejador del botón de volver
        btnVolver.setOnClickListener(v -> startActivity(new Intent(Ejercicio1Activity.this, MainActivity.class)));

        // Manejador para incrementar el contador y mostrar el valor
        btnIncrement.setOnClickListener(v -> {
            counter++;
            txtCounter.setText("Contador: " + counter);
        });
    }
}

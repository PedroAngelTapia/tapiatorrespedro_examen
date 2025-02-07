package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        Button btnVolver = findViewById(R.id.btnVolver3);
        btnVolver.setOnClickListener(v -> startActivity(new Intent(Ejercicio3Activity.this, MainActivity.class)));
    }
}

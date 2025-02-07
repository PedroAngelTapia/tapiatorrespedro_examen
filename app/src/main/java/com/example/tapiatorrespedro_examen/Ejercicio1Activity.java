package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        Button btnVolver = findViewById(R.id.btnVolver1);
        btnVolver.setOnClickListener(v -> startActivity(new Intent(Ejercicio1Activity.this, MainActivity.class)));
    }
}

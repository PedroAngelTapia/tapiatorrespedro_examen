package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        Button btnVolver = findViewById(R.id.btnVolver2);
        btnVolver.setOnClickListener(v -> startActivity(new Intent(Ejercicio2Activity.this, MainActivity.class)));
    }
}

package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEjercicio1 = findViewById(R.id.btnEjercicio1);
        Button btnEjercicio2 = findViewById(R.id.btnEjercicio2);
        Button btnEjercicio3 = findViewById(R.id.btnEjercicio3);

        btnEjercicio1.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Accediendo al Ejercicio 1", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Ejercicio1Activity.class));
        });

        btnEjercicio2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Accediendo al Ejercicio 2", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Ejercicio2Activity.class));
        });

        btnEjercicio3.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Accediendo al Ejercicio 3", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Ejercicio3Activity.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Volviendo a la página principal", Toast.LENGTH_SHORT).show();
    }
}

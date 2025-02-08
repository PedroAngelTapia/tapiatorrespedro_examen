package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Ejercicio2Activity extends AppCompatActivity {

    private EditText cityInput;
    private TextView temperatureOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2); // Vinculación al archivo XML

        // Vinculación de los elementos de la interfaz
        Button btnVolver = findViewById(R.id.btnVolver2);
        Button btnGetTemperature = findViewById(R.id.btnGetTemperature);
        cityInput = findViewById(R.id.cityInput);
        temperatureOutput = findViewById(R.id.temperatureOutput);

        // Acción para volver a la pantalla principal
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio2Activity.this, MainActivity.class);
            startActivity(intent);
        });

        // Acción para obtener la temperatura
        btnGetTemperature.setOnClickListener(v -> {
            String cityName = cityInput.getText().toString().trim();
            if (!cityName.isEmpty()) {
                new FetchTemperatureTask().execute(cityName);
            } else {
                temperatureOutput.setText("Por favor, ingresa una ciudad.");
            }
        });
    }

    // Clase interna para obtener una temperatura aleatoria simulada
    private class FetchTemperatureTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            Random random = new Random();
            int temperature = random.nextInt(61) - 20; // Generar temperatura entre -20 y 40 grados
            return "La temperatura en " + params[0] + " es: " + temperature + "ºC";
        }

        @Override
        protected void onPostExecute(String result) {
            temperatureOutput.setText(result); // Mostrar el resultado en pantalla
        }
    }
}

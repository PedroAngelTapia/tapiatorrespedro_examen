package com.example.tapiatorrespedro_examen;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio3Activity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor accelerometer;
    private TextView motionMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3); // Vinculación al archivo XML correcto

        // Vinculación de los elementos de la interfaz con sus IDs
        Button btnVolver = findViewById(R.id.btnVolver3);
        motionMessage = findViewById(R.id.motionMessage);

        // Inicialización del SensorManager y acelerómetro
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        if (sensorManager != null) {
            accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        }

        // Acción para volver a la pantalla principal
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(Ejercicio3Activity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (accelerometer != null) {
            sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        // Calcular la magnitud del movimiento
        double magnitude = Math.sqrt(x * x + y * y + z * z);
        if (magnitude > 15) {
            motionMessage.setText("¡Movimiento brusco detectado!");
        } else {
            motionMessage.setText("Esperando movimiento...");
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // No es necesario implementar este método para este ejemplo
    }
}

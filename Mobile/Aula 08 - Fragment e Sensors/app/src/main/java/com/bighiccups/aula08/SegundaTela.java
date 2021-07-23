package com.bighiccups.aula08;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.EventListener;

public class SegundaTela extends AppCompatActivity implements SensorEventListener {
    Button btn_voltar;
    TextView texto_cor;
    MediaPlayer som1;
    SensorManager sensorManager;
    boolean troca_cor = false;
    private View view;
    private long timeUpdate;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.segunda_tela);
        btn_voltar= findViewById(R.id.btn_voltar);
        texto_cor = findViewById(R.id.texto_cor);
        som1 = MediaPlayer.create(getApplicationContext(), R.raw.blop);

        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        timeUpdate = System.currentTimeMillis();

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(SegundaTela.this, MainActivity.class);
                startActivity(o);
                som1.start();
                finish();
            }
        });
    }

    private void getAcelerometro(SensorEvent event, TextView txt) {
        float []valores = event.values;
        float x = valores[0];
        float y = valores[1];
        float z = valores[2];
        float raiz = (float) ((x*x + y*y + z*z)/Math.pow(SensorManager.GRAVITY_EARTH,2.0));

        long horaAtual = event.timestamp;
        if (raiz>=2) {
            if((horaAtual - timeUpdate) < 200) {
                return;
            } else {
                timeUpdate = horaAtual;
            }
            if (troca_cor) {
                txt.setTextColor(Color.RED);
                som1.start();
            } else {
                txt.setTextColor(Color.GREEN);
            }
            troca_cor = !troca_cor;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener((SensorEventListener)this,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                sensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener((SensorEventListener) this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAcelerometro(event, texto_cor);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

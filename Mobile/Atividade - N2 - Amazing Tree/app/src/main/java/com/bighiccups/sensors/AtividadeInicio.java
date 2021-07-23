package com.bighiccups.sensors;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Driver;

public class AtividadeInicio extends AppCompatActivity implements SensorEventListener {
    TextView contador, nome_fruta, titulo;
    MediaPlayer alerta;
    int count = 0;
    SensorManager sensorManager;
    private View view;
    private long timeUpdate;
    boolean trocaCor = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);

        titulo = findViewById(R.id.titulo);
        contador = findViewById(R.id.tv_contador);
        nome_fruta = findViewById(R.id.tv_nome);


        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        timeUpdate = System.currentTimeMillis();

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        alerta = MediaPlayer.create(getApplicationContext(), R.raw.blop);
    }


    private void getAcelerometro(SensorEvent event, TextView nome_fruta, TextView contador) {
        float[]valores = event.values;
        float x = valores[0];
        float y = valores[1];
        float z = valores[2];

        float raiz = (float)((x*x + y*y + z*z) / (Math.pow(SensorManager.GRAVITY_EARTH,2.0)));

        long horaAtual;

        if (raiz >= 9) {
            if ((horaAtual = timeUpdate) < 200) {
                return;
            }

            timeUpdate = horaAtual;
            count ++;
            if (count == 4) {
                alerta.start();
                count = 0;
            }
            if (count == 0) {
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                nome_fruta.setTextColor(Color.YELLOW);
                nome_fruta.setText("Orange");
//                titulo.setTextColor(Color.YELLOW);
                contador.setText(String.valueOf(count  + 1 + "X"));
                contador.setTextColor(Color.YELLOW);
            }
            if (count == 1) {
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                nome_fruta.setTextColor(Color.GREEN);
                nome_fruta.setText("Lemon");
//                titulo.setTextColor(Color.GREEN);
                contador.setText(String.valueOf(count  + 1 +"X"));
                contador.setTextColor(Color.GREEN);
            }
            if (count == 2) {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                nome_fruta.setTextColor(Color.RED);
                nome_fruta.setText("Grape Fruit");
//                titulo.setTextColor(Color.RED);
                contador.setText(String.valueOf(count +  1 + "X"));
                contador.setTextColor(Color.RED);
            }
            if (count == 3) {
                getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
                nome_fruta.setTextColor(Color.MAGENTA);
                nome_fruta.setText("Wierd Fruit");
//                titulo.setTextColor(Color.MAGENTA);
                contador.setText(String.valueOf(count + 1 + "X"));
                contador.setTextColor(Color.MAGENTA);

            }

        }

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        sensorManager.registerListener((SensorEventListener)this,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                sensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener((SensorEventListener)this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAcelerometro(event, nome_fruta, contador);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    
}
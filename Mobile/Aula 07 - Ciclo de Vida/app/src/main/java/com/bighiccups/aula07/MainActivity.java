package com.bighiccups.aula07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn01,btn02;

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);

        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                startActivity(intent);

            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                startActivity(intent);
                finish();

            }
        });
    }


    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }


}
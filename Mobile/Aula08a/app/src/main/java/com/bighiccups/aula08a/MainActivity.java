package com.bighiccups.aula08a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editNome;
    Button btn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNome =findViewById(R.id.editTextTextPersonName);
        btn01 = findViewById(R.id.btn1);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editNome.getText().toString().isEmpty()) {
                    Intent i = new Intent(MainActivity.this, SegundaTela.class);
                    i.putExtra("nome",editNome.getText().toString());
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
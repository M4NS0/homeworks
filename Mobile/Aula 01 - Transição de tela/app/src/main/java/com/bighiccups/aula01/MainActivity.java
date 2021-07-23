package com.bighiccups.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn, btn_tela2, btn_sair;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_sair);
        editText = findViewById(R.id.editText);
        btn_tela2 = findViewById(R.id.btn_tela2);
        btn_sair = findViewById(R.id.btn_sair);

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sair();
            }
        });

        btn_tela2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String aux = editText.getText().toString();

               Intent intent = new Intent(MainActivity.this, SecondScreen.class);
               intent.putExtra("message", aux);
               startActivity(intent);



           }
       });
    }
    public void setSecond (String aux) {
        Intent intent = new Intent(MainActivity.this, SecondScreen.class);
        intent.putExtra("message", aux);

        startActivity(intent);
    }

    public void sair() {
        finish();
    }

}
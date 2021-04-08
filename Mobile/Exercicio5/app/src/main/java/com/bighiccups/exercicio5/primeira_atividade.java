package com.bighiccups.exercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Calendar;

public class primeira_atividade extends AppCompatActivity {
    EditText et_nome,et_cpf,et_nasc,et_tel,et_cel,et_email;
    Button btn_cadastrar;

    DatePickerDialog.OnDateSetListener dateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);

        et_nome = findViewById(R.id.et_nome);
        et_cpf = findViewById(R.id.et_cpf);
        et_nasc = findViewById(R.id.et_nasc);
        et_tel = findViewById(R.id.et_tel);
        et_cel = findViewById(R.id.et_cel);
        et_email = findViewById(R.id.et_email);

        btn_cadastrar = findViewById(R.id.btn_cadastrar);


        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String cpf = intent.getStringExtra("cpf");
        String nasc = intent.getStringExtra("nasc");
        String tel = intent.getStringExtra("tel");
        String cel = intent.getStringExtra("cel");
        String email = intent.getStringExtra("email");

        if (nome != "" || nome !=null) {
            et_nome.setText(nome);
            et_nasc.setText(nasc);
            et_cpf.setText(cpf);
            et_tel.setText(tel);
            et_cel.setText(cel);
            et_email.setText(email);
        }

        et_nasc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();

                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);

                DatePickerDialog dialog = new DatePickerDialog(
                        primeira_atividade.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        dateSetListener, ano,mes,dia
                );

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int ano, int mes, int dia) {
                mes += 1;
                String texto_final = dia+"/"+mes+"/"+ano;
                et_nasc.setText(texto_final);
            }
        };

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(primeira_atividade.this, segunda_atividade.class);
                Bundle extras = new Bundle();
                extras.putString("nome", et_nome.getText().toString());
                extras.putString("cpf", et_cpf.getText().toString());
                extras.putString("nasc", et_nasc.getText().toString());
                extras.putString("tel", et_tel.getText().toString());
                extras.putString("cel", et_cel.getText().toString());
                extras.putString("email", et_email.getText().toString());

                intent.putExtras(extras);
                startActivity(intent);

            }
        });
    }
}
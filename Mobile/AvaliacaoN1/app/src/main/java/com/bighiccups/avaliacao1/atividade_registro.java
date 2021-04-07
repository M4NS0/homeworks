package com.bighiccups.avaliacao1;

import android.app.DatePickerDialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;


public class atividade_registro extends AppCompatActivity {
    EditText nome_evento, date_picker;
    Button btn_registrar;
    ListView listView;
    int id = 2;
    DatePickerDialog.OnDateSetListener dateSetListener;

    ArrayList<Registros> lista = new ArrayList<>();
    AdaptadorCustomizado adaptadorCustomizado;
    private Registros registro;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_registro);

        nome_evento = findViewById(R.id.nome_evento);
        date_picker = findViewById(R.id.date_picker);

        btn_registrar = findViewById(R.id.btn_registrar);

        listView = findViewById(R.id.lista);

        adaptadorCustomizado = new AdaptadorCustomizado(this, R.layout.layout_lista, lista);

        Registros evento1 = new Registros("Neon Nights Rock Festival","11/11/2021",1);
        lista.add(evento1);
        Registros evento2 = new Registros("Corona High Times Party ","11/12/2032",2);
        lista.add(evento2);
        


        date_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();

                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);

                DatePickerDialog dialog = new DatePickerDialog(
                        atividade_registro.this,
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
                date_picker.setText(texto_final);
            }
        };

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id ++;
                String str_evento = nome_evento.getText().toString();
                String str_data = date_picker.getText().toString();
                registro = new Registros(str_evento,str_data,id);
                lista.add(registro);

                listView.setAdapter(adaptadorCustomizado);
            }
        });
    }
}

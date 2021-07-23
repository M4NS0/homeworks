package com.bighiccups.aula05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView texto;
    ListView lista;
    EditText filtro;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        filtro = findViewById(R.id.editText);
        texto = findViewById(R.id.texto);

        txt = false;

        texto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (txt) texto.setTextColor(Color.RED);
                else texto.setTextColor(Color.BLACK);
                txt = !txt;

                return false;
            }
        });
        List<String> nomes = new ArrayList<>();

        nomes.add("Jarjar Binx");
        nomes.add("Ewokes");
        nomes.add("Gravious");
        nomes.add("Palpatine");
        nomes.add("Dart");
        nomes.add("Luke");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nomes);

        lista.setAdapter(adapter);

        filtro.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                (MainActivity.this).adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        lista.setOnClickListener(new AdapterView.OnItemClickListener()) {
            
        }
    }
}

package com.bighiccups.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    Button btn;
    EditText novoItem;
    ArrayList<Itens> itensLista;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        btn = findViewById(R.id.button);
        novoItem = findViewById(R.id.item);
        itensLista = new ArrayList<Itens>();

        AdaptadorCustomizado adaptadorCustomizado =
                new AdaptadorCustomizado(this, R.layout.layout_lista, itensLista);
        lista.setAdapter(adaptadorCustomizado);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
                itensLista.add(new Itens(novoItem.getText().toString(), i));
                novoItem.getText().clear();
                i++;

            }
        });

    }
}
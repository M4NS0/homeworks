package com.bighiccups.aula13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bighiccups.aula13.model.Contato;
import com.bighiccups.aula13.service.HttpBuscar;

import java.util.concurrent.ExecutionException;

public class TelaBuscar extends AppCompatActivity {
    Button btnBuscar;
    EditText EdId;
    ImageButton btnBuscarL, btnInserirL, btnDeletarL, btnListarL;
    TextView txtNome, txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_buscar);

        btnBuscar = findViewById(R.id.btnBuscar);

        btnBuscarL = findViewById(R.id.imageBuscar);
        btnInserirL = findViewById(R.id.imageEnviar);
        btnDeletarL = findViewById(R.id.imageDeletar);
        btnListarL = findViewById(R.id.imageListar);

        EdId = findViewById(R.id.EdId);
        txtNome = findViewById(R.id.EdNome);
        txtTelefone = findViewById(R.id.EdTelefone);

        btnBuscarL.setEnabled(false);


        btnInserirL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(TelaBuscar.this, TelaInserir.class);
                startActivity(i);
                finish();
            }
        });
        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaBuscar.this, TelaDeletar.class);
                startActivity(i);
                finish();
            }
        });
        btnListarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaBuscar.this, TelaListar.class);
                startActivity(i);
                finish();
            }
        });
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = EdId.getText().toString();
                if(id.isEmpty()) Toast.makeText(getApplicationContext(), "Campo de id em Branco!", Toast.LENGTH_SHORT).show();
                else  {
                    HttpBuscar service = new HttpBuscar(id);
                    try {
                        Contato contato = service.execute().get();
                        txtNome.setText(contato.getNome());
                        txtTelefone.setText(contato.getTelefone());
                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
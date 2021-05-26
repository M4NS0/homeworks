package com.bighiccups.aula13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.aula13.service.HttpDeletar;

import java.util.concurrent.ExecutionException;

public class TelaDeletar extends AppCompatActivity {
    ImageButton btnBuscarL, btnInserirL, btnDeletarL, btnListarL;
    Button btnDeletar;
    EditText EdIdDeletar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_deletar);

        btnBuscarL = findViewById(R.id.imageBuscar);
        btnInserirL = findViewById(R.id.imageEnviar);
        btnDeletarL = findViewById(R.id.imageDeletar);
        btnListarL = findViewById(R.id.imageListar);

        btnDeletar = findViewById(R.id.btnDeletar);
        EdIdDeletar = findViewById(R.id.EdIdDeletar);

        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaDeletar.this, TelaBuscar.class);
                startActivity(i);
                finish();
            }
        });
        btnInserirL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaDeletar.this, TelaInserir.class);
                startActivity(i);
                finish();
            }
        });
        btnDeletarL.setEnabled(false);

        btnListarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaDeletar.this, TelaListar.class);
                startActivity(i);
                finish();
            }
        });
        btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = EdIdDeletar.getText().toString();
                if(id.isEmpty()) Toast.makeText(getApplicationContext(), "Campo id em branco", Toast.LENGTH_SHORT).show();
                else {
                    HttpDeletar service = new HttpDeletar(id);
                    try {
                        String resposta = service.execute().get();
                        if (resposta.equals("excluido"))
                            Toast.makeText(getApplicationContext(), "Contato excluido com sucesso!", Toast.LENGTH_SHORT).show();
                        else if (resposta.equals("Inexistente"))
                            Toast.makeText(getApplicationContext(), "Id Inexistente", Toast.LENGTH_SHORT).show();
                        else Toast.makeText(getApplicationContext(), "Erro ao Conectar ao Servidor", Toast.LENGTH_SHORT).show();
                    } catch (ExecutionException| InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


    }
}

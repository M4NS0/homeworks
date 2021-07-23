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

import com.bighiccups.aula13.service.HttpInserir;

import java.util.concurrent.ExecutionException;

public class TelaInserir extends AppCompatActivity {
    ImageButton btnBuscarL, btnInserirL, btnDeletarL, btnListarL;
    EditText EdNome, EdTelefone;
    Button btnInserir;
    Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inserir);
        btnBuscarL = findViewById(R.id.imageBuscar);
        btnInserirL = findViewById(R.id.imageEnviar);
        btnDeletarL = findViewById(R.id.imageDeletar);
        btnListarL = findViewById(R.id.imageListar);

        btnInserir = findViewById(R.id.btnInserir);
        EdNome = findViewById(R.id.EdNome);
        EdTelefone = findViewById(R.id.EdTelefone);


        Intent intent = getIntent();
        extras = intent.getExtras();

        if (!extras.isEmpty()) {
            EdNome.setText(extras.getString("nome"));
            EdTelefone.setText(extras.getString("Telefone"));
        }

        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaInserir.this,TelaBuscar.class);
                startActivity(i);
                finish();
            }
        });
        btnInserirL.setEnabled(false);

        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaInserir.this,TelaDeletar.class);
                startActivity(i);
                finish();
            }
        });
        btnListarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaInserir.this,TelaListar.class);
                startActivity(i);
                finish();
            }
        });
        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = EdNome.getText().toString();
                String telefone = EdTelefone.getText().toString();

                if (nome.isEmpty() || telefone.isEmpty())
                    Toast.makeText(getApplicationContext(), "Nome ou Telefone não preenchidos!", Toast.LENGTH_SHORT).show();
                else {
                    HttpInserir service = new HttpInserir(nome, telefone);

                    try {
                        String resposta = service.execute().get();
                        if (resposta.equals("ContatoInserido!!")) {
                            Toast.makeText(getApplicationContext(), "Contato inserido com sucesso!", Toast.LENGTH_SHORT).show();
                            EdNome.setText("");
                            EdTelefone.setText("");
                        } else Toast.makeText(getApplicationContext(), "Contato não inserido!" + nome + telefone, Toast.LENGTH_SHORT).show();

                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}

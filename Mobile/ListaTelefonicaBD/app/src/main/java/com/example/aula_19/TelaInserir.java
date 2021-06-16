package com.example.aula_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aula_19.service.HttpInserir;

import java.util.concurrent.ExecutionException;

public class TelaInserir extends AppCompatActivity {


    Button btnInserir;
    ImageButton btnBuscarL,btnInserirL,btnDeletarL,btnListaL;
    EditText EdNome,EdTelefone;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inserir);

        btnInserir = findViewById(R.id.btnInserir);
        btnBuscarL = findViewById(R.id.btnBuscarLayout);
        btnInserirL = findViewById(R.id.btnInserirLayout);
        btnDeletarL = findViewById(R.id.btnDeletarLayout);
        btnListaL = findViewById(R.id.btnListarLayout);

        EdNome = findViewById(R.id.EdNome);
        EdTelefone = findViewById(R.id.EdTelefone);

        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaInserir.this,TelaBuscar.class);
                startActivity(intent);
                finish();
            }
        });

        btnInserirL.setEnabled(false);


        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaInserir.this,TelaDeletar.class);
                startActivity(intent);
                finish();
            }
        });

        btnListaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaInserir.this,TelaListar.class);
                startActivity(intent);
                finish();
            }
        });


        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = EdNome.getText().toString();
                String telefone = EdTelefone.getText().toString();

                if(nome.isEmpty() && telefone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Nome ou Telefone Não preenchido!",Toast.LENGTH_SHORT).show();
                }else {

                    HttpInserir service = new HttpInserir(nome,telefone);

                    try {

                        String resposta = service.execute().get();
                        if (resposta.equals("ContatoInserido!!")) {
                            Toast.makeText(getApplicationContext(), "Contato Inserido com Sucesso!!", Toast.LENGTH_SHORT).show();
                            EdNome.setText("");
                            EdTelefone.setText("");
                        }else{
                            Toast.makeText(getApplicationContext(), "Contato não  Inserido !!", Toast.LENGTH_SHORT).show();
                        }
                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }
}

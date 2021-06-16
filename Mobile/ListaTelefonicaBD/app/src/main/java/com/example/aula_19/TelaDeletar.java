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

import com.example.aula_19.service.HttpDeletar;

import java.util.concurrent.ExecutionException;

public class TelaDeletar extends AppCompatActivity {

    Button btnDeletar;
    ImageButton btnBuscarL,btnInserirL,btnDeletarL,btnListaL;
    EditText IdDeletar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_deletar);

        btnDeletar = findViewById(R.id.btnDeletar);
        btnBuscarL = findViewById(R.id.btnBuscarLayout);
        btnInserirL = findViewById(R.id.btnInserirLayout);
        btnDeletarL = findViewById(R.id.btnDeletarLayout);
        btnListaL = findViewById(R.id.btnListarLayout);
        IdDeletar = findViewById(R.id.EdIdDeletar);

        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeletar.this,TelaBuscar.class);
                startActivity(intent);
                finish();
            }
        });

        btnInserirL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeletar.this,TelaInserir.class);
                startActivity(intent);
                finish();
            }
        });

        btnDeletarL.setEnabled(false);

        btnListaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeletar.this,TelaListar.class);
                startActivity(intent);
                finish();
            }
        });

        btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = IdDeletar.getText().toString();
               if(id.isEmpty()){
                   Toast.makeText(getApplicationContext(),"Campo ID em Branco",Toast.LENGTH_SHORT).show();
               }else{

                   HttpDeletar service = new HttpDeletar(id);
                   try {

                       String resposta = service.execute().get();
                       if (resposta.equals("excluido")){
                           Toast.makeText(getApplicationContext(),"Contato excluida com sucesso!",Toast.LENGTH_SHORT).show();
                       }else {
                           if (resposta.equals("inexistente")){
                               Toast.makeText(getApplicationContext(),"ID inexistente no Banco!",Toast.LENGTH_SHORT).show();
                           }else{
                               Toast.makeText(getApplicationContext(),"Error ao conectar com o banco!",Toast.LENGTH_SHORT).show();
                           }
                       }

                   } catch (ExecutionException | InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        });

    }
}

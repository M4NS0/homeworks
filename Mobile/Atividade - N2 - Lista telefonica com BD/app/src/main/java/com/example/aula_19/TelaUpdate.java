package com.example.aula_19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aula_19.service.HttpInserir;
import com.example.aula_19.service.HttpUpdate;

import java.util.concurrent.ExecutionException;

public class TelaUpdate extends AppCompatActivity {

    Button btnVoltarupdate,btnUpdate;
    EditText EdTelefoneUpdate,EdNomeUpdate,EdIdUpdate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_update);

        btnVoltarupdate = findViewById(R.id.btnVoltatUpdate);
        btnUpdate = findViewById(R.id.btnUpdate);
        EdTelefoneUpdate = findViewById(R.id.EdTelefoneUpdate);
        EdNomeUpdate = findViewById(R.id.EdNomeUpdate);
        EdIdUpdate = findViewById(R.id.EdIdUpdate);

        btnVoltarupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TelaUpdate.this,TelaListar.class);
                startActivity(intent);
                finish();
            }
        });

        Intent telaAnterior = getIntent();
        String id = telaAnterior.getStringExtra("id");
        String nome = telaAnterior.getStringExtra("nome");
        String telefone = telaAnterior.getStringExtra("telefone");

        EdIdUpdate.setText(id);
        EdNomeUpdate.setText(nome);
        EdTelefoneUpdate.setText(telefone);


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = EdIdUpdate.getText().toString();
                String nome = EdNomeUpdate.getText().toString();
                String telefone = EdTelefoneUpdate.getText().toString();

                if ( id.isEmpty() && nome.isEmpty() && telefone.isEmpty()){
                    Toast.makeText(getApplicationContext(),"ID, Nome ou Telefone Não preenchido!",Toast.LENGTH_SHORT).show();
                }else {

                    HttpUpdate service = new HttpUpdate(id,nome,telefone);

                    try {

                        String resposta = service.execute().get();
                        if (resposta.equals("editado")) {
                            Toast.makeText(getApplicationContext(), "Update com Sucesso!!", Toast.LENGTH_SHORT).show();
                            EdIdUpdate.setText("");
                            EdNomeUpdate.setText("");
                            EdTelefoneUpdate.setText("");
                        }else{
                            Toast.makeText(getApplicationContext(), "Update não  Inserido !!", Toast.LENGTH_SHORT).show();
                        }
                    } catch (ExecutionException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



    }
}

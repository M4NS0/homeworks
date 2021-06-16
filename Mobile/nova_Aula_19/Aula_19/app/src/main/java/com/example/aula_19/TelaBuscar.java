package com.example.aula_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aula_19.model.Contato;
import com.example.aula_19.service.HttpBuscar;

import java.util.concurrent.ExecutionException;

public class TelaBuscar extends AppCompatActivity {

    Button btnBuscar;
    ImageButton btnBuscarL,btnInserirL,btnDeletarL,btnListaL;
    EditText EdId;
    TextView txtNome,txtTelefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_buscar);

        btnBuscar = findViewById(R.id.btnBuscar);
        btnBuscarL = findViewById(R.id.btnBuscarLayout);
        btnInserirL = findViewById(R.id.btnInserirLayout);
        btnDeletarL = findViewById(R.id.btnDeletarLayout);
        btnListaL = findViewById(R.id.btnListarLayout);

        EdId = findViewById(R.id.EdId);
        txtNome = findViewById(R.id.txtNome);
        txtTelefone   = findViewById(R.id.txtTelefone);


        btnBuscarL.setEnabled(false);

        btnInserirL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaBuscar.this,TelaInserir.class);
                startActivity(intent);
                finish();
            }
        });

        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaBuscar.this,TelaDeletar.class);
                startActivity(intent);
                finish();
            }
        });

        btnListaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaBuscar.this,TelaListar.class);
                startActivity(intent);
                finish();
            }
        });

        //implementando a busca pela WEB

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String id =  EdId.getText().toString();

                if(id.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Compo ID em branco ",Toast.LENGTH_SHORT).show();
                }else{
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
package com.example.atividadecrud;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    private EditText edtNome, edtFrase, edtImagem;
    private PessoaDAO dao;
    private Pessoa pessoa = null;

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFrase = findViewById(R.id.frase);
        edtImagem = findViewById(R.id.imagem);
        edtNome = findViewById(R.id.nome);
        dao = new PessoaDAO(this);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Intent i = getIntent();
        if (i.hasExtra("pessoa")) {
            pessoa = (Pessoa) i.getSerializableExtra("pessoa");
            edtNome.setText(pessoa.getNome());
            edtFrase.setText(pessoa.getFrase());
            edtImagem.setText(pessoa.getImagem());
        }
    }

    public void salvar(View view) {
        if (edtNome.getText().length() == 0 && edtFrase.getText().length() == 0 && edtImagem.getText().length() == 0) {
            AlertDialog dialog = new AlertDialog.Builder(this)
                    .setTitle("Campos em branco")
                    .setMessage("Preencha os campos")
                    .setPositiveButton("OK", null).create();
            dialog.show();
        } else {
            if (pessoa == null) {
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(edtNome.getText().toString());
                pessoa.setFrase(edtFrase.getText().toString());
                pessoa.setImagem(edtImagem.getText().toString());

                dao.inserir(pessoa);
            } else {
                pessoa.setNome(edtNome.getText().toString());
                pessoa.setFrase(edtFrase.getText().toString());
                pessoa.setImagem(edtImagem.getText().toString());

                dao.atualizar(pessoa);
            }
            Intent i = new Intent(this, ListarPessoasActivity.class);
            startActivity(i);
        }
    }
}
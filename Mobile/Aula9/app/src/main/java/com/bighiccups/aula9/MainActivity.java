package com.bighiccups.aula9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editCod, editNome, editTelefone, editEmail;
    Button btnExcluir, btnSalvar, btnLimpar;
    ListView lista;
    ClienteDataBase bd_cli = new ClienteDataBase(this);
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCod = findViewById(R.id.cod);
        editNome = findViewById(R.id.nome);
        editTelefone = findViewById(R.id.telefone);

        btnExcluir = findViewById(R.id.btnExcluir);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnLimpar = findViewById(R.id.btnLimpar);

        editEmail = findViewById(R.id.email);

        lista = findViewById(R.id.lista);

        exibirLista();

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clique = (String) lista.getItemAtPosition(position);
                String cod = clique.substring(0, clique.indexOf(" - "));
                Cliente cli = bd_cli.selectCliente(Integer.parseInt(cod));
                editCod.setText(String.valueOf(cli.cod));
                editNome.setText(cli.nome);
                editEmail.setText(cli.email);
                editTelefone.setText(cli.telefone);
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limparCampos();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cod = editCod.getText().toString();
                String nome = editNome.getText().toString();
                String telefone = editTelefone.getText().toString();
                String email = editEmail.getText().toString();

                if (nome.isEmpty()) editNome.setError("Campo obrigatório");
                else if (cod.isEmpty()) {
                    //insert
                    bd_cli.addCliente(new Cliente(nome, telefone, email));
                    Toast.makeText(MainActivity.this, "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
                    limparCampos();
                    exibirLista();

                } else {
                    // update
                    bd_cli.updateCliente(new Cliente(Integer.parseInt(cod), nome, telefone, email));
                    Toast.makeText(MainActivity.this, "Atualizado com sucesso!", Toast.LENGTH_SHORT).show();
                    limparCampos();
                    exibirLista();
                }
            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cod = editCod.getText().toString();
                if (cod.isEmpty())
                    Toast.makeText(MainActivity.this, "Impossível Excluir, nada selecionado!", Toast.LENGTH_SHORT).show();
                else {
                    Cliente cli = new Cliente();
                    cli.setCod(Integer.parseInt(cod));
                    bd_cli.excluirCliente(cli);
                    Toast.makeText(MainActivity.this, "Excluido com sucesso!", Toast.LENGTH_SHORT).show();
                    limparCampos();
                    exibirLista();
                }
            }
        });
    }


    // Depois do DAO feito
    public void exibirLista() {
        List<Cliente> clientes = bd_cli.listarTodos();
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, arrayList);


        for (Cliente c : clientes) {
            arrayList.add(c.getCod() + " - " + c.getNome());
            adapter.notifyDataSetChanged();
            lista.setAdapter(adapter);
        }

    }

    public void limparCampos() {
        editCod.setText("");
        editNome.setText("");
        editTelefone.setText("");
        editEmail.setText("");
        editNome.requestFocus();
    }
}
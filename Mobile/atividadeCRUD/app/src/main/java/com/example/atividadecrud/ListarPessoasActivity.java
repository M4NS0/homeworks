package com.example.atividadecrud;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListarPessoasActivity extends AppCompatActivity {

    private ListView lista;
    private PessoaDAO dao;
    private List<Pessoa> pessoas;
    private final List<Pessoa> pessoasFiltradas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_pessoas);

        lista = findViewById(R.id.lista);
        dao = new PessoaDAO(this);
        pessoas = dao.obterTodos();
        pessoasFiltradas.addAll(pessoas);
        // ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, pessoasFiltradas);
        adapter adaptador = new adapter(pessoasFiltradas, this);
        lista.setAdapter(adaptador);

        registerForContextMenu(lista);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_principal, menu);

        SearchView sv = (SearchView) menu.findItem(R.id.app_bar_search).getActionView();
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                procuraPessoa(newText);
                return false;
            }
        });

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater i = getMenuInflater();
        i.inflate(R.menu.menu_contexto, menu);
    }

    public void procuraPessoa(String nome) {
        pessoasFiltradas.clear();
        for (Pessoa p: pessoas) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                pessoasFiltradas.add(p);
            }
        }
        lista.invalidateViews();
    }

    public void cadastrar(MenuItem menu) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void excluir(MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final Pessoa pessoaExcluir = pessoasFiltradas.get(menuInfo.position);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Atenção")
                .setMessage("Deseja excluir este registro?")
                .setNegativeButton("NÃO", null)
                .setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        pessoasFiltradas.remove(pessoaExcluir);
                        pessoas.remove(pessoaExcluir);
                        dao.exluirPessoa(pessoaExcluir);
                        lista.invalidateViews();
                    }
                }).create();
        dialog.show();
    }

    public void atualizar(MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final Pessoa pessoaEditar = pessoasFiltradas.get(menuInfo.position);

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("pessoa", pessoaEditar);
        startActivity(i);
    }

    @Override
    public void onResume() {
        super.onResume();
        pessoas = dao.obterTodos();
        pessoasFiltradas.clear();
        pessoasFiltradas.addAll(pessoas);
        lista.invalidateViews();
    }
}
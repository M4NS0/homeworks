package com.example.atividadecrud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private final Conexao conexao;
    private final SQLiteDatabase banco;

    public PessoaDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Pessoa pessoa) {
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getNome());
        values.put("frase", pessoa.getFrase());
        values.put("imagem", pessoa.getImagem());

        return banco.insert("pessoa", null, values);
    }

    public List<Pessoa> obterTodos() {
        List<Pessoa> pessoas = new ArrayList<>();
        Cursor cursor = banco.query("pessoa", new String[]{"id", "nome", "frase", "imagem"},
                null, null, null, null, null);
        while (cursor.moveToNext()) {
            Pessoa p = new Pessoa();
            p.setId(cursor.getInt(0));
            p.setNome(cursor.getString(1));
            p.setFrase(cursor.getString(2));
            p.setImagem(cursor.getString(3));

            pessoas.add(p);
        }
        return pessoas;
    }

    public void exluirPessoa(Pessoa pessoa) {
        banco.delete("pessoa", "id=?", new String[]{pessoa.getId().toString()});
    }

    public void atualizar(Pessoa pessoa) {
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getNome());
        values.put("frase", pessoa.getFrase());
        values.put("imagem", pessoa.getImagem());

        banco.update("pessoa", values, "id=?", new String[]{pessoa.getId().toString()});
    }
}

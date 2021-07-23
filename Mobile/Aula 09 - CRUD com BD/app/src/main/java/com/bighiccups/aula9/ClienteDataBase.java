package com.bighiccups.aula9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ClienteDataBase extends SQLiteOpenHelper {
    private static final int versao = 1;
    private static final String nomeDB = "bd_cliente";

    private static final String cliente_tabela = "cliente";
    private static final String cliente_cod = "cod";
    private static final String cliente_nome = "nome";
    private static final String cliente_telefone = "telefone";
    private static final String cliente_email = "email";
    public Context context;

    public ClienteDataBase(@Nullable Context context) {
        super(context, nomeDB, null, versao);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqlLiteDatabase) {

       String query = "CREATE TABLE " + cliente_tabela + "(" +
               cliente_cod + " INTEGER PRIMARY KEY, " +
               cliente_nome + " TEXT, " +
               cliente_telefone + " TEXT, " +
               cliente_email + " TEXT)";

        sqlLiteDatabase.execSQL(query);
    }

    public void addCliente(Cliente cli) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(cliente_nome,cli.getNome());
        values.put(cliente_telefone, cli.getTelefone());
        values.put(cliente_email, cli.getEmail());

        db.insert(cliente_tabela,null,values);
        Cliente aaa = selectCliente(1);

        Toast.makeText(context,aaa.getNome(), Toast.LENGTH_SHORT).show();
        db.close();
    }

    public void excluirCliente(Cliente cliente) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(cliente_tabela, cliente_cod+" = ?",
                new String[]{String.valueOf(cliente.getCod())});
        db.close();
    }

    public Cliente selectCliente(int cod) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                cliente_tabela,
                new String[]{cliente_cod,cliente_nome,cliente_telefone,cliente_email},
                cliente_cod+" = ?",
                new String[]{String.valueOf(cod)},
                null,null,null);

        if (cursor != null)cursor.moveToFirst();
        else return null;

        Cliente cli = new Cliente(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1),cursor.getString(2),cursor.getString(3));
        return cli;
    }

    public List<Cliente> listarTodos() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<Cliente> lista = new ArrayList<Cliente>();
        String query ="SELECT * FROM " + cliente_tabela;

        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst()) { // true or false
            do {
                Cliente cli = new Cliente();
                cli.setCod(Integer.parseInt(cursor.getString(0)));
                cli.setNome(cursor.getString(1));
                cli.setTelefone(cursor.getString(2));
                cli.setEmail(cursor.getString(3));
                lista.add(cli);
            } while(cursor.moveToNext());
        }
        return lista;
    }

    public void updateCliente(Cliente cli) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(cliente_nome,cli.getNome());
        values.put(cliente_telefone, cli.getTelefone());
        values.put(cliente_email, cli.getEmail());

        db.update(cliente_tabela,values, cliente_cod+" = ?",
                new String[]{String.valueOf(cli.getCod())});
        db.close();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

package com.example.atividadecrud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String nome = "banco";
    private static final int version = 1;

    public Conexao(@Nullable Context context) {
        super(context, nome, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table pessoa(id integer primary key autoincrement, " +
                "nome varchar(50), frase varchar(100), imagem varchar(100))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

package com.example.atividadecrud;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {

    private final List<Pessoa> pessoas;
    private final Activity activity;

    public adapter(List<Pessoa> pessoas, Activity activity) {
        this.pessoas = pessoas;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int i) {
        return pessoas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return pessoas.get(i).getId();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View view = activity.getLayoutInflater().inflate(R.layout.item, parent, false);
        TextView nome = view.findViewById(R.id.nome);
        TextView frase = view.findViewById(R.id.frase);
        TextView imagem = view.findViewById(R.id.imagem);
        Pessoa p = pessoas.get(i);
        nome.setText(p.getNome());
        frase.setText(p.getFrase());
        imagem.setText(p.getImagem());

        return view;
    }
}

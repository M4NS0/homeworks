package com.example.aula_19.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aula_19.R;

import java.util.List;

public class MeuAdapter extends BaseAdapter {

    Context context;
    int lista_contato;
    List<Contato> lista;
    LayoutInflater inflater;

    public MeuAdapter(Context context, int lista_contato, List<Contato> lista) {
        this.context = context;
        this.lista_contato = lista_contato;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_lista,parent,false);
        }

        TextView id;
        TextView nome;
        TextView telefone;

        id = convertView.findViewById(R.id.id);
        nome = convertView.findViewById(R.id.nome);
        telefone = convertView.findViewById(R.id.telefon);

        id.setText(lista.get(position).getId());
        nome.setText(lista.get(position).getNome());
        telefone.setText(lista.get(position).getTelefone());

        return convertView;
    }
}

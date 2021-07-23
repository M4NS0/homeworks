package com.bighiccups.aula13.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bighiccups.aula13.R;

import java.util.List;

public class MeuAdaptador extends BaseAdapter {

    Context context;
    int lista_contato;
    List<Contato> lista;
    LayoutInflater inflater;

    public MeuAdaptador(Context context, int lista_contato, List<Contato>lista) {
        this.context = context;
        this.lista_contato = lista_contato;
        this.lista = lista;
    }
    public MeuAdaptador () {

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
        if (convertView == null ) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_lista, parent, false);
        }
        TextView id, nome, telefone;
        id = convertView.findViewById(R.id.id);
        nome = convertView.findViewById(R.id.nome);
        telefone = convertView.findViewById(R.id.telefone);

        id.setText(lista.get(position).getId());
        nome.setText(lista.get(position).getNome());
        telefone.setText(lista.get(position).getTelefone());
        return convertView;
    }

    public List<Contato> getLista() {
        return lista;
    }
}

package com.bighiccups.aula04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorCustomizado extends ArrayAdapter<Heroes> {

    private Context contexto;
    private int resourceLista;


    public AdaptadorCustomizado(@NonNull Context context, int resource, @NonNull List<Heroes> objects) {
        super(context, resource, objects);
        this.contexto = context;
        this.resourceLista = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String nome = getItem(position).getNome();
        String poder = getItem(position).getPoder();
        String vigor = getItem(position).getVigor();

        Heroes heroes = new Heroes(nome,poder,vigor);
        LayoutInflater inflater = LayoutInflater.from(contexto);
        convertView = inflater.inflate(resourceLista, parent,false);

        TextView tvNome = convertView.findViewById(R.id.texto1);
        TextView tvPoder = convertView.findViewById(R.id.texto2);
        TextView tvVigor = convertView.findViewById(R.id.texto3);

        tvNome.setText(nome);
        tvPoder.setText("Poder: "+poder);
        tvVigor.setText("Vigor: "+vigor);

        return convertView;
    }
}

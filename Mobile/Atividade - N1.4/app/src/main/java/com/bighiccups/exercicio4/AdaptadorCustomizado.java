package com.bighiccups.exercicio4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorCustomizado extends ArrayAdapter<Produtos> {
    private Context context;
    private int resourceList;



    public AdaptadorCustomizado(@NonNull Context context, int resource, @NonNull ArrayList<Produtos> object) {
        super(context, resource, object);
        this.context = context;
        this.resourceList = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String nome = getItem(position).getNome();
        int id = getItem(position).getId();
        Double preco = getItem(position).getPreco();

        Produtos produtos = new Produtos(nome,id,preco);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceList, parent, false);

        TextView tvNome = convertView.findViewById(R.id.nome);
        TextView tvId = convertView.findViewById(R.id.id);
        TextView tvPreco = convertView.findViewById(R.id.preco);

        tvNome.setText("" + nome + "");
        tvId.setText("" + id + "");
        tvPreco.setText("" + preco + "" );

        return convertView;
    }
}

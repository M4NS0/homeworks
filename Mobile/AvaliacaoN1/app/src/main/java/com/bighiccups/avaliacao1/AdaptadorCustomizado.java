package com.bighiccups.avaliacao1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptadorCustomizado extends ArrayAdapter<Registros> {
    private Context context;
    private int resourceList;



    public AdaptadorCustomizado(@NonNull Context context, int resource, @NonNull ArrayList<Registros> object) {
        super(context, resource, object);
        this.context = context;
        this.resourceList = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String nome = getItem(position).getNome();
        int cont = getItem(position).getContador();
        String data = getItem(position).getData();

        Registros produtos = new Registros(nome,data,cont);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceList, parent, false);

        TextView tvNome = convertView.findViewById(R.id.lst_nome);
        TextView tvContador = convertView.findViewById(R.id.lst_contador);
        TextView tvData = convertView.findViewById(R.id.lst_data);

        tvNome.setText("" + nome + "");
        tvContador.setText("" + cont + "");
        tvData.setText("" + data + "" );

        return convertView;
    }
}

package com.bighiccups.exercicio3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdaptadorCustomizado extends ArrayAdapter<Itens> {
    private Context context;
    private int resourceList;


    public AdaptadorCustomizado(@NonNull Context context, int resource, @NonNull List<Itens> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourceList = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String item = getItem(position).getItem();
        int num = getItem(position).getNum();

        Itens lista = new Itens(item,num);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceList, parent,false);

        TextView tvItem = convertView.findViewById(R.id.item);
        TextView tvNumero = convertView.findViewById(R.id.numero);

        tvItem.setText("" + item + "");
        tvNumero.setText("" + num + "");

        return convertView;

    }


}

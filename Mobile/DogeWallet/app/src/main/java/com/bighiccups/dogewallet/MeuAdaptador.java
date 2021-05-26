package com.bighiccups.dogewallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bighiccups.dogewallet.model.Crypto;

import java.util.List;

public class MeuAdaptador extends BaseAdapter {

    Context context;
    int lista_crypto;
    List<Crypto> lista;
    LayoutInflater inflater;

    public MeuAdaptador(Context context, int lista_crypto, List<Crypto> lista) {
        this.context = context;
        this.lista_crypto = lista_crypto;
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
        TextView name, price, exchange, currency, total;
        name = convertView.findViewById(R.id.name);
        price = convertView.findViewById(R.id.price);
        exchange = convertView.findViewById(R.id.exchange);
        total = convertView.findViewById(R.id.tv_total_value);

        name.setText(lista.get(position).getCoin());
        price.setText(lista.get(position).getPrice().toString() + " " + lista.get(position).getCurrency());
        exchange.setText(lista.get(position).getExchange());

        if(lista.get(position).getValue() != null) {
            total.setText(lista.get(position).getValue().toString() + " " + lista.get(position).getCurrency());
        }

        return convertView;

    }

    public List<Crypto> getLista() {
        return lista;
    }
}


package com.bighiccups.dogewallet.services;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bighiccups.dogewallet.R;
import com.bighiccups.dogewallet.model.Coin;
import com.bighiccups.dogewallet.tools.Tools;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShortListAdapter extends BaseAdapter {
    Context context;
    int numero;
    List<Coin> lista;
    LayoutInflater inflater;

    public ShortListAdapter(Context context, int numero, List<Coin> lista) {
        this.context = context;
        this.numero = numero;
        this.lista = lista;
    }

    public ShortListAdapter() {
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
        DecimalFormat formatter = new DecimalFormat("0.00");

        TextView name, price, exchange, total;
        name = convertView.findViewById(R.id.name);
        price = convertView.findViewById(R.id.price);
        exchange = convertView.findViewById(R.id.exchange);
        total = convertView.findViewById(R.id.tv_total_value);

        String quantityStr = lista.get(position).getQuantity().toString();
        Double quantity = Double.parseDouble(quantityStr);

        Double coinPrice =  lista.get(position).getCryptoPrice();
        String priceStr = formatter.format(lista.get(position).getCryptoPrice());

        Double value = quantity * coinPrice;
        String formattedValue = formatter.format(value);
        total.setText(formattedValue);

        price.setText(priceStr + " " + lista.get(position).getSymbol());

        name.setText(lista.get(position).getCoinName());
        exchange.setText(lista.get(position).getExchange());
        return convertView;
    }
}

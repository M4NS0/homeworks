package com.bighiccups.dogewallet.services;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bighiccups.dogewallet.R;
import com.bighiccups.dogewallet.model.ApiObjectToDb;


import java.util.List;

public class DatabaseListAdapter extends BaseAdapter {

    Context context;
    int lista_crypto;
    List<ApiObjectToDb> lista;
    LayoutInflater inflater;

    public DatabaseListAdapter(Context context, int lista_crypto, List<ApiObjectToDb> lista) {
        this.context = context;
        this.lista_crypto = lista_crypto;
        this.lista = lista;
    }
    public DatabaseListAdapter() {

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
            convertView = inflater.inflate(R.layout.layout_lista_bd, parent, false);
        }

        TextView day, price, owned, valueFromLastIndex, gainFromLastIndex, percentageOfGainFromLastIndex;

        day = convertView.findViewById(R.id.bd_day);
        price = convertView.findViewById(R.id.bd_coin_price);
        owned = convertView.findViewById(R.id.bd_total_owned);
        valueFromLastIndex = convertView.findViewById(R.id.bd_total_value);
        gainFromLastIndex = convertView.findViewById(R.id.bd_gain);
        percentageOfGainFromLastIndex = convertView.findViewById(R.id.bd_variation);

        day.setText(lista.get(position).getDate());
        price.setText(lista.get(position).getCoinPrice().toString());
        owned.setText(lista.get(position).getTotalOfCoinsOwned().toString());
        valueFromLastIndex.setText(lista.get(position).getTotalValue().toString());
        gainFromLastIndex.setText(lista.get(position).getGainFromLastValue().toString());
        percentageOfGainFromLastIndex.setText(lista.get(position).getPercentOfGainFromLastValue().toString());

        GetVariationColor(position, percentageOfGainFromLastIndex);

        return convertView;
    }

    private void GetVariationColor(int position, TextView percentageOfGainFromLastIndex) {
        Double aux = lista.get(position).getPercentOfGainFromLastValue();
        if (aux <= 0.0) percentageOfGainFromLastIndex.setTextColor(Color.RED);
        else percentageOfGainFromLastIndex.setTextColor(Color.GREEN);
    }


    public List<ApiObjectToDb> getLista() {
        return lista;
    }
}


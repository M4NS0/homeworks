package com.bighiccups.dogewallet;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bighiccups.dogewallet.model.Details;

import java.util.List;

public class MeuAdaptadorBd extends BaseAdapter {

    Context context;
    int lista_crypto;
    List<Details> lista;
    LayoutInflater inflater;

    public MeuAdaptadorBd(Context context, int lista_crypto, List<Details> lista) {
        this.context = context;
        this.lista_crypto = lista_crypto;
        this.lista = lista;
    }
    public MeuAdaptadorBd() {

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

        TextView day, price, owned, value, gain, variation;

        day = convertView.findViewById(R.id.bd_day);
        price = convertView.findViewById(R.id.bd_coin_price);
        owned = convertView.findViewById(R.id.bd_total_owned);
        value = convertView.findViewById(R.id.bd_total_value);
        gain = convertView.findViewById(R.id.bd_gain);
        variation = convertView.findViewById(R.id.bd_variation);

        day.setText(lista.get(position).getDate());
        price.setText(lista.get(position).getPrice());
        owned.setText(lista.get(position).getOwned());
        value.setText(lista.get(position).getValue());
        gain.setText(lista.get(position).getGain());
        variation.setText(lista.get(position).getVariation());

        //GetVariationColor(position, variation);


        return convertView;
    }

    private void GetVariationColor(int position, TextView variation) {
        Double aux = Double.parseDouble(lista.get(position).getVariation());
        if (aux <= 0.0) variation.setTextColor(Color.RED);
        else variation.setTextColor(Color.GREEN);
    }


    public List<Details> getLista() {
        return lista;
    }
}


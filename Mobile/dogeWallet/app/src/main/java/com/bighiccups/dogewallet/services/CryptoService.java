package com.bighiccups.dogewallet.services;


import android.os.AsyncTask;

import com.bighiccups.dogewallet.MainActivity;
import com.bighiccups.dogewallet.model.Coin;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CryptoService extends AsyncTask<String, String, Coin> {
    Coin coin = new Coin();
    @Override
    protected Coin doInBackground(String... strings) {
        HttpURLConnection connection = null;
        BufferedReader buffer = null;
        Coin coin = new Coin();

        try {
            URL url = new URL("https://sochain.com//api/v2/get_price/DOGE/USD");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            buffer = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";
            while ((line = buffer.readLine()) != null) {
                stringBuffer.append(line);
            }

            String coinsJson = stringBuffer.toString();
            JSONObject jsonObj = new JSONObject(coinsJson);

            Double price = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getDouble("price");
            String exchangeStr = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getString("exchange");

            coin.setCryptoPrice(price);
            coin.setExchange(exchangeStr);



        } catch (IOException | JSONException e) {
            e.printStackTrace();

        } finally {
            try {
                buffer.close();
                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL");
            connection = (HttpURLConnection)url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            buffer = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String linha = "";
            while ((linha = buffer.readLine())!= null) {
                stringBuffer.append(linha);
            }


            String quotation = stringBuffer.toString();
            JSONObject jsonObj = new JSONObject(quotation);
            Double json = jsonObj.getJSONObject("USDBRL").getDouble("ask");
            coin.setUsdPrice(json);

        } catch (IOException | JSONException e){
            e.printStackTrace();

        } finally {
            try {
                buffer.close();
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return coin;
    }

    @Override
    protected void onPostExecute(Coin obj) {
        super.onPostExecute(obj);
        SendData(obj);

    }

    private void SendData(Coin obj) {
        MainActivity service = new MainActivity();
        service.setCryptoPrice(obj.getCryptoPrice());
        service.setQuotation(obj.getUsdPrice());
        service.setExchange(obj.getExchange());
    }
}
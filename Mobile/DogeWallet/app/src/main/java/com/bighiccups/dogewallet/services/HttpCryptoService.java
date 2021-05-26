package com.bighiccups.dogewallet.services;

import android.os.AsyncTask;

import com.bighiccups.dogewallet.model.Crypto;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class HttpCryptoService extends AsyncTask<String, String, List<Crypto>> {

    private ArrayList<Crypto> cryptos;
    private Crypto crypto;


    @Override
    protected List<Crypto> doInBackground(String... strings) {
        cryptos = new ArrayList<>();
        HttpURLConnection connection = null;
        BufferedReader buffer = null;
        crypto = new Crypto();

        try {
            URL url = new URL("https://sochain.com//api/v2/get_price/DOGE/USD");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            buffer = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String linha = "";
            while ((linha = buffer.readLine()) != null) {
                stringBuffer.append(linha);
            }

            String coinsJson = stringBuffer.toString();
            JSONObject jsonObj = new JSONObject(coinsJson);

            String networkStr = jsonObj.getJSONObject("data").getString("network");
            Double priceValue = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getDouble("price");
            String exchangeStr = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getString("exchange");

            DecimalFormat formatter = new DecimalFormat("0.00");
            String cryptoStr = formatter.format(priceValue);

            crypto.setCoin(networkStr);
            crypto.setPrice(parseDouble(cryptoStr));
            crypto.setExchange(exchangeStr.toUpperCase());
            crypto.setCurrency(" USD");
            cryptos.add(crypto);

            return cryptos;

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
        return null;
    }

    @Override
    protected void onPostExecute(List<Crypto> cryptos) {
        super.onPostExecute(cryptos);

    }

    public ArrayList<Crypto> getList() {
        return cryptos;
    }
}
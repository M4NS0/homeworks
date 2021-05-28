package com.bighiccups.dogewallet.services;


import android.os.AsyncTask;

import com.bighiccups.dogewallet.MainActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ConversionService extends AsyncTask<String, String, Double> {
    @Override
    protected Double doInBackground(String... strings) {
        HttpURLConnection connection = null;
        BufferedReader buffer = null;


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
            return json;

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
        return null;
    }

    @Override
    protected void onPostExecute(Double valor) {
        super.onPostExecute(valor);
        MainActivity service = new MainActivity();
        service.setQuotation(valor);
    }
}
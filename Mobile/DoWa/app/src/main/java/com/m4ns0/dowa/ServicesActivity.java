package com.m4ns0.dowa;

import android.content.Intent;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.m4ns0.dowa.model.Coin;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;


public class ServicesActivity extends AppCompatActivity {
    Coin coin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        coin = new Coin();
        CallHttpServices();
        IntentToNextActivity();
    }

    private void IntentToNextActivity() {
        Toast.makeText(this, coin.getUsdPrice() + " " + coin.getExchange(), Toast.LENGTH_SHORT).show();
    }

    private void Refresh() {
        Intent i = new Intent(ServicesActivity.this, ServicesActivity.class);
        finish();
        overridePendingTransition(0, 0);
        startActivity(i);
        overridePendingTransition(0, 0);
    }


    private double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return Double.parseDouble(formatter.format(number));
    }

    private void CallHttpServices() {


        HttpConversionService conversionService = new HttpConversionService();
        conversionService.execute();

        HttpCryptoService coinService = new HttpCryptoService();
        coinService.execute();
    }

    private class HttpCryptoService extends AsyncTask<String, String, Coin> {
        @Override
        protected Coin doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader buffer = null;
            coin = new Coin();

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

                Double price = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getDouble("price");
                String exchangeStr = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getString("exchange");

                Double formattedPrice = DecimalFormatter(price);

                coin.setExchange(exchangeStr);
                coin.setCryptoPrice(formattedPrice);


                return coin;

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
        protected void onPostExecute(Coin obj) {
            super.onPostExecute(obj);
        }
    }

    public class HttpConversionService extends AsyncTask<String, String, Double> {

        @Override
        protected Double doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader buffer = null;


            try {
                URL url = new URL("https://economia.awesomeapi.com.br/last/USD-BRL");
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


                String cotacaoJson = stringBuffer.toString();
                JSONObject jsonObj = new JSONObject(cotacaoJson);

                Double priceValue = jsonObj.getJSONObject("USDBRL").getDouble("ask");

                return priceValue;

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
        protected void onPostExecute(Double valor) {
            super.onPostExecute(valor);
            coin.setUsdPrice(valor);
        }
    }
}
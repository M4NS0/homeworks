package com.bighiccups.dowa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;
import com.bighiccups.dowa.model.Coin;
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

        CallHttpServices();
        IntentToNextActivity();
    }

    private double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return Double.parseDouble(formatter.format(number));
    }

    private void CallHttpServices() {
        HttpServices coinService = new HttpServices();
        coinService.execute();

        HttpConversionService conversionService = new HttpConversionService();
        conversionService.execute();
    }

    public class HttpServices extends AsyncTask<String, String, Coin> {

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
                String linha;
                while ((linha = buffer.readLine()) != null) {
                    stringBuffer.append(linha);
                }
                String coinsJson = stringBuffer.toString();
                JSONObject jsonObj = new JSONObject(coinsJson);

                Double price = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getDouble("price");
                String exchangeStr = jsonObj.getJSONObject("data").getJSONArray("prices").getJSONObject(1).getString("exchange");

                Double cryptoPrice = DecimalFormatter(price);

                coin.setCryptoPrice(cryptoPrice);
                coin.setExchange(exchangeStr);
                return coin;

            } catch (Exception e) {
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
        protected void onPostExecute(Coin coinObj) {
            super.onPostExecute(coinObj);
            coin = coinObj;

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
                String linha;
                while ((linha = buffer.readLine()) != null) {
                    stringBuffer.append(linha);
                }

                String cotacaoJson = stringBuffer.toString();
                JSONObject jsonObj = new JSONObject(cotacaoJson);
                Double usdPrice = jsonObj.getJSONObject("USDBRL").getDouble("ask");

                return usdPrice;

            } catch (Exception e) {
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
        protected void onPostExecute(Double usdPrice) {
            super.onPostExecute(usdPrice);
            coin.setUsdPrice(usdPrice);
        }
    }

    private void IntentToNextActivity() {
        Toast.makeText(this, coin.getUsdPrice() + " " + coin.getExchange(), Toast.LENGTH_SHORT).show();
    }
}


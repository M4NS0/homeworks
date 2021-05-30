package com.bighiccups.dogewallet;

import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.Coin;
import com.bighiccups.dogewallet.services.ShortListAdapter;
import com.bighiccups.dogewallet.tools.Tools;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView name, exch, price, saida;
    EditText entrada;
    ListView listView;
    ImageButton doge, add, remove, view;
    SoundPool snd;
    int soundOneBark, soundHowl, soundBarkHowl, soundWhines;
    Coin coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.primeira_tela_portrait);
        } else {
            setContentView(R.layout.primeira_tela_landscape);
        }
        coin = new Coin();

        SetScreen();
        CallHttpServices();
        doge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saida.getText() == "") {
                    Toast.makeText(MainActivity.this, "Please Insert Coins", Toast.LENGTH_SHORT).show();
                    toBark(0.0);
                }
                saida.setText(entrada.getText());
                PopulateObjAndList(saida.getText().toString());

            }
        });
    }

    private void CallHttpServices() {
        HttpCryptoService cryptoService = new HttpCryptoService();
        cryptoService.execute();

        HttpConversionService conversionService = new HttpConversionService();
        conversionService.execute();
    }

    private void PopulateObjAndList(String quantityStr) {
        List<Coin> list = new ArrayList<>();
        Double quantity = Double.parseDouble(quantityStr);
        coin.setQuantity(quantity);
        coin.setSymbol(" USD");
        list.add(coin);
        ToAdapter(list);
    }

    private void ToAdapter(List<Coin> list) {
        ShortListAdapter adapter = new ShortListAdapter(MainActivity.this, R.layout.layout_lista, list);
        listView.setAdapter(adapter);
    }

    private void toBark(Double coins) {
        if (coins == 0.0) {
            snd.play(soundWhines, 1, 1, 5, 0, 1);
        }
        if (coins >= 1) {
            snd.play(soundOneBark, 1, 1, 5, 0, 1);
        }
        if (coins >= 1000 && coins <= 9999) {
            snd.play(soundHowl, 1, 1, 5, 0, 1);
        }
        if (coins >= 10000) {
            snd.play(soundBarkHowl, 1, 1, 5, 0, 1);
        }
    }

    private void SetScreen() {
        doge = findViewById(R.id.ib_doge);
        entrada = findViewById(R.id.entrada);
        saida = findViewById(R.id.saida);
        add = findViewById(R.id.ib_add);
        remove = findViewById(R.id.ib_remove);
        view = findViewById(R.id.ib_view);
        listView = findViewById(R.id.lista);

        name = findViewById(R.id.name);
        exch = findViewById(R.id.exchange);
        price = findViewById(R.id.price);

        snd = new SoundPool(1, AudioManager.STREAM_MUSIC, 3);
        soundOneBark = snd.load(MainActivity.this, R.raw.onebark, 4);
        soundHowl = snd.load(MainActivity.this, R.raw.howl, 4);
        soundBarkHowl = snd.load(MainActivity.this, R.raw.barkandhowl, 4);
        soundWhines = snd.load(MainActivity.this, R.raw.whines, 4);
    }

    public class HttpCryptoService extends AsyncTask<String, String, Coin> {
        @Override
        protected Coin doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader buffer = null;

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
                String name = jsonObj.getJSONObject("data").getString("network");

                coin.setCoinName(name);
                coin.setCryptoPrice(price);
                coin.setExchange(exchangeStr);

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
        protected void onPostExecute(Coin coin) {
            super.onPostExecute(coin);
        }
    }

    public class HttpConversionService extends AsyncTask<String, String, Coin> {
        @Override
        protected Coin doInBackground(String... strings) {
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

                coin.setUsdPrice(json);

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
        protected void onPostExecute(Coin coin) {
            super.onPostExecute(coin);
        }
    }
}

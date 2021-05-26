package com.bighiccups.dogewallet;


import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.Cotacao;
import com.bighiccups.dogewallet.model.Crypto;
import com.bighiccups.dogewallet.model.Details;
import com.bighiccups.dogewallet.services.DetailsDatabase;

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

// Faltando:
// segunda_tela_landscape && prefs
// prefs
// running application directly from mobile crashes, but running into A.S, don't

public class PrimeiraAtividadeBackup extends AppCompatActivity {
    TextView name, exchange, price, saida;
    EditText entrada;
    ListView listView;
    String texto;
    SharedPreferences prefs;
    MeuAdaptador meuAdaptador;
    DetailsDatabase bd_details = new DetailsDatabase(this);
    Crypto crypto;
    Cotacao cotacao;
    ArrayList<Crypto> cryptos;
    List<Details> details;

    SoundPool snd;
    int soundOneBark, soundHowl, soundBarkHowl, soundWhines;
    ImageButton doge, add, remove, view;
    Bundle extras;

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

        name = findViewById(R.id.name);
        exchange = findViewById(R.id.exchange);
        price = findViewById(R.id.price);

        doge = findViewById(R.id.ib_doge);
        listView = findViewById(R.id.lista);
        entrada = findViewById(R.id.entrada);
        saida = findViewById(R.id.saida);
        entrada = findViewById(R.id.entrada);


        add = findViewById(R.id.ib_add);
        remove = findViewById(R.id.ib_remove);
        view = findViewById(R.id.ib_view);


        prefs = getSharedPreferences("texto", MODE_PRIVATE);
        texto = prefs.getString("texto", saida.getText().toString());
        // other prefs
        saida.setText(texto);

        snd = new SoundPool(1, AudioManager.STREAM_MUSIC, 3);
        soundOneBark = snd.load(PrimeiraAtividadeBackup.this, R.raw.onebark, 4);
        soundHowl = snd.load(PrimeiraAtividadeBackup.this, R.raw.howl, 4);
        soundBarkHowl = snd.load(PrimeiraAtividadeBackup.this, R.raw.barkandhowl, 4);
        soundWhines = snd.load(PrimeiraAtividadeBackup.this, R.raw.whines, 4);

        GetSecondScreenIntent();
        CallHttpServices();

        doge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (entrada.getText().toString().equals("")) {
                    saida.setText(crypto.getNumberOfCoins().toString());
                    toBark(0.0);
                } else {
                    crypto.setNumberOfCoins(Double.parseDouble(entrada.getText().toString()));
                    crypto.setValue(DecimalFormatter(crypto.getNumberOfCoins() * crypto.getPrice()));
                    CallAdapter();
                    toBark(Double.parseDouble(entrada.getText().toString()));
                }
                entrada.setText("0");

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetNumberOfCoinsFromBDAndSum();
                PushToSecondActivity();

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetNumberOfCoinsFromBDAndSum();
                PushToSecondActivity();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Calculate(position);
            }
        });
    }

    private void PushToSecondActivity() {
        Intent intent = new Intent(PrimeiraAtividadeBackup.this, SegundaAtividade.class);
        Bundle extras = new Bundle();
        Double value = DecimalFormatter(crypto.getPrice() * crypto.getNumberOfCoins());
        crypto.setValue(value);

        extras.putString("variation",GetVariation(value) );
        extras.putString("value", crypto.getValue().toString());
        extras.putString("price", crypto.getPrice().toString());
        extras.putString("owned", crypto.getNumberOfCoins().toString());
        extras.putString("gain", GetGain());


        if (crypto.getNumberOfCoins() > 0) {
            intent.putExtras(extras);
            startActivity(intent);
        } else {
            Toast.makeText(PrimeiraAtividadeBackup.this, "Insert the number of coins before adding", Toast.LENGTH_SHORT).show();
        }
        crypto = null;

    }

    private String GetVariation(Double currentValue) {
        String variation = "0.0";
        details = bd_details.listTransactions();
        if (details.size() != 0) {
            Double previouslyValue = Double.parseDouble(details.get(details.size() - 1).getValue());
            Double calc = (currentValue * 100)/previouslyValue;
            int aux = ShortFormatter(calc);
            variation = aux + "";
            return variation;
        }
        return variation;
    }


    private String GetGain() {
        String gainStr = "";
        details = bd_details.listTransactions();
        if (details.size() != 0) {
            Double previouslyValue = Double.parseDouble(details.get(details.size() - 1).getValue());
            Double currentValue = crypto.getNumberOfCoins() * crypto.getPrice();
            Double gain = DecimalFormatter(currentValue - previouslyValue);
            gainStr = gain.toString();

            return gainStr;
        }

        return gainStr;
    }

    private void GetNumberOfCoinsFromBDAndSum() {
        details = bd_details.listTransactions();
        if (details.size() != 0) {
            Double ownedCoinsFromLastIndex = Double.parseDouble(details.get(details.size() - 1).getOwned());
            Double newCoinInsertCoins = crypto.getNumberOfCoins();
            crypto.setNumberOfCoins(ownedCoinsFromLastIndex + newCoinInsertCoins);
        }
    }

    private void GetSecondScreenIntent() {
        Intent intent = getIntent();
        extras = intent.getExtras();
        if (extras != null) {
            Double auxDb = Double.parseDouble(extras.getString("owned"));
            String auxStr = auxDb.toString();
            crypto.setNumberOfCoins(auxDb);
            saida.setText(auxStr);
            CallAdapter();
        }
    }

    private void Calculate(int position) {
        if (cryptos.get(position).getCurrency() == " USD") {
            cryptos.get(position).setCurrency(" BRL");
            Double crypto = cryptos.get(position).getPrice() * cotacao.getCotacao();
            cryptos.get(position).setPrice(DecimalFormatter(crypto));

        } else {
            cryptos.get(position).setCurrency(" USD");
            Double crypto = cryptos.get(position).getPrice() / cotacao.getCotacao();
            cryptos.get(position).setPrice(DecimalFormatter(crypto));
        }
        if (cryptos.get(position).getNumberOfCoins() != 0.0) {
            cryptos.get(position).setValue(DecimalFormatter(cryptos.get(position).getNumberOfCoins() * cryptos.get(position).getPrice()));
        }

        CallAdapter();
    }

    private double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return Double.parseDouble(formatter.format(number));
    }

    private int ShortFormatter (Double number) {
        if (number > 0) {
            DecimalFormat formatter = new DecimalFormat("0");
            return Integer.parseInt(formatter.format(number));
        }
        return 0;
    }


    private void CallHttpServices() {
        HttpCryptoService coinService = new HttpCryptoService();
        coinService.execute();

        HttpConversionService conversionService = new HttpConversionService();
        conversionService.execute();
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


    private void CallAdapter() {
        meuAdaptador = new MeuAdaptador(PrimeiraAtividadeBackup.this, R.layout.layout_lista, cryptos);
        listView.setAdapter(meuAdaptador);
    }

    public void passaTexto(View view) {
        texto = entrada.getText().toString();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("texto", texto);
        editor.apply();
        entrada.setText(texto);
    }

    public class HttpCryptoService extends AsyncTask<String, String, List<Crypto>> {
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
                crypto.setNumberOfCoins((double) 0);
                crypto.setValue(0.0);
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
            CallAdapter();
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
            cotacao = new Cotacao();
            cotacao.setCotacao(valor);


        }

    }


}
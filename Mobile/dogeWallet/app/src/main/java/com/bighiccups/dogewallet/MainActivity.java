package com.bighiccups.dogewallet;

import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.SoundPool;
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
import com.bighiccups.dogewallet.services.CryptoService;

public class MainActivity extends AppCompatActivity {
    TextView name, exchange, price, saida;
    EditText entrada;
    ListView listView;
    ImageButton doge, add, remove, view;
    private Coin coin = new Coin();
    SoundPool snd;
    int soundOneBark, soundHowl, soundBarkHowl, soundWhines;

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
        SetScreen();
        CallHttpServices();
        
        doge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saida.getText() == "") {
                    Toast.makeText(MainActivity.this, "Please Insert Coins", Toast.LENGTH_SHORT).show();
                    toBark(0.0);
                }

            }
        });
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

        snd = new SoundPool(1, AudioManager.STREAM_MUSIC, 3);
        soundOneBark = snd.load(MainActivity.this, R.raw.onebark, 4);
        soundHowl = snd.load(MainActivity.this, R.raw.howl, 4);
        soundBarkHowl = snd.load(MainActivity.this, R.raw.barkandhowl, 4);
        soundWhines = snd.load(MainActivity.this, R.raw.whines, 4);
    }


    private void CallHttpServices() {
        CryptoService cryptoService = new CryptoService();
        cryptoService.execute();
    }

    public void setCryptoPrice(Double price) {
        coin.setCryptoPrice(price);
    }

    public void setQuotation(Double quot) {
        coin.setUsdPrice(quot);
    }

    public void setExchange(String exc) {
        coin.setExchange(exc);

    }
}

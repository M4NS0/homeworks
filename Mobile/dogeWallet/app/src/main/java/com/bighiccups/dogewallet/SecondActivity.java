package com.bighiccups.dogewallet;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.ApiObject;
import com.bighiccups.dogewallet.model.BdObject;
import com.bighiccups.dogewallet.model.Coin;
import com.bighiccups.dogewallet.services.Database;

import java.util.Calendar;

public class SecondActivity extends AppCompatActivity{
    ImageButton imageButton_back, imageButton_clear_list;
    ListView listView;
    Database database = new Database(this);
    ApiObject apiObject;
    Coin coin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.segunda_tela_portrait);

        } else {
//            setContentView(R.layout.segunda_tela_landscape);
        }
        SetView();
        GetIntent();
        PopulateBdObject();
    }

    private void PopulateBdObject() {
        apiObject = new ApiObject();
        String date = GetCurrentDay();
        apiObject.setDate(date);
        apiObject.setCoinPrice(coin.getCryptoPrice());
        apiObject.setTotalOfCoinsOwned(coin.getQuantity());
        apiObject.setTotalValue(coin.getValue());
    }

    private String GetCurrentDay() {
            Calendar calendar = Calendar.getInstance();
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);

            String date = day + "/" + month + "/" + year;
            return date;
    }

    private void PopulateCoinObjext(String cryptoPrice, String usdPrice, String exchange, String quantity, String value, String symbol, String coinName) {
        coin.setCryptoPrice(Double.parseDouble(cryptoPrice));
        coin.setUsdPrice(Double.parseDouble(usdPrice));
        coin.setExchange(exchange);
        coin.setQuantity(Double.parseDouble(quantity));
        coin.setValue(Double.parseDouble(value));
        coin.setSymbol(symbol);
        coin.setCoinName(coinName);

    }
    private void GetIntent() {
        Bundle extras = new Bundle();
        Intent intent = getIntent();
        extras = intent.getExtras();
        String cryptoPrice = extras.getString("cryptoPrice");
        String usdPrice = extras.getString("UsdPrice");
        String exchange = extras.getString("exchange");
        String quantity = extras.getString("quantity");
        String value = extras.getString("value");
        String symbol = extras.getString("symbol");
        String coinName = extras.getString("coinName");

        PopulateCoinObjext(cryptoPrice,usdPrice,exchange,quantity,value,symbol,coinName);

    }

    private void SetView() {
        imageButton_back = findViewById(R.id.ib_view_back);
        imageButton_clear_list = findViewById(R.id.ib_clear_list);
        listView = findViewById(R.id.lista_bd);
    }
}

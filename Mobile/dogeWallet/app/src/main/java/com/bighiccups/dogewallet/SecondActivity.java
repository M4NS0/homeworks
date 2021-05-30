package com.bighiccups.dogewallet;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.ApiObjectToBD;
import com.bighiccups.dogewallet.model.ApiObjectFromDb;
import com.bighiccups.dogewallet.model.Coin;
import com.bighiccups.dogewallet.services.Database;
import com.bighiccups.dogewallet.services.DatabaseListAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SecondActivity extends AppCompatActivity{
    ImageButton imageButton_back, imageButton_clear_list;
    ListView listView;
    Database databaseConnection = new Database(this);
    DatabaseListAdapter databaseListAdapter;
    Coin coin;
    ApiObjectToBD apiObjectToBD;
    ApiObjectFromDb apiObjectFromDb;
    List<ApiObjectFromDb> listFromDatabase;
    List<ApiObjectToBD> listToDatabase;

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
        GetDataFromDB();



    }

    private void GetDataFromDB() {
        apiObjectFromDb = new ApiObjectFromDb();
        listFromDatabase = new ArrayList<>();
        listFromDatabase = databaseConnection.listTransactions();
        if (!listFromDatabase.isEmpty()) {
            if (listFromDatabase.size() == 1) {
                GetListFromDbWithOneItem();
            } if (listFromDatabase.size() > 1) {
                GetLastIndexOfBdList();
            }
        } else {
            GetOnlyLastAddition();
        }
        ToBdListAdapter();


    }

    private void ToBdListAdapter() {
        databaseListAdapter = new DatabaseListAdapter(SecondActivity.this, R.layout.layout_lista_bd, listToDatabase);
        listView.setAdapter(databaseListAdapter);
    }

    private void GetOnlyLastAddition() {
        AddNewTransaction();
    }

    private void GetLastIndexOfBdList() {
        apiObjectFromDb.setId(listFromDatabase.get(listFromDatabase.size() -1).getId());
        apiObjectFromDb.setDate(listFromDatabase.get(listFromDatabase.size() -1).getDate());
        apiObjectFromDb.setPrice(listFromDatabase.get(listFromDatabase.size() -1).getPrice());
        apiObjectFromDb.setOwned(listFromDatabase.get(listFromDatabase.size() -1).getOwned());
        apiObjectFromDb.setValue(listFromDatabase.get(listFromDatabase.size() -1).getValue());
        apiObjectFromDb.setGain(listFromDatabase.get(listFromDatabase.size() -1).getGain());
        apiObjectFromDb.setVariation(listFromDatabase.get(listFromDatabase.size() -1).getVariation());

        listFromDatabase.add(apiObjectFromDb);
    }

    private void GetListFromDbWithOneItem() {
        apiObjectFromDb.setId(listFromDatabase.get(0).getId());
        apiObjectFromDb.setDate(listFromDatabase.get(0).getDate());
        apiObjectFromDb.setPrice(listFromDatabase.get(0).getPrice());
        apiObjectFromDb.setOwned(listFromDatabase.get(0).getOwned());
        apiObjectFromDb.setValue(listFromDatabase.get(0).getValue());
        apiObjectFromDb.setGain(listFromDatabase.get(0).getGain());
        apiObjectFromDb.setVariation(listFromDatabase.get(0).getVariation());

        listFromDatabase.add(apiObjectFromDb);

    }

    private String GetCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        String date = day + "/" + month + "/" + year;
        return date;
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

        PopulateCoinObject(cryptoPrice,usdPrice,exchange,quantity,value,symbol,coinName);
    }

    private void PopulateCoinObject(String cryptoPriceStr, String usdPriceStr, String exchangeStr, String quantityStr, String valueStr, String symbolStr, String coinNameStr) {
        coin = new Coin();
        Double cryptoPrice = Double.parseDouble(cryptoPriceStr);
        Double usdPrice = Double.parseDouble(usdPriceStr);
        Double quantity = Double.parseDouble(quantityStr);
        Double value = Double.parseDouble(valueStr);
        coin.setCryptoPrice(cryptoPrice);
        coin.setUsdPrice(usdPrice);
        coin.setQuantity(quantity);
        coin.setValue(value);
        coin.setExchange(exchangeStr);
        coin.setSymbol(symbolStr);
        coin.setCoinName(coinNameStr);

        PopulateBdObject();

        PopulateBdList(coin);

    }

    private void PopulateBdList(Coin coin) {
        apiObjectToBD.setCoinPrice(coin.getCryptoPrice());
        apiObjectToBD.setDate(GetCurrentDay());
        apiObjectToBD.setGainFromLastValue(0.0);
        apiObjectToBD.setPercentOfGainFromLastValue(0.0);
        apiObjectToBD.setTotalValue(coin.getValue());
        apiObjectToBD.setTotalOfCoinsOwned(coin.getQuantity());

        listToDatabase.add(apiObjectToBD);
    }

    private void PopulateBdObject() {
        apiObjectToBD = new ApiObjectToBD();
        String date = GetCurrentDay();
        apiObjectToBD.setDate(date);
        apiObjectToBD.setCoinPrice(coin.getCryptoPrice());
        // logica dos sets abaixo

//        Double numberOfCoinsFromLastIndex = Double.parseDouble(apiObjectFromDb.getOwned());
//        apiObjectToBD.setTotalOfCoinsOwned(coin.getQuantity() + numberOfCoinsFromLastIndex);
        apiObjectToBD.setTotalValue(coin.getValue());

        AddNewTransaction();
    }

    private void AddNewTransaction() {
        databaseConnection.addCoin(new ApiObjectToBD(
                1, apiObjectToBD.getDate(),
                apiObjectToBD.getCoinPrice(),
                apiObjectToBD.getTotalOfCoinsOwned(),
                apiObjectToBD.getTotalValue(),
                apiObjectToBD.getGainFromLastValue(),
                apiObjectToBD.getPercentOfGainFromLastValue()));
    }

    private void SetView() {
        imageButton_back = findViewById(R.id.ib_view_back);
        imageButton_clear_list = findViewById(R.id.ib_clear_list);
        listView = findViewById(R.id.lista_bd);
    }
}

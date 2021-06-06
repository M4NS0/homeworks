package com.bighiccups.dogewallet;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.ApiObjectToDb;
import com.bighiccups.dogewallet.model.ApiObjectFromDb;
import com.bighiccups.dogewallet.model.Coin;
import com.bighiccups.dogewallet.services.Database;
import com.bighiccups.dogewallet.services.DatabaseListAdapter;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SecondActivity extends AppCompatActivity{
    ImageButton imageButton_back, imageButton_clear_list;
    ListView listView;
    Database databaseConnection = new Database(this);
    DatabaseListAdapter databaseListAdapter;
    Bundle extras;

    ApiObjectToDb apiObjectToDb;
    List<ApiObjectToDb> list = new ArrayList<>();
    private Coin coin;
    private ApiObjectFromDb apiObjectFromDb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.segunda_tela_portrait);

        } else {
            setContentView(R.layout.segunda_tela_landscape);
        }
        SetView();

        if (GetIntentStatus() == true) {
            SetObjectFromIntent();
            GetBdRecordings();

        } else {
            List<ApiObjectFromDb> listFromDatabase = databaseConnection.listTransactions();
            CopyListFromDatabaseToArrayToBeSaved(listFromDatabase);
            SetEmptyObj();
            AddNewTransaction();
            SendListToBdAdapter();

        }
        imageButton_clear_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseConnection.clearList();
                Toast.makeText(SecondActivity.this, "Wiping all records... ", Toast.LENGTH_SHORT).show();
                Refresh();
            }
        });

        imageButton_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Refresh();
            }
        });
    }

    private void GetBdRecordings() {

        List<ApiObjectFromDb> listFromDatabase = databaseConnection.listTransactions();
        CopyListFromDatabaseToArrayToBeSaved(listFromDatabase);

        if (listFromDatabase.isEmpty()) {
            SetEmptyObj();
            SetArrayWithNewObject();
            AddNewTransaction();
            SendListToBdAdapter();
        }
        if (listFromDatabase.size() == 1) {
            SetObjWithListSizeOne(listFromDatabase);
            SetArrayWithNewObjectFromBdAndInsert();
            AddNewTransaction();
            SendListToBdAdapter();
        }
        if (listFromDatabase.size() > 1) {
            SetObjWithLastIndexOfList(listFromDatabase);
            SetArrayWithNewObjectFromBdAndInsert();
            AddNewTransaction();
            SendListToBdAdapter();
        }
    }

    private void CopyListFromDatabaseToArrayToBeSaved(List<ApiObjectFromDb> listFromDatabase) {
        for (int i = 0; i < listFromDatabase.size(); i++) {
            apiObjectToDb = new ApiObjectToDb();
            apiObjectToDb.setId(listFromDatabase.get(i).getId());
            apiObjectToDb.setDate(listFromDatabase.get(i).getDate());
            Double totalOfCoins = Double.parseDouble(listFromDatabase.get(i).getOwned());
            apiObjectToDb.setTotalOfCoinsOwned(totalOfCoins);
            Double totalValue = Double.parseDouble(listFromDatabase.get(i).getValue());
            apiObjectToDb.setTotalValue(totalValue);
            Double lastPrice = Double.parseDouble(listFromDatabase.get(i).getPrice());
            apiObjectToDb.setCoinPrice(lastPrice);
            Double gain = Double.parseDouble(listFromDatabase.get(i).getGain());
            apiObjectToDb.setGainFromLastValue(gain);
            Double percentOdGain = Double.parseDouble(listFromDatabase.get(i).getVariation());
            apiObjectToDb.setPercentOfGainFromLastValue(percentOdGain);
            list.add(apiObjectToDb);
        }
    }

    private void SetEmptyObj() {
        apiObjectFromDb = new ApiObjectFromDb();
        apiObjectFromDb.setId(0);
        apiObjectFromDb.setDate("");
        apiObjectFromDb.setOwned("0.0");
        apiObjectFromDb.setValue("0.0");
        apiObjectFromDb.setPrice("0.0");
        apiObjectFromDb.setVariation("0.0");
        apiObjectFromDb.setGain("0.0");
    }

    private void SetArrayWithNewObject() {
        apiObjectToDb = new ApiObjectToDb();
        apiObjectToDb.setDate(GetCurrentDay());
        apiObjectToDb.setCoinPrice(coin.getCryptoPrice());
        apiObjectToDb.setTotalOfCoinsOwned(coin.getQuantity());
        apiObjectToDb.setTotalValue(coin.getValue());
        apiObjectToDb.setGainFromLastValue(0.0);
        apiObjectToDb.setPercentOfGainFromLastValue(0.0);

        list.add(apiObjectToDb);
    }

    private void AddNewTransaction() {
        databaseConnection.addCoin(new ApiObjectToDb(
                1, apiObjectToDb.getDate(),
                apiObjectToDb.getCoinPrice(),
                apiObjectToDb.getTotalOfCoinsOwned(),
                apiObjectToDb.getTotalValue(),
                apiObjectToDb.getGainFromLastValue(),
                apiObjectToDb.getPercentOfGainFromLastValue()));
    }

    private void SendListToBdAdapter() {
        databaseListAdapter = new DatabaseListAdapter(SecondActivity.this, R.layout.layout_lista_bd, list);
        listView.setAdapter(databaseListAdapter);
    }

    private void SetObjWithListSizeOne(List<ApiObjectFromDb> listFromDatabase) {
        apiObjectFromDb = new ApiObjectFromDb();
        apiObjectFromDb.setDate(listFromDatabase.get(0).getDate());
        apiObjectFromDb.setOwned(listFromDatabase.get(0).getOwned());
        apiObjectFromDb.setValue(listFromDatabase.get(0).getValue());
        apiObjectFromDb.setPrice(listFromDatabase.get(0).getPrice());
        apiObjectFromDb.setVariation(listFromDatabase.get(0).getVariation());
        apiObjectFromDb.setGain(listFromDatabase.get(0).getGain());

    }

    private void SetArrayWithNewObjectFromBdAndInsert() {
        apiObjectToDb = new ApiObjectToDb();
        apiObjectToDb.setCoinPrice(coin.getCryptoPrice());
        apiObjectToDb.setDate(GetCurrentDay());
        apiObjectToDb.setTotalOfCoinsOwned(GetTotalOfCoinsOwned());
        apiObjectToDb.setTotalValue(GetTotalValue(GetTotalOfCoinsOwned()));
        apiObjectToDb.setGainFromLastValue(GetGainFromLastValue());
        apiObjectToDb.setPercentOfGainFromLastValue(GetPercentOfGainFromLastValue());

        list.add(apiObjectToDb);
    }

    private Double GetPercentOfGainFromLastValue() {
        DecimalFormat formatter = new DecimalFormat("0.00");
        String valueFromLastIndexStr = apiObjectFromDb.getValue();
        Double valueFromLastIndex = Double.parseDouble(valueFromLastIndexStr);
        Double percentage = (coin.getValue() * 100)/valueFromLastIndex;
        String percentageStr = formatter.format(percentage);
        percentageStr = percentageStr.replaceAll(",",".");
        percentage = Double.parseDouble(percentageStr);
        return percentage;
    }

    private Double GetGainFromLastValue() {
        DecimalFormat formatter = new DecimalFormat("0.00");
        String numbersOfCoinsFromDbStr = apiObjectFromDb.getOwned();
        Double numbersOfCoinsFromDb = Double.parseDouble(numbersOfCoinsFromDbStr);

        Double totalOfCoins = numbersOfCoinsFromDb + coin.getQuantity();
        Double currentValue = totalOfCoins * coin.getCryptoPrice();

        String valueFromLastIndexStr = apiObjectFromDb.getValue();
        Double valueFromLastIndex = Double.parseDouble(valueFromLastIndexStr);

        Double gain = currentValue - valueFromLastIndex;
        String gainStr = formatter.format(gain);
        gainStr = gainStr.replaceAll(",",".");
        gain = Double.parseDouble(gainStr);

        return gain;
    }

    private Double GetTotalOfCoinsOwned() {
        String quantityFromDbStr = apiObjectFromDb.getOwned();
        Double quantityFromDb = Double.parseDouble(quantityFromDbStr);
        Double numberOfCoins = coin.getQuantity() + quantityFromDb;
        return numberOfCoins;
    }

    private Double GetTotalValue(Double numberOfCoins) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        Double value = numberOfCoins * coin.getCryptoPrice();
        String valueStr = formatter.format(value);
        valueStr = valueStr.replaceAll(",",".");
        value = Double.parseDouble(valueStr);
        return value;
    }

    private void SetObjWithLastIndexOfList(List<ApiObjectFromDb> listFromDatabase) {
        apiObjectFromDb  = new ApiObjectFromDb();
        apiObjectFromDb.setId(listFromDatabase.get(listFromDatabase.size() -1).getId());
        apiObjectFromDb.setDate(listFromDatabase.get(listFromDatabase.size() -1).getDate());
        apiObjectFromDb.setOwned(listFromDatabase.get(listFromDatabase.size() -1).getOwned());
        apiObjectFromDb.setValue(listFromDatabase.get(listFromDatabase.size() -1).getValue());
        apiObjectFromDb.setPrice(listFromDatabase.get(listFromDatabase.size() -1).getPrice());
        apiObjectFromDb.setVariation(listFromDatabase.get(listFromDatabase.size() -1).getVariation());
        apiObjectFromDb.setGain(listFromDatabase.get(listFromDatabase.size() -1).getGain());
    }

    private void SetObjectFromIntent() {
        coin =  new Coin();
        Intent intent = getIntent();
        extras = intent.getExtras();
        String cryptoPriceStr = extras.getString("cryptoPrice");
        String usdPriceStr = extras.getString("UsdPrice");
        String exchange = extras.getString("exchange");
        String quantityStr = extras.getString("quantity");
        String valueStr = extras.getString("value");
        String symbol = extras.getString("symbol");
        String coinName = extras.getString("coinName");

        Double cryptoPrice = Double.parseDouble(cryptoPriceStr);
        Double usdPrice = Double.parseDouble(usdPriceStr);
        Double quantity = Double.parseDouble(quantityStr);
        Double value = Double.parseDouble(valueStr);

        coin.setCryptoPrice(cryptoPrice);
        coin.setUsdPrice(usdPrice);
        coin.setExchange(exchange);
        coin.setQuantity(quantity);
        coin.setValue(value);
        coin.setSymbol(symbol);
        coin.setCoinName(coinName);

    }

    private boolean GetIntentStatus() {
        Intent intent = getIntent();
        extras = intent.getExtras();

        if (extras != null) {
            return true;
        }
        return false;
    }

    private void Refresh() {
        Intent i = new Intent(SecondActivity.this, MainActivity.class);
        finish();
        startActivity(i);
    }

    private String GetCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        String date = day + "/" + month + "/" + year;
        return date;
    }

    private void SetView() {
        imageButton_back = findViewById(R.id.ib_view_back);
        imageButton_clear_list = findViewById(R.id.ib_clear_list);
        listView = findViewById(R.id.lista_bd);
    }
}

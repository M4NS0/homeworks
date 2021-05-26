package com.bighiccups.dogewallet;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bighiccups.dogewallet.model.Details;
import com.bighiccups.dogewallet.services.DetailsDatabase;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SegundaAtividade extends AppCompatActivity {
    ListView lista_bd;
    MeuAdaptadorBd meuAdaptador;

    List<Details> detailsList;
    ImageButton imageButton_back;
    DetailsDatabase bd_details = new DetailsDatabase(this);
    Bundle extras;
    private List<Details> details;
    private Details detailsObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.segunda_tela_portrait);

        } else {
//            setContentView(R.layout.segunda_tela_landscape);
        }
        lista_bd = findViewById(R.id.lista_bd);
        imageButton_back = findViewById(R.id.ib_view_back);

        detailsList = new ArrayList<>();


        GetIntent();
        PopulateList();
        CallAdapter();

        imageButton_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PrimeiraAtividade.class);
                startActivity(i);
                finish();
            }
        });
    }

    private String GetCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        String date = day + "/" + month + "/" + year;
        return date;

    }

    private List<Details> PopulateList() {
        return this.detailsList = bd_details.listTransactions();
    }


    private void GetIntent() {
        Intent intent = getIntent();
        extras = intent.getExtras();
        if (extras != null) {
            PopulateObjects(extras);
            AddNewTransaction(detailsObj);

        }
    }

    private void PopulateObjects(Bundle extras) {
        Double ownedInLastTransaction = 0.0;
        detailsObj = new Details();
        if (!GetLastIndexNumberOfCryptos().equals("") || GetLastIndexNumberOfCryptos() != null) {
            ownedInLastTransaction = Double.parseDouble(GetLastIndexNumberOfCryptos());
        }

        Double currentlyOwned = Double.parseDouble(extras.getString("owned"));
        Double sum = ownedInLastTransaction + currentlyOwned;

        detailsObj.setValue(extras.getString("value"));
        detailsObj.setPrice(extras.getString("price"));
        detailsObj.setOwned(sum.toString());
        detailsObj.setDate(GetCurrentDate());
        detailsObj.setVariation(GetVariation());
        detailsObj.setValue(SetValue());
        detailsObj.setGain(GetGain());

        detailsList.add(detailsObj);
    }

    private String GetLastIndexNumberOfCryptos() {
        details = bd_details.listTransactions();
        String ownedInLastTransaction = "";
        if (details.size() > 0) {
            ownedInLastTransaction = details.get(details.size() -1).getOwned();
            return ownedInLastTransaction;
        } else return "0.0";

    }

    private String SetValue() {
        String getLastIndexNumberOfCryptosStr = "0";
        if (!GetLastIndexNumberOfCryptos().equals("")) {
            getLastIndexNumberOfCryptosStr = GetLastIndexNumberOfCryptos();
        }
        Double ownedInLastTransaction = Double.parseDouble(getLastIndexNumberOfCryptosStr);
        Double currentAddedCryptos = Double.parseDouble(detailsObj.getOwned());
        Double sumOfOwned = ownedInLastTransaction + currentAddedCryptos;
        Double currentlyPrice = Double.parseDouble(detailsObj.getPrice());
        Double sum = DecimalFormatter(currentlyPrice * sumOfOwned);

        return sum.toString();
    }

    private String GetVariation() {
        String variation = "0.0";
        details = bd_details.listTransactions();
        if (details.size() != 0) {
            String previouslyValueStr = details.get(details.size() -1).getValue();
            Double previouslyValue = Double.parseDouble(previouslyValueStr);
            Double currentValue = Double.parseDouble(detailsObj.getValue());
            Double calc = (currentValue * 100)/previouslyValue;
            variation = calc.toString();
            return variation;
        }
        return variation;
    }
    private int ShortFormatter (Double number) {
        if (number > 0) {
            DecimalFormat formatter = new DecimalFormat("0");
            return Integer.parseInt(formatter.format(number));
        }
        return 0;
    }

    private String GetGain() {
        String gainStr = "";
        Double previouslyValue = 0.0;
        details = bd_details.listTransactions();
        if (details.size() != 0) {
            previouslyValue = Double.parseDouble(details.get(details.size() - 1).getValue());
        }
        Double owned = Double.parseDouble(detailsObj.getOwned());
        Double price = Double.parseDouble(detailsObj.getPrice());
        Double currentValue = owned * price;
        Double gain = DecimalFormatter(currentValue - previouslyValue);
        gainStr = gain.toString();

        return gainStr;
    }

    private double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return Double.parseDouble(formatter.format(number));
    }

    private void AddNewTransaction(Details detailsObj) {
        bd_details.addCoin(new Details(
                1, detailsObj.getDate(),
                detailsObj.getPrice().toString(),
                detailsObj.getOwned().toString(),
                detailsObj.getValue().toString(),
                detailsObj.getGain().toString(),
                detailsObj.getVariation().toString()));
    }

    private void CallAdapter() {
        meuAdaptador = new MeuAdaptadorBd(SegundaAtividade.this, R.layout.layout_lista_bd, detailsList);
        lista_bd.setAdapter(meuAdaptador);
    }

}


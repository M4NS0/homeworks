package com.bighiccups.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

//        ArrayList <String> nomes = new ArrayList<>();
//        nomes.add("Goku");
//        nomes.add("Vegeta");
//        nomes.add("Trunks");
//        nomes.add("Kuririn");
//        nomes.add("Yamcha");
//
//        // Usando um Adapter padrão do android
//        ArrayAdapter adapter =
//                new ArrayAdapter(this, R.layout.layoutlista1, nomes);
//
//        lsitView.setAdapter(adapter);


        ArrayList<Heroes> nomes = new ArrayList<>();
        nomes.add(new Heroes("Goku", "GOD", "80"));
        nomes.add(new Heroes("Vegeta", "GOD", "85"));
        nomes.add(new Heroes("Trunks", "999999", "70"));
        nomes.add(new Heroes("Kuririn", "100", "30"));
        nomes.add(new Heroes("Yamcha", "1", "1"));

        // Usando um Adpter Customizado que está representado em uma classe
        AdaptadorCustomizado adaptadorCustomizado =
                new AdaptadorCustomizado(this, R.layout.layoutlista2, nomes);

        // setando o adpter para a listView criada
        listView.setAdapter(adaptadorCustomizado);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Clicou no: " + nomes.get(i).getNome(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}

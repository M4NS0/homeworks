package com.bighiccups.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);  // puxa a lista
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Goku");
        nomes.add("Vegeta");
        nomes.add("Trunks");
        nomes.add("Kuririn");
        nomes.add("Yamcha");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.layoutlista1, nomes);

        listView.setAdapter(adapter);
    }
}


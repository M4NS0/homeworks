package com.example.aula_19.service;

import android.os.AsyncTask;

import com.example.aula_19.model.Contato;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpBuscar extends AsyncTask< Void, Void, Contato> {

    private  String id;

    public HttpBuscar(String id) {
        this.id = id;
    }

    @Override
    protected Contato doInBackground(Void... voids) {

        StringBuilder stringBuilder = new StringBuilder();

        try {

            URL url = new URL("http://www.ferdinandiz.com.br/consulta_aula12.php?id=" + this.id);
            HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");
            connection.setConnectTimeout(5000);
            connection.connect();

            Scanner sc = new Scanner(url.openStream());

            while (sc.hasNext()){

                stringBuilder.append(sc.next());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return new Gson().fromJson(stringBuilder.toString(),Contato.class);
    }
}

package com.example.aula_19;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.core.app.ActivityCompat;

import com.example.aula_19.model.Contato;
import com.example.aula_19.model.MeuAdapter;

import org.json.JSONArray;
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
import java.util.Scanner;

public class TelaListar extends AppCompatActivity {

    ListView lista;
    ImageButton btnBuscarL,btnInserirL,btnDeletarL,btnListaL;
    List<Contato> listaContatos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_lista);


        btnBuscarL = findViewById(R.id.btnBuscarLayout);
        btnInserirL = findViewById(R.id.btnInserirLayout);
        btnDeletarL = findViewById(R.id.btnDeletarLayout);
        btnListaL = findViewById(R.id.btnListarLayout);

        lista = findViewById(R.id.lista);


        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaListar.this,TelaBuscar.class);
                startActivity(intent);
                finish();
            }
        });

        btnInserirL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaListar.this,TelaInserir.class);
                startActivity(intent);
                finish();
            }
        });

        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaListar.this,TelaDeletar.class);
                startActivity(intent);
                finish();
            }
        });

        btnListaL.setEnabled(false);

        HttpListar listarJson = new HttpListar();
        listarJson.execute();


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(TelaListar.this,TelaUpdate.class);
                intent.putExtra("id", listaContatos.get(position).getId());
                intent.putExtra("nome", listaContatos.get(position).getNome());
                intent.putExtra("telefone", listaContatos.get(position).getTelefone() );
                startActivity(intent);
                finish();
                
            }
        });
    }

        public  class  HttpListar extends AsyncTask<String, String, List<Contato>>{

            @Override
            protected List<Contato> doInBackground(String... strings) {

                 listaContatos = new ArrayList<>();
                HttpURLConnection urlConnection = null;
                BufferedReader bufferedReader = null;

                try {

                    URL url  = new URL("http://www.ferdinandiz.com.br/consultarTodos_aula12.php");
                    urlConnection = (HttpURLConnection) url.openConnection();
                    urlConnection.setConnectTimeout(5000);
                    urlConnection.connect();

                    InputStream inputStream = urlConnection.getInputStream();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                    StringBuffer stringBuffer = new StringBuffer();
                    String linha = "";

                    while ((linha = bufferedReader.readLine()) != null){
                        stringBuffer.append(linha);
                    }

                    String contatosJson = stringBuffer.toString();
                    JSONObject contatosObject = new JSONObject(contatosJson);
                    JSONArray contatoArray = contatosObject.getJSONArray("aula12");

                    for (int i = 0; i < contatoArray.length() ; i++){
                        JSONObject contatoObj = contatoArray.getJSONObject(i);

                        Contato contato = new Contato();
                        contato.setId(contatoObj.getString("id"));
                        contato.setNome(contatoObj.getString("nome"));
                        contato.setTelefone(contatoObj.getString("telefone"));

                        listaContatos.add(contato);
                    }
                    return listaContatos;

                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }finally {
                   try {
                       bufferedReader.close();
                       urlConnection.disconnect();

                   }catch (IOException e){
                       e.printStackTrace();
                       }
                }
                return null;
            }

            @Override
            protected void onPostExecute(List<Contato> contatos) {
                super.onPostExecute(contatos);
                MeuAdapter adapter = new MeuAdapter(getApplicationContext(),R.layout.layout_lista, contatos);
                lista.setAdapter(adapter);
            }
        }
    }

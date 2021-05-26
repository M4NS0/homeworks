package com.bighiccups.aula13;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;

import com.bighiccups.aula13.model.Contato;
import com.bighiccups.aula13.model.MeuAdaptador;
import com.bighiccups.aula13.service.HttpBuscar;

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
import java.util.concurrent.ExecutionException;

public class TelaListar extends AppCompatActivity {
    ImageButton btnBuscarL, btnInserirL, btnDeletarL, btnListarL;
    ListView lista;

    ArrayList<Contato> listaContatos;
    MeuAdaptador meuAdaptador;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_listar);

        btnBuscarL = findViewById(R.id.imageBuscar);
        btnInserirL = findViewById(R.id.imageEnviar);
        btnDeletarL = findViewById(R.id.imageDeletar);
        btnListarL = findViewById(R.id.imageListar);

        lista = findViewById(R.id.lista);

        btnBuscarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TelaBuscar.class);
                startActivity(i);
                finish();
            }
        });
        btnInserirL.setEnabled(false);

        btnDeletarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TelaDeletar.class);
                startActivity(i);
                finish();
            }
        });
        btnListarL.setEnabled(false);

        HttpListar listarJson = new HttpListar();
        listarJson.execute();

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                HttpBuscar service = new HttpBuscar(String.valueOf(position));
                try {

                    Contato contato = service.execute().get();
                    Intent intent = new Intent(TelaListar.this, TelaInserir.class);
                    intent.putExtra("id", listaContatos.get(position).getId());
                    intent.putExtra("nome", listaContatos.get(position).getNome());
                    intent.putExtra("Telefone", listaContatos.get(position).getTelefone());
                    startActivity(intent);

                } catch (ExecutionException | InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

    }
    public class HttpListar extends AsyncTask<String, String, List<Contato>> {

        @Override
        protected List<Contato> doInBackground(String... strings) {
            listaContatos = new ArrayList<>();
            HttpURLConnection connection = null;
            BufferedReader buffer = null;

            try {
                URL url = new URL("http://www.ferdinandiz.com.br/consultarTodos_aula12.php");
                connection = (HttpURLConnection)url.openConnection();
                connection.setConnectTimeout(5000);
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                buffer = new BufferedReader(new InputStreamReader(inputStream));
                StringBuffer stringBuffer = new StringBuffer();
                String linha = "";
                while ((linha = buffer.readLine())!= null) {
                    stringBuffer.append(linha);
                }
                String contatosJson = stringBuffer.toString();
                JSONObject contatosObject  = new JSONObject(contatosJson);
                JSONArray contatoArray = contatosObject.getJSONArray("aula12");

                for (int i = 0; i < contatoArray.length(); i++) {
                    JSONObject contatoObject = contatoArray.getJSONObject(i);
                    Contato contato = new Contato();
                    contato.setId(contatoObject.getString("id"));
                    contato.setNome(contatoObject.getString("nome"));
                    contato.setTelefone(contatoObject.getString("telefone"));
                    listaContatos.add(contato);
                }
                return listaContatos;

            } catch (IOException | JSONException e){
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
        protected void onPostExecute(List<Contato> contatos) {
            super.onPostExecute(contatos);
            MeuAdaptador adaptador = new MeuAdaptador(getApplicationContext(), R.layout.layout_lista, contatos);
            lista.setAdapter(adaptador);

        }
    }
}

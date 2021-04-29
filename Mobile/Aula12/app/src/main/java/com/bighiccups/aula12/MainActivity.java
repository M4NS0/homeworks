package com.bighiccups.aula12;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;

public class MainActivity extends AppCompatActivity {
    //Objetos principais
    TextView textoSup, textoInf;
    EditText edTextoSup, edTextoInf;
    Button btnInserir, btnSalvar, btnAbrir, btnCamera, btnEnviar;
    SeekBar seekBarSup, seekBarInf;
    ImageView img;
    RelativeLayout relativeCentro;

    //Variáveis de controle
    int progressSup = 40, progressInf = 40;
    Boolean colorText = false;
    String arqImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // junção XML
        textoInf = findViewById(R.id.texto_inf);
        textoSup = findViewById(R.id.texto_sup);
        edTextoInf = findViewById(R.id.edtexto_inf);
        edTextoSup = findViewById(R.id.edtexto_sup);
        btnAbrir = findViewById(R.id.btn_abrir);
        btnCamera = findViewById(R.id.btn_camera);
        btnEnviar = findViewById(R.id.btn_enviar);
        btnInserir = findViewById(R.id.btn_inserir);
        btnSalvar = findViewById(R.id.btn_salvar);
        seekBarSup = findViewById(R.id.seekBar_sup);
        seekBarInf = findViewById(R.id.seekBar_inf);
        img = findViewById(R.id.imagem);
        relativeCentro = findViewById(R.id.relative_1);

        //desabilitando botões para evitar possíveis erros
        btnSalvar.setEnabled(false);
        btnEnviar.setEnabled(false);

        //configurando o seekBar
        seekBarInf.setMax(100); //valor máximo do seekBar
        seekBarSup.setMax(100);
        seekBarSup.setProgress(progressSup); //valor inicial do seekBar
        seekBarInf.setProgress(progressInf);


        //configurando o funcionamento (listener) do seekbar
        seekBarSup.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressSup = i;
                textoSup.setTextSize(progressSup); //ao mexer o o botão do seek, atualiza valor de tamanho da fonte
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBarInf.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progressInf = i;
                textoInf.setTextSize(progressInf);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textoSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorText) {
                    textoSup.setTextColor(Color.WHITE);
                    textoInf.setTextColor(Color.WHITE);
                } else {
                    textoSup.setTextColor(Color.BLACK);
                    textoInf.setTextColor(Color.BLACK);
                }

                colorText = !colorText;
            }
        });

        //configuração da cor do texto por um listener
        textoInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorText) {
                    textoSup.setTextColor(Color.WHITE);
                    textoInf.setTextColor(Color.WHITE);
                } else {
                    textoSup.setTextColor(Color.BLACK);
                    textoInf.setTextColor(Color.BLACK);
                }

                colorText = !colorText;
            }
        });

        //ao clicar no botão inserir, o texto dos EditText vão para os TextView
        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edTextoInf.getText().toString().isEmpty() && !edTextoSup.getText().toString().isEmpty()) {
                    textoSup.setText(edTextoSup.getText().toString());
                    textoInf.setText(edTextoInf.getText().toString());
                } else
                    Toast.makeText(getApplicationContext(), "Texto Vazio!!", Toast.LENGTH_SHORT).show();

            }
        });

        //botão abrir: Intent para escolha do arquivo no celular
        //ativa resposta na volta da atividade pelo ActivityForResult com o código 2
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, 2);
            }
        });
        //botão enviar: compartilha imagem SALVA para algum outro aplicativo
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });
        //Tira print da tela e salva como imagem png
        //Ao salvar gera nome pelo horário do sistema
        //ativa o botão de enviar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = screenShot(relativeCentro);
                arqImagem = "APP11_" + System.currentTimeMillis() + ".png";
                armazenarFoto(bitmap, arqImagem);
                btnEnviar.setEnabled(true);
            }
        });

        //caso não exista câmera no celular, desabilita botão de tirar foto
        if (!temCamera()) {
            btnCamera.setEnabled(false);
        }
        //botão câmera: Intent para atividade de tirar foto utilizando a câmera
        //ativa resposta na volta da atividade pelo ActivityForResult com o código 1
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 1);
            }
        });
        //verifica se existe permissão de uso do armazenamento externo
        //neste caso, estamos forçando a permissão
        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                //Temos a permissão
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        1);
            } else {
                //Não temos
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        1);
            }
        }

    }

    //verificação da existência de câmera através das Features do celular
    //para este caso, qualquer uma serve
    public boolean temCamera() {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    //método para screenshot de uma área específica do celular
    public Bitmap screenShot(View v) {
        v.setDrawingCacheEnabled(true); //abre cache para captura da view
        Bitmap bitmap = Bitmap.createBitmap(v.getDrawingCache()); // gera imagem a partir da view
        v.setDrawingCacheEnabled(false);//fecha a cache
        return bitmap;
    }

    //armazenamento de fotos utilizando arquivos
    public void armazenarFoto(Bitmap bitmap, String arqImagem) {
        //pega diretório raiz do celular e mais a pasta APP11
        String diretorio = Environment.getExternalStorageDirectory().getAbsolutePath() + "/APP11";
        File dir = new File(diretorio);
        if (!dir.exists()) dir.mkdir(); //cria diretório APP11 caso ele não exista
        File file = new File(diretorio, arqImagem); //cria o arquivo passado por parâmetro na pasta APP11
        try {
            FileOutputStream fos = new FileOutputStream(file); //abre arquivo par escrita
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos); //salva a imagem do parâmetro em formato png através do arquivo
            fos.flush(); // utilização do flush para ter certeza de que todos os dados do buffer estão gravados.
            fos.close(); //fecha arquivo
            Toast.makeText(this, "Salvo com Sucesso!!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Erro na hora de Salvar!!", Toast.LENGTH_SHORT).show();
        }
    }

    //enviando arquivo salvo pela variável arqImagem
    public void enviar() {
        String diretorio = Environment.getExternalStorageDirectory().getAbsolutePath() + "/APP11/" + arqImagem; //pega o diretório do arquivo
        File f = new File(diretorio); //abre o arquivo
        ContentValues contentValues = new ContentValues(2); //inicia o content values para tipo e local do arquivo
        contentValues.put(MediaStore.Images.Media.MIME_TYPE, "image/png"); // tipo de arquivo: png
        contentValues.put(MediaStore.Images.Media.DATA, f.getAbsolutePath()); // diretório do arquivo
        Uri uri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues); //abre link interno para envio de arquivo
        Intent i = new Intent(Intent.ACTION_SEND); //inicia intent para envio de arquivo
        i.setType("image/png"); //informa a intent o tipo de arquivo
        i.putExtra(Intent.EXTRA_STREAM, uri);// adciona o arquivo a intent
        startActivity(Intent.createChooser(i, "Compartilhar com... ")); //inicia outro aplicativo com o arquivo anexado
    }

    //resposta de retorno de uma atividade externa a aplicação corrente
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == RESULT_OK && data != null) { //caso código 2 e tudo ok, imagem deve ser colocada no campo view de imagem (img)
            Uri pegarImagem = data.getData(); //inicia link interno pelos dados recebidos da intent
            String[] diretorio = {MediaStore.Images.Media.DATA}; //abre diretório
            Cursor cursor = getContentResolver().query(pegarImagem, diretorio, null, null, null); //inicia cursor com as repostas obtidas da intent (pode ser mais de uma, mas será utilizada apenas a primeira)
            cursor.moveToFirst(); //move o cursor para primeira resposta
            int index = cursor.getColumnIndex(diretorio[0]); // inicia um índice para o diretório do local do arquivo
            String imagemDir = cursor.getString(index); //cursor posiciona de acordo com o index, capturando a imagem
            cursor.close();//fecha cursor
            img.setImageBitmap(BitmapFactory.decodeFile(imagemDir)); //converte arquivo de imagem para bitmap da view e mostra a imagem na view img
            btnSalvar.setEnabled(true); //ativa botão salvar
            btnEnviar.setEnabled(false); //desativa botão enviar
        } else if (requestCode == 1 && resultCode == RESULT_OK) { //caso código 1 e tudio ok, imagem da câmera obtida
            Bundle bundle = data.getExtras(); //abre um bundle para qualquer tipo de arquivo
            Bitmap foto = (Bitmap) bundle.get("data"); // converte foto para Bitmap através da bundle
            img.setImageBitmap(foto); //seta a imagem para a view e mostra a foto na view img
            btnSalvar.setEnabled(true); //ativa botão salvar
            btnEnviar.setEnabled(false);//desativa botão enviar
        }
    }

    //solicita permissão de uso de armazenamento externo
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length < 0 && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Sem Permissão de uso!!", Toast.LENGTH_SHORT).show();
                    finish();
                } else if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {

                }
                return;
            }
        }
    }
}

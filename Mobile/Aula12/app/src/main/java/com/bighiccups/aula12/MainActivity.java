package com.bighiccups.aula12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView texto_sup, text_inferior;
    EditText ed_texto_superior, ed_texto_inferior;
    Button btn_inserir, btn_salvar, btn_abrir, btn_camera, btn_enviar;
    SeekBar seekBar_superior, seekBar_inferior;
    int progress_bar_superior = 40;
    int progress_bar_inferior = 40;
    ImageView img;
    Boolean color_text = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
package com.bighiccups.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn01,btn02,btn03,btn04,btnAvancar,btnPlay;
    String [] cores = new String [4];
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 = findViewById(R.id.btn_01);
        btn02 =findViewById(R.id.btn_02);
        btn03 = findViewById(R.id.btn_03);
        btn04 = findViewById(R.id.btn_04);
        btnAvancar = findViewById(R.id.btn_avançar);
        btnPlay = findViewById(R.id.btn_play);

        r = new Random();
        int aux = r.nextInt(3) + 2;

        String [] randomColor = {"azul","vermelho","verde"};
        for(int i = 0; i < 4; i ++) {

            if (aux == 1) {
                cores[i] = randomColor[0];
            }
            else if (aux == 2) {
                cores[i] = randomColor[1];
            } else {
                cores[i] = randomColor[2];
            }
        }
        setCor(btn01, cores[0]);
        setCor(btn02, cores[1]);
        setCor(btn03, cores[2]);
        setCor(btn04,cores[3]);
    }
    public void setCor(Button btn, String cor) {
        if (cor == "azul") {
            btn.setBackgroundColor(Color.BLUE);
        } else if (cor == "vermelho") {
            btn.setBackgroundColor(Color.RED);
        } else if (cor == "verde") {
            btn.setBackgroundColor(Color.GREEN);
        }
    }

    public String switchColor(String color) {
        if (cores.equals("azul")) color = "vermelho";
        else if (cores.equals("vermelho")) color = "verde";
        else if (cores.equals("verde")) color = "azul";
        return color;
    }
}
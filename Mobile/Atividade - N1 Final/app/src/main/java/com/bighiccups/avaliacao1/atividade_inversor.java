package com.bighiccups.avaliacao1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class atividade_inversor extends AppCompatActivity {
    EditText txt_input;
    Button btn_inverter;
    TextView txt_resposta, txt_palindrome;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_inversor);
        txt_input = findViewById(R.id.txt_input);
        btn_inverter = findViewById(R.id.btn_inverter);
        txt_resposta = findViewById(R.id.txt_resposta);
        txt_palindrome = findViewById(R.id.txt_palindrome);


        btn_inverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_input.getText().toString().isEmpty()) {
                    txt_resposta.setText("Insira um texto na linha indicada");
                } else {
                    String input = txt_input.getText().toString().toUpperCase();

                    StringBuilder aux = new StringBuilder();
                    aux.append(input);
                    aux.reverse();

                    txt_resposta.setText(aux.toString());

                    if (isPalindrome(aux.toString()) == true) {
                        txt_palindrome.setText("É um Palindrome!");
                    } else {
                        txt_palindrome.setText("");
                    }
                }
                txt_input.setText("");
            }

            private boolean isPalindrome(String aux) {
                int i = 0, j = aux.length() - 1;
                while (i < j) {
                    if (aux.charAt(i) != aux.charAt(j))
                        return false;
                    i++;
                    j--;
                }
                return true;
            }
        });
    }
}


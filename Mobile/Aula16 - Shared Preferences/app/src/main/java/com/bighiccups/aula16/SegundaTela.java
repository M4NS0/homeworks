package com.bighiccups.aula16;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaTela extends AppCompatActivity {
    TextView txtPrincipal, txtSumiu;
    float x, y;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);

        txtPrincipal = findViewById(R.id.txtTouch);
        txtSumiu = findViewById(R.id.txtSumir);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX()-50;
        y = event.getY()-100;

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            txtSumiu.setVisibility(View.INVISIBLE);
            txtPrincipal.setBackgroundColor(Color.RED);

            txtPrincipal.setTranslationX(x);
            txtPrincipal.setTranslationY(y);

            txtPrincipal.setWidth(10);
            txtPrincipal.setHeight(10);

            // txtPrincipal.setWidth((int)x);
            // txtPrincipal.setHeight((int)y);
        }
        if(event.getAction() == MotionEvent.ACTION_MOVE) {
            txtPrincipal.setBackgroundColor(Color.MAGENTA);
            txtPrincipal.setWidth((int)x);
            txtPrincipal.setHeight((int)y);
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            txtPrincipal.setBackgroundColor(Color.BLUE);
            txtPrincipal.setWidth((int)x);
            txtPrincipal.setHeight((int)y);
        }
        return super.onTouchEvent(event);
    }
}

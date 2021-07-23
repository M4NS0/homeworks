package com.bighiccups.aula11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView arrow, curtain_left,curtain_right;
    Random r;
    int anguloInicial = 0, anguloFinal = 270;

    boolean a = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrow = findViewById(R.id.flecha);
        curtain_left = findViewById(R.id.left_curtain);
        curtain_right = findViewById(R.id.right_curtain);

        arrow.animate().alpha(1).setDuration(1200).setStartDelay(200);

        curtain_left.animate().translationX(-621*3).setDuration(4000);
        curtain_right.animate().translationX(621*3).setDuration(4000);

        r = new Random();
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                anguloFinal = anguloInicial % 360;
//                anguloInicial = r.nextInt(3600)+360;
//                RotateAnimation imagem = new RotateAnimation(
//                        anguloFinal,
//                        anguloInicial,
//                        RotateAnimation.RELATIVE_TO_SELF,0.5f,
//                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
//                imagem.setFillAfter(true);
//                imagem.setDuration(3600);
//                imagem.setInterpolator(new AccelerateDecelerateInterpolator());
//                imagem.setAnimationListener(new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        anguloInicial = anguloInicial%360;
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animation animation) {
//
//                    }
//                });
//                arrow.startAnimation(imagem);

                if (a) arrow.animate().rotation(3600).setDuration(3600);
                else arrow.animate().rotation(0).setDuration(3600);
                a = !a;
            }
        });

    }
}
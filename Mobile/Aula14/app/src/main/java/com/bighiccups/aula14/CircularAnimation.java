package com.bighiccups.aula14;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
class CircularAnimation extends Animation {
    private View view; // view da animação
    private float cx, cy; // posição central do circulo
    private float preX, preY; // posição anterior da animação
    private float r; //raio do circulo
    private float ControleX, ControleY; //variáveis de controle
    public CircularAnimation(View view, float r) {
        this.view = view;
        this.r = r;
    }
    @Override
    public boolean willChangeBounds() {
        return true;
    }
    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        int cxImagem = width/2;
        int cyImagem = height/2;
        cx = view.getLeft() + cxImagem;
        cy = view.getTop() + cyImagem;
        preX = cx;
        preY = cy;
    }
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        if(interpolatedTime == 0){
            t.getMatrix().setTranslate(ControleX, ControleY);
            return;
        }
        float graus = (interpolatedTime * 360f + 90) % 360;
        float radianos = (float)Math.toRadians(graus);
        float x = (float) (cx + r*Math.cos(radianos));
        float y = (float) (cy + r*Math.sin(radianos));
        ControleX = preX - x;
        ControleY = preY - y;
        preY = y;
        preX = x;
        t.getMatrix().setTranslate(ControleX, ControleY);
    }
}
package com.bighiccups.aula08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private PrimeiroFragment adaptador;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atividade_principal);
        adaptador = new PrimeiroFragment(getSupportFragmentManager(),1);
        viewPager = findViewById(R.id.atividade);
        setupViewPager(viewPager);

    }
    protected void setupViewPager (ViewPager v) {
        PrimeiroFragment adaptador = new PrimeiroFragment(getSupportFragmentManager(), 1);
        adaptador.AddFragment(new Fragment1(),"fragment_1");
        adaptador.AddFragment(new Fragment2(),"fragment_2");
        v.setAdapter((adaptador));
    }
    public void setViewPager(int num) {
        viewPager.setCurrentItem(num);
    }
}
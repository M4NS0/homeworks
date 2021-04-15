package com.bighiccups.aula08;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroFragment extends FragmentStatePagerAdapter {
    private final List<String> nomes = new ArrayList<>();
    private final List<Fragment> lista = new ArrayList<>();

    public PrimeiroFragment(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void AddFragment(Fragment f, String n){
        lista.add(f);
        nomes.add(n);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lista.get(position);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

}


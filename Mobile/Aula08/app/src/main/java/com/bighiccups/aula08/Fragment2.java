package com.bighiccups.aula08;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    Button btn_tela2, btn_fragmento_1, btn_fragmento_2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container,false);
        btn_tela2 = view.findViewById(R.id.btn_tela2);
        btn_fragmento_1 = view.findViewById(R.id.btn_fragment_1);
        btn_fragmento_2 = view.findViewById(R.id.btn_fragment_2);

        btn_tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), SegundaTela.class);
                startActivity(i);
//                finish();
            }
        });
        btn_fragmento_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(0);

            }
        });
        btn_fragmento_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        return view;
    }
}

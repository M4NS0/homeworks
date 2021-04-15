package com.bighiccups.aula08;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    Button btn_tela2, btn_fragmento_1, btn_fragmento_2;
    MediaPlayer som1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container,false);
        btn_tela2 = view.findViewById(R.id.btn_tela2);
        btn_fragmento_1 = view.findViewById(R.id.btn_fragment_1);
        btn_fragmento_2 = view.findViewById(R.id.btn_fragment_2);
        som1 = MediaPlayer.create(getActivity(), R.raw.blop);

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
                som1.start();
            }
        });

        btn_fragmento_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(1);
                som1.start();
            }
        });
        return view;
    }
}

package com.bighiccups.aula10;

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


public class Fragment2 extends Fragment {
    Button  btnFrag1, btnFrag2;
    MediaPlayer som1, som2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        btnFrag1 = view.findViewById(R.id.btnFrag1);
        btnFrag2 = view.findViewById(R.id.btnFrag2);

//        som1 = MediaPlayer.create(getActivity(), R.raw.som_1);
//        som1 = MediaPlayer.create(getActivity(), R.raw.som_2);


        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(0);
//                som2.start();
            }
        });
        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setViewPager(1);
//                som2.start();
            }
        });


        return view;
    }
}

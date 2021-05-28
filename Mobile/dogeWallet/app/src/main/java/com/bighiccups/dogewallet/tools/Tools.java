package com.bighiccups.dogewallet.tools;

import android.media.AudioManager;
import android.media.SoundPool;

import com.bighiccups.dogewallet.MainActivity;

import java.text.DecimalFormat;

public class Tools {
    public double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return Double.parseDouble(formatter.format(number));
    }

}

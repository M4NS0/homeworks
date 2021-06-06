package com.bighiccups.dogewallet.tools;

import android.media.AudioManager;
import android.media.SoundPool;

import com.bighiccups.dogewallet.MainActivity;

import java.text.DecimalFormat;

public class Tools {

    public Double CalculateTotalValue(Double price, Double numberOfCoins) {
        Double value = price * numberOfCoins;
        Double formattedValue = DecimalFormatter(value);
        return formattedValue;
    }

    public double DecimalFormatter(Double number) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        String formattedNumberString = formatter.format(number);
        Double result = Double.parseDouble(formattedNumberString);
        return result;
    }

}

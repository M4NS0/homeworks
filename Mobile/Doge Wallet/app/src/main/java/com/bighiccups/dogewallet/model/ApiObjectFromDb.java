package com.bighiccups.dogewallet.model;

import java.util.Date;

public class ApiObjectFromDb {
    int id;
    String date, price, owned, value, gain, variation;

    public ApiObjectFromDb(int id, String date, String price, String owned, String value, String gain, String variation) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.owned = owned;
        this.value = value;
        this.gain = gain;
        this.variation = variation;
    }

    public ApiObjectFromDb() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOwned() {
        return owned;
    }

    public void setOwned(String owned) {
        this.owned = owned;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGain() {
        return gain;
    }

    public void setGain(String gain) {
        this.gain = gain;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }
}

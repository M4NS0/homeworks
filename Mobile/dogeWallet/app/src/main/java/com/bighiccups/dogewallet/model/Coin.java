package com.bighiccups.dogewallet.model;


public class Coin {
    Double cryptoPrice;
    Double UsdPrice;
    String exchange;
    Double quantity;
    Double value;

    public Coin() {
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public Double getUsdPrice() {
        return UsdPrice;
    }

    public void setUsdPrice(Double usdPrice) {
        UsdPrice = usdPrice;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
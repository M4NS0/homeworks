package com.m4ns0.dowa.model;

public class Coin {
    Double cryptoPrice;
    Double UsdPrice;
    String exchange;

    public Coin() {
    }

    public Coin(Double cryptoPrice, Double usdPrice, String exchange) {
        this.cryptoPrice = cryptoPrice;
        UsdPrice = usdPrice;
        this.exchange = exchange;
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
}

package com.bighiccups.dogewallet.model;

public class APIValues {
    Double cryptoPrice;
    String exchange;
    Double USDPrice;

    public APIValues() {
    }

    public Double getCryptoPrice() {
        return cryptoPrice;
    }

    public void setCryptoPrice(Double cryptoPrice) {
        this.cryptoPrice = cryptoPrice;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Double getUSDPrice() {
        return USDPrice;
    }

    public void setUSDPrice(Double USDPrice) {
        this.USDPrice = USDPrice;
    }
}

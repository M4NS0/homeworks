package com.bighiccups.dogewallet.model;

public class Crypto {
    String coin, exchange, currency;
    Double price, value, numberOfCoins;

    public Crypto(String coin, String exchange, String currency, Double price, Double value, Double numberOfCoins) {
        this.coin = coin;   // Doge
        this.exchange = exchange; // Binance
        this.currency = currency; // USD
        this.price = price;
        this.value = value;
        this.numberOfCoins = numberOfCoins;
    }

    public Crypto() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(Double numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}

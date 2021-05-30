package com.bighiccups.dogewallet.model;

public class ApiObject {
  String date;
  Double coinPrice;
  Double totalOfCoinsOwned;
  Double totalValue;
  Double gainFromLastValue;
  Double percentOfGainFromLastValue;

    public ApiObject() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getCoinPrice() {
        return coinPrice;
    }

    public void setCoinPrice(Double coinPrice) {
        this.coinPrice = coinPrice;
    }

    public Double getTotalOfCoinsOwned() {
        return totalOfCoinsOwned;
    }

    public void setTotalOfCoinsOwned(Double totalOfCoinsOwned) {
        this.totalOfCoinsOwned = totalOfCoinsOwned;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Double getGainFromLastValue() {
        return gainFromLastValue;
    }

    public void setGainFromLastValue(Double gainFromLastValue) {
        this.gainFromLastValue = gainFromLastValue;
    }

    public Double getPercentOfGainFromLastValue() {
        return percentOfGainFromLastValue;
    }

    public void setPercentOfGainFromLastValue(Double percentOfGainFromLastValue) {
        this.percentOfGainFromLastValue = percentOfGainFromLastValue;
    }
}

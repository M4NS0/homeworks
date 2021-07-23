package com.bighiccups.exercicio3;

public class Itens {
    private String item;
    private int num;

    public Itens(String item, int num) {
        this.item = item;
        this.num = num;
    }

    public Itens(int i, String toString) {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

package com.bighiccups.avaliacao1;

public class Registros {
    private String nome;
    private String data;
    private int contador;

    public Registros(String nome, String data, int contador) {
        this.nome = nome;
        this.data = data;
        this.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}

package com.exerciciojavafx2.models;

public class Telefone {
    String celular, contato, comercial;

    public Telefone() {
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    @Override
    public String toString() {
        return  celular  +
                ";" + contato +
                ";" + comercial ;
    }
}

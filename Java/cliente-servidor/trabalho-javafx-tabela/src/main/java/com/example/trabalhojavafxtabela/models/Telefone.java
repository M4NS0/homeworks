package com.example.trabalhojavafxtabela.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Telefone {
    private StringProperty celular, contato, comercial;

    public Telefone() {
        this.celular = new SimpleStringProperty();
        this.contato = new SimpleStringProperty();
        this.comercial = new SimpleStringProperty();
    }

    public String getCelular() {
        return celular.get();
    }

    public StringProperty celularProperty() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular.set(celular);
    }

    public String getContato() {
        return contato.get();
    }

    public StringProperty contatoProperty() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato.set(contato);
    }

    public String getComercial() {
        return comercial.get();
    }

    public StringProperty comercialProperty() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial.set(comercial);
    }
}

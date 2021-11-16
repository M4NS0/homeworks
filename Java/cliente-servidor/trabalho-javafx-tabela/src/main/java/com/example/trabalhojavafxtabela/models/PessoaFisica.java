package com.example.trabalhojavafxtabela.models;
import javafx.beans.property.*;
import javafx.collections.ObservableList;

import java.util.List;


public class PessoaFisica {
    private IntegerProperty id;
    private StringProperty cpf, nome, cidade, estado, status;
    private List<Telefone> telefones;

    public PessoaFisica() {
        this.id = new SimpleIntegerProperty();
        this.cpf = new SimpleStringProperty();
        this.nome = new SimpleStringProperty();
        this.cidade = new SimpleStringProperty();
        this.estado = new SimpleStringProperty();
        this.status = new SimpleStringProperty();
        this.telefones = new SimpleListProperty<>();
    }


    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getCpf() {
        return cpf.get();
    }

    public StringProperty cpfProperty() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf.set(cpf);
    }

    public String getNome() {
        return nome.get();
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getCidade() {
        return cidade.get();
    }

    public StringProperty cidadeProperty() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade.set(cidade);
    }

    public String getEstado() {
        return estado.get();
    }

    public StringProperty estadoProperty() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado.set(estado);
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}

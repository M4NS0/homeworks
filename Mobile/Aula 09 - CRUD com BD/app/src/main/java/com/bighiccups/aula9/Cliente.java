package com.bighiccups.aula9;

public class Cliente {
    int cod;
    String nome, telefone, email;

    public Cliente(int cod, String nome, String telefone, String email) {
        this.cod = cod;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.bighiccups.exercicio5;

public class Registros {
    private String nome;
    private String cpf;
    private String nasc;
    private String fone;
    private String cel;
    private String email;


    public Registros(String nome, String cpf, String nasc, String fone, String cel, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
        this.fone = fone;
        this.cel = cel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

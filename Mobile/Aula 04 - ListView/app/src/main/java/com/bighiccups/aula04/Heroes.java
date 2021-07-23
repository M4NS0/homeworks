package com.bighiccups.aula04;

public class Heroes {
    private String nome;
    private String poder;
    private String vigor;

    public Heroes(String nome, String poder, String vigor) {
        this.nome = nome;
        this.poder = poder;
        this.vigor = vigor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getVigor() {
        return vigor;
    }

    public void setVigor(String vigor) {
        this.vigor = vigor;
    }
}

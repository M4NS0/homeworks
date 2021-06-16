package com.example.atividadecrud;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private Integer id;
    private String nome, frase, imagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", frase='" + frase + '\'' +
                ", imagem='" + imagem + '\'' ;
    }
}

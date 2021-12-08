package com.exerciciojavafx5.control.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class AlunoBean {
    private IntegerProperty id;
    private SimpleStringProperty nome;
    private SimpleStringProperty dataNascimento;
    private SimpleStringProperty matricula;

    public AlunoBean() {
        this.id = new SimpleIntegerProperty();
        this.nome = new SimpleStringProperty();
        this.dataNascimento = new SimpleStringProperty("dd/MM/yyyy");
        this.matricula = new SimpleStringProperty();
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

    public String getNome() {
        return nome.get();
    }

    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getDataNascimento() {
        return dataNascimento.get();
    }

    public SimpleStringProperty dataNascimentoProperty() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento.set(dataNascimento);
    }

    public String getMatricula() {
        return matricula.get();
    }

    public SimpleStringProperty matriculaProperty() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula.set(matricula);
    }
}

package com.exerciciojavafx4.models;

import javafx.beans.property.*;

public class PessoaJuridica implements Comparable<PessoaJuridica> {
    private IntegerProperty id;
    private StringProperty cnpj, razaoSocial, cidade, estado, pagamento, status;

    public PessoaJuridica() {
        this.id = new SimpleIntegerProperty();
        this.cnpj = new SimpleStringProperty();
        this.razaoSocial = new SimpleStringProperty();
        this.cidade = new SimpleStringProperty();
        this.estado = new SimpleStringProperty();
        this.pagamento = new SimpleStringProperty();
        this.status = new SimpleStringProperty();
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

    public String getCnpj() {
        return cnpj.get();
    }

    public StringProperty cnpjProperty() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj.set(cnpj);
    }

    public String getRazaoSocial() {
        return razaoSocial.get();
    }

    public StringProperty razaoSocialProperty() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial.set(razaoSocial);
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

    public String getPagamento() {
        return pagamento.get();
    }

    public StringProperty pagamentoProperty() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento.set(pagamento);
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

    @Override
    public int compareTo(PessoaJuridica o) {
        return this.getId() - o.getId();
    }
}

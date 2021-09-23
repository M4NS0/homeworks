package models;

import java.time.LocalDate;

public class Permissao implements Comparable<Permissao> {
    int id;
    String codigo;
    LocalDate dataOperacao;
    String operacao;
    Double valor;
    String permitido;

    public Permissao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPermitido() {
        return permitido;
    }

    public void setPermitido(String permitido) {
        this.permitido = permitido;
    }

    @Override
    public int compareTo(Permissao permissao) {
        return this.getDataOperacao().compareTo(permissao.getDataOperacao());
    }
}

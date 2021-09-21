package models;

import java.util.Date;
import java.util.List;

public class Transacao {
    Long id;
    int codigo;
    Date dataTransacao;
    String operacao;
    Double valor;
    List<ResultadoTransacao> resultados;

    public Transacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
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

    public List<ResultadoTransacao> getResultados() {
        return resultados;
    }

    public void setResultados(List<ResultadoTransacao> resultados) {
        this.resultados = resultados;
    }
}

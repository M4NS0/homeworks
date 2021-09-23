package models;

public class DTO {
    int idAgencia;
    int codigoAgencia;
    String nomeAgencia;
    int idConta;
    int numeroConta;
    int dvConta;
    String dataAberturaConta;
    Double limiteConta;
    Double saldoConta;
    int idTransacao;
    int codigoTransacao;
    String dataOperacaoTransacao;
    String operacaoTransacao;
    Double valorTransacao;

    public DTO() {
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public int getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(int codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDvConta() {
        return dvConta;
    }

    public void setDvConta(int dvConta) {
        this.dvConta = dvConta;
    }

    public String getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(String dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public Double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(Double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public int getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(int codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public String getDataOperacaoTransacao() {
        return dataOperacaoTransacao;
    }

    public void setDataOperacaoTransacao(String dataOperacaoTransacao) {
        this.dataOperacaoTransacao = dataOperacaoTransacao;
    }

    public String getOperacaoTransacao() {
        return operacaoTransacao;
    }

    public void setOperacaoTransacao(String operacaoTransacao) {
        this.operacaoTransacao = operacaoTransacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
}

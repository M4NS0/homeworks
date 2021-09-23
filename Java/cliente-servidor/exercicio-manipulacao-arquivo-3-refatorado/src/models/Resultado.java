package models;

import java.time.LocalDate;
import java.util.List;

public class Resultado {
    int id;
    LocalDate dataHoraProcessamento;
    List<Permissao> transacoesPermitidas;
    List<Permissao> transacoesNegadas;

    public Resultado() {
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataHoraProcessamento() {
        return dataHoraProcessamento;
    }

    public void setDataHoraProcessamento(LocalDate dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
    }

    public List<Permissao> getTransacoesPermitidas() {
        return transacoesPermitidas;
    }

    public void setTransacoesPermitidas(List<Permissao> transacoesPermitidas) {
        this.transacoesPermitidas = transacoesPermitidas;
    }

    public List<Permissao> getTransacoesNegadas() {
        return transacoesNegadas;
    }

    public void setTransacoesNegadas(List<Permissao> transacoesNegadas) {
        this.transacoesNegadas = transacoesNegadas;
    }
}
package models;

import java.util.Date;
import java.util.List;

public class ResultadoTransacao {
    Long id;
    String dataHoraProcessamento;
    List<TransacoesPermitidasOuNegadas> transacoesPermitidas;
    List<TransacoesPermitidasOuNegadas> transacoesNegadas;

    public ResultadoTransacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataHoraProcessamento() {
        return dataHoraProcessamento;
    }

    public void setDataHoraProcessamento(String dataHoraProcessamento) {
        this.dataHoraProcessamento = dataHoraProcessamento;
    }

    public List<TransacoesPermitidasOuNegadas> getTransacoesPermitidas() {
        return transacoesPermitidas;
    }

    public void setTransacoesPermitidas(List<TransacoesPermitidasOuNegadas> transacoesPermitidas) {
        this.transacoesPermitidas = transacoesPermitidas;
    }

    public List<TransacoesPermitidasOuNegadas> getTransacoesNegadas() {
        return transacoesNegadas;
    }

    public void setTransacoesNegadas(List<TransacoesPermitidasOuNegadas> transacoesNegadas) {
        this.transacoesNegadas = transacoesNegadas;
    }
}

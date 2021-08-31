package models;

import java.util.List;

public class Patio {
    public int capacidade, totalDeVagas;
    public String localizacao;
    public List<Carro> carros;

    public Patio(int capacidade, int totalDeVagas, String localizacao, List<Carro> carros) {
        this.capacidade = capacidade;
        this.totalDeVagas = totalDeVagas;
        this.localizacao = localizacao;
        this.carros = carros;
    }

    public Patio() {
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalDeVagas() {
        return totalDeVagas;
    }

    public void setTotalDeVagas(int totalDeVagas) {
        this.totalDeVagas = totalDeVagas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}

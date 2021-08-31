package models;

import java.util.List;

public class Patio {
    public int capacidade, vagasLivres;
    public String localizacao;
    public List<Carro> carros;
    public List<Funcionario> funcionarios;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getVagasLivres() {
        return vagasLivres;
    }

    public void setVagasLivres(int vagasLivres) {
        this.vagasLivres = vagasLivres;
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Patio() {
    }


}

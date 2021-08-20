package model;

import interfaces.Funcionario;

public class FComum implements Funcionario {
    public String nome, cargo;
    public float salario, gratificacao, total;

    public FComum() {
    }

    @Override
    public void CalculaGratificacao() {
        this.gratificacao = gratificacao;
    }

    @Override
    public void CalculaSalarioTotal() {
        this.total = salario ;
    }

    @Override
    public void ImprimeGanhos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario + " USD");
        System.out.println("Gratificação: " + this.gratificacao + " USD");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}

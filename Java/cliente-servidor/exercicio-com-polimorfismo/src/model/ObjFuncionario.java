package model;

import interfaces.Funcionario;

public class ObjFuncionario implements Funcionario {
    public String nome;
    public String cargo;
    public float valorGratificacao, salario, gratificacao, total;

    public ObjFuncionario() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getTotal() {
        return total;
    }

    public void setGratificacao(float gratificacao) {
        this.valorGratificacao = gratificacao;
    }

    @Override
    public void CalculaGratificacao() {
        this.gratificacao = this.salario*this.valorGratificacao;
    }

    @Override
    public void CalculaSalarioTotal() {
        this.total = this.salario + this.gratificacao ;
    }

}

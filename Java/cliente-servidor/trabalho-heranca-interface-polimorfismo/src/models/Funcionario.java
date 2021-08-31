package models;

public class Funcionario extends Pessoa {
    Float salario, beneficio;
    String turno;

    public Funcionario(String nome, String identidade, String cpf, String estado, String cidade, String endereço, String cep, Float salario, Float beneficio, String turno) {
        super(nome, identidade, cpf, estado, cidade, endereço, cep);
        this.salario = salario;
        this.beneficio = beneficio;
        this.turno = turno;
    }

    public Funcionario () {

    }
    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Float beneficio) {
        this.beneficio = beneficio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}

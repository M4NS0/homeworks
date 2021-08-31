package models;

public class Vendedor extends Funcionario {
    public Float comissao;
    public int vendasAcumuladas;

    public Vendedor(String nome, String identidade, String cpf, String estado, String cidade, String endereço, String cep, Float salario, Float beneficio, String turno, Float comissao, int vendasAcumuladas) {
        super(nome, identidade, cpf, estado, cidade, endereço, cep, salario, beneficio, turno);
        this.comissao = comissao;
        this.vendasAcumuladas = vendasAcumuladas;
    }

    public Vendedor () {

    }

    public Float getComissao() {
        return comissao;
    }

    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    public int getVendasAcumuladas() {
        return vendasAcumuladas;
    }

    public void setVendasAcumuladas(int vendasAcumuladas) {
        this.vendasAcumuladas = vendasAcumuladas;
    }
}

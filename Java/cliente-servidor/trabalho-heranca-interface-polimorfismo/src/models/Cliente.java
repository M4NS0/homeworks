package models;

import interfaces.Aluguel;

public class Cliente extends Pessoa implements Aluguel {
    public String formaPagamento;
    public Float valorDiarias;
    public Float valorTotal;
    public int dias;
    public Carro carro;
    public Patio patio;
    public Vendedor vendedor;
    public Motorista motorista;

    public Cliente() {
    }

    public void setValorDiarias(Float valorDiarias) {
        this.valorDiarias = valorDiarias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public void alugarCarro() {
        valorTotal = dias * valorDiarias;
    }


}

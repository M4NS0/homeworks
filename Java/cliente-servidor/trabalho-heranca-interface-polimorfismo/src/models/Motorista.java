package models;

public class Motorista extends Funcionario {
    public String tipoCnh;
    public Float valorHoraExtra;

    public Motorista() {
    }

    public String getTipoCnh() {
        return tipoCnh;
    }

    public void setTipoCnh(String tipoCnh) {
        this.tipoCnh = tipoCnh;
    }

    public Float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Float valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }
}

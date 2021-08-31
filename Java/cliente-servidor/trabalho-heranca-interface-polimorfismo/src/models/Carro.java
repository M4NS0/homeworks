package models;

public class Carro {
    public String modelo;
    public String marca;
    public String denatran;

    public Carro(String modelo, String marca, String denatran) {
        this.modelo = modelo;
        this.marca = marca;
        this.denatran = denatran;
    }

    public Carro() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDenatran() {
        return denatran;
    }

    public void setDenatran(String denatran) {
        this.denatran = denatran;
    }
}

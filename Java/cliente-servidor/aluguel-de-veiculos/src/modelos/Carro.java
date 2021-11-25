package modelos;

public class Carro {
    private int id;
    private int carrocodigo;
    private String marca;
    private String modelo;
    private String denatran;

    public Carro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarrocodigo() {
        return carrocodigo;
    }

    public void setCarrocodigo(int carrocodigo) {
        this.carrocodigo = carrocodigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDenatran() {
        return denatran;
    }

    public void setDenatran(String denatran) {
        this.denatran = denatran;
    }
}

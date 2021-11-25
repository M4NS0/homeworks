package modelos;

public class Pedido {
    private int id;
    String valortotal;
    String carro;
    String cliente;
    String dataDeInicio;
    String dataDeFim;
    int codigodomotorista;
    int codigodovendedor;
    int codigodopatio;

    public Pedido(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValortotal() {
        return valortotal;
    }

    public void setValortotal(String valortotal) {
        this.valortotal = valortotal;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(String dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public int getCodigodomotorista() {
        return codigodomotorista;
    }

    public void setCodigodomotorista(int codigodomotorista) {
        this.codigodomotorista = codigodomotorista;
    }

    public int getCodigodovendedor() {
        return codigodovendedor;
    }

    public void setCodigodovendedor(int codigodovendedor) {
        this.codigodovendedor = codigodovendedor;
    }

    public int getCodigodopatio() {
        return codigodopatio;
    }

    public void setCodigodopatio(int codigodopatio) {
        this.codigodopatio = codigodopatio;
    }
}

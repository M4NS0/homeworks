package modelos;

public class Patio {

    private int id;
    private int patioCodigo;
    private int codigoMotorista;
    private int codigoCarro;
    private String localizacao;
    private int capacidade;
    private int qtdCarros;

    public Patio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatioCodigo() {
        return patioCodigo;
    }

    public void setPatioCodigo(int patioCodigo) {
        this.patioCodigo = patioCodigo;
    }

    public int getCodigoMotorista() {
        return codigoMotorista;
    }

    public void setCodigoMotorista(int codigoMotorista) {
        this.codigoMotorista = codigoMotorista;
    }

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public void setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdCarros() {
        return qtdCarros;
    }

    public void setQtdCarros(int qtdCarros) {
        this.qtdCarros = qtdCarros;
    }
}

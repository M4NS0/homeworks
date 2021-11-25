package modelos;

public class Vendedor {
    private int id;
    private String nomevendedor;
    private String enderecovendedor;
    private String telefonevendedor;
    private String emailvendedor;
    private String comissaovendedor;
    private String vendasacumuladasvendedor;

    public Vendedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomevendedor() {
        return nomevendedor;
    }

    public void setNomevendedor(String nomevendedor) {
        this.nomevendedor = nomevendedor;
    }

    public String getEnderecovendedor() {
        return enderecovendedor;
    }

    public void setEnderecovendedor(String enderecovendedor) {
        this.enderecovendedor = enderecovendedor;
    }

    public String getTelefonevendedor() {
        return telefonevendedor;
    }

    public void setTelefonevendedor(String telefonevendedor) {
        this.telefonevendedor = telefonevendedor;
    }

    public String getEmailvendedor() {
        return emailvendedor;
    }

    public void setEmailvendedor(String emailvendedor) {
        this.emailvendedor = emailvendedor;
    }

    public String getComissaovendedor() {
        return comissaovendedor;
    }

    public void setComissaovendedor(String comissaovendedor) {
        this.comissaovendedor = comissaovendedor;
    }

    public String getVendasacumuladasvendedor() {
        return vendasacumuladasvendedor;
    }

    public void setVendasacumuladasvendedor(String vendasacumuladasvendedor) {
        this.vendasacumuladasvendedor = vendasacumuladasvendedor;
    }
}

package modelos;

public class Cliente {
    private int id;
    private int clientecodigo;
    private String cpf;
    private String clientenome;
    private String clienteendereco;
    private String clientetelefone;
    private String clienteemail;
    private String formadepagamento;
    private int dias;

    public Cliente(int i, int codigo, String nome, String cpf, String endereco, String telefone, String email, String formadepagamento, int dias) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientecodigo() {
        return clientecodigo;
    }

    public void setClientecodigo(int clientecodigo) {
        this.clientecodigo = clientecodigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getClientenome() {
        return clientenome;
    }

    public void setClientenome(String clientenome) {
        this.clientenome = clientenome;
    }

    public String getClienteendereco() {
        return clienteendereco;
    }

    public void setClienteendereco(String clienteendereco) {
        this.clienteendereco = clienteendereco;
    }

    public String getClientetelefone() {
        return clientetelefone;
    }

    public void setClientetelefone(String clientetelefone) {
        this.clientetelefone = clientetelefone;
    }

    public String getClienteemail() {
        return clienteemail;
    }

    public void setClienteemail(String clienteemail) {
        this.clienteemail = clienteemail;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}

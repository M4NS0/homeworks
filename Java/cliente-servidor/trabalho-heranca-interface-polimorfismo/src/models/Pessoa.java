package models;

public class Pessoa {
    public String nome;
    public String identidade;
    public String cpf;
    public String estado;
    public String cidade;
    public String endereço;
    public String cep;

    public Pessoa(String nome, String identidade, String cpf, String estado, String cidade, String endereço, String cep) {
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.estado = estado;
        this.cidade = cidade;
        this.endereço = endereço;
        this.cep = cep;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

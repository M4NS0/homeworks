package models;

import java.util.List;

public class PessoaFisica implements Comparable<PessoaFisica> {
    int id;
    String cpf, nome, cidade, estado, status;
    List<Telefone> telefones;

    public PessoaFisica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return
                id +
                ";" + cpf +
                ";" + nome +
                ";" + cidade +
                ";" + estado +
                ";" + status +
                ";" + telefones ;
    }

    @Override
    public int compareTo(PessoaFisica pessoaFisica) {
        return this.getNome().compareTo(pessoaFisica.getNome());
    }
}

package model;

public class PessoaJuridica implements Comparable<PessoaJuridica> {
    int ID;
    String CNPJ, razaoSocial, cidade, estado, avista, status;

    public PessoaJuridica() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    public String getAvista() {
        return avista;
    }

    public void setAvista(String avista) {
        this.avista = avista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(PessoaJuridica pessoa) {
        return this.getRazaoSocial().compareTo(pessoa.getRazaoSocial());
    }
}

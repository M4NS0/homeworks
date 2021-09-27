package models;

public class Aluno implements Comparable<Aluno>{
    String nome, status;
    long matricula;
    Float n1, n2, notaFinal;


    public Aluno() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Float getN1() {
        return n1;
    }

    public void setN1(Float n1) {
        this.n1 = n1;
    }

    public Float getN2() {
        return n2;
    }

    public void setN2(Float n2) {
        this.n2 = n2;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.getNome().compareTo((aluno.getNome()));
    }

    @Override
    public String toString() {
        return "\n\nNome Completo: " + nome +
                "\nMatrícula: " + matricula +
                "\nN1: " + n1 +
                "\nN2: " + n2 +
                "\nMédia: " + notaFinal +
                "\nStatus: " + status;
    }

}

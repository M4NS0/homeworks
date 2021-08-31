package model;

public class Pessoa {
    private final String nome = "João";
    private final int idade = 20;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public final String toString() {
//        nome  = "";
        return "Pessoa:{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                "}";
    }
}




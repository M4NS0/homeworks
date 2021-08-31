import model.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        imprime(p);
        System.out.println(p.toString());
    }

    private static void imprime(Pessoa p) {
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}

package aplicacao;

import modelo.Cilindro;
import modelo.PainelDesenho;
import modelo.Quadrado;

public class App {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        Quadrado quadrado = new Quadrado();

        PainelDesenho painelDesenho = new PainelDesenho();
        painelDesenho.desenhar(cilindro);
        painelDesenho.girar(quadrado);
    }
}

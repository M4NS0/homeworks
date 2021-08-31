package aplicacao;

import modelo.Cilindro;
import modelo.PainelDesenho;
import modelo.Quadrado;

public class App {
    public static void main(String[] args) {


        Cilindro cilindro = (Cilindro) Fabrica.getCilindro();
        Quadrado quadrado = (Quadrado) Fabrica.getQuadrado();

        PainelDesenho painelDesenho = new PainelDesenho();
        painelDesenho.desenhar(cilindro);
        painelDesenho.girar(quadrado);
    }
}

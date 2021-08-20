package aplicacao;

import modelo.Cilindro;
import modelo.Forma;
import modelo.Quadrado;

public class Fabrica {
    public static Forma getCilindro() {
        return new Cilindro();
    }
    public static Forma getQuadrado() {
        return new Quadrado();
    }
}

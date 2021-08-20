package aplicacao;

public class App {
    public static void main(String[] args) {
        PainelDesenho painelDesenho = new PainelDesenho();

        painelDesenho.aumentarCilindro();
        painelDesenho.desenharCilindro();
        painelDesenho.moverCilindro();
        painelDesenho.girarCilindro();

        painelDesenho.girarCubo();
        painelDesenho.desenharCubo();
        painelDesenho.moverCubo();
        painelDesenho.aumentarCubo();

    }
}

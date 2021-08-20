package modelo;

public class PainelDesenho {
    public void desenhar(Forma forma) {
        forma.desenhar();
    }
    public void aumentar(Forma forma) {
        forma.aumentar();
    }
    public void mover(Forma forma) {
        forma.mover();
    }
    public void girar(Forma forma) {
        forma.girar();
    }
}

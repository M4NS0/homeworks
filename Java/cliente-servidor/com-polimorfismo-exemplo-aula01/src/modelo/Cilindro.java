package modelo;

public class Cilindro implements Forma {
    public void desenhar() {
        System.out.println("Desenhando: " + getClass());
    }
    public void mover() {
        System.out.println("Mover: " + getClass());
    }
    public void aumentar() {
        System.out.println("Aumentar: " + getClass());
    }
    public void girar() {
        System.out.println("Girar: " + getClass());
    }
}

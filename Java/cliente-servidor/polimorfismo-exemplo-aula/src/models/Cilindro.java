package models;

public class Cilindro {
    public void desenharCilindro() {
        System.out.println("Desenhar " + getClass() );
    }

    public void moverCilindro() {
        System.out.println("Mover " + getClass() );
    }

    public void aumentarCilindro() {
        System.out.println("Aumentar " + getClass() );
    }

    public void girarCilindro() {
        System.out.println("Girar " + getClass() );
    }
}

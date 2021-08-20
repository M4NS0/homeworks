package modelo;

public class Quadrado implements Forma{

    @Override
    public void desenhar() {
        System.out.println("Desenhando: " + getClass());
    }

    @Override
    public void mover() {
        System.out.println("Movendo: " + getClass());
    }

    @Override
    public void aumentar() {
        System.out.println("Aumentando: " + getClass());
    }

    @Override
    public void girar() {
        System.out.println("Girando: " + getClass());
    }
}

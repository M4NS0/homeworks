package v2;

public class Fifo {
    private Pessoa lista[];
    private int inicio;
    private int fim;
    private boolean vazia;

    public Fifo(int aux) {
        this.lista = new Pessoa[aux];
        this.inicio = 0;
        this.fim = 0;
        this.vazia = true;
    }

    public boolean isCheia() {
        return this.inicio == this.fim && !this.vazia;
    }

    public void enfileirar(Pessoa aux) {
        if (isCheia()) {
            throw new IllegalStateException("Fila cheia");
        }
        this.lista[this.fim] = aux;
        this.fim = (this.fim + 1) % this.lista.length;
        this.vazia = false;
    }

    public Pessoa desenfileirar() {
        if (this.vazia) {
            throw new IllegalStateException("Fila vazia");
        }
        Pessoa valor = this.lista[inicio];
        this.inicio = (this.inicio + 1) % this.lista.length;
        this.vazia = this.inicio == this.fim;
        return valor;
    }

    public void imprime() {
        int inicio = this.inicio;
        if (this.isCheia()) {
            System.out.println(this.lista[this.inicio].getPessoa());
            inicio++;
        }
        for (int i = inicio; i != this.fim; i = (i + 1) % this.lista.length) {
            System.out.println(this.lista[i].getPessoa());
        }
    }

    public int getTamanho() {
        System.out.println(this.inicio + ", " + this.fim);
        if (this.vazia)
            return 0;
        if (this.isCheia())
            return this.lista.length;
        if (this.fim > this.inicio)
            return this.fim - this.inicio;

        return this.fim + this.lista.length - this.inicio;
    }
   
}
import java.util.Random;

public class AdivinhaNumero {
	private int numero;

	public AdivinhaNumero() { // usa o metodo aux para criar um construtor
		sorteiaNumero();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	private void sorteiaNumero() { // metodo aux, so funciona dentro da classe
		Random gerador = new Random();
		numero = gerador.nextInt(100) + 1;
	}

	public boolean dica(int tentativa) {
		if (tentativa == numero) {
			System.out.println("Acertou!");
			return true;
		} else if (tentativa > numero)
			System.out.println("O número é menor"); // quando tem so um comando n precisa de chave
		else
			System.out.println("O número é maior");
		return false;

	}
}

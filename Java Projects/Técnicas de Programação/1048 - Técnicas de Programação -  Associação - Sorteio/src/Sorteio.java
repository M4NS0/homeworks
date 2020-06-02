import java.util.Random;

public class Sorteio {
	// private Dado valor = new Dado();
	private Dado valor;

	public Sorteio() {
		valor = new Dado();
	}

	public int getValor() {
		return valor.getValorSelecionado();
	}

	public void lancarDado() {
		Random semente = new Random();
		valor.setValorSelecionado(semente.nextInt(50));
	}
}

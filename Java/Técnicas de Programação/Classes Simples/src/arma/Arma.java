package arma;
/*
 * Crie uma classe chamada Arma que tenha dois atributos inteiros 
 * que representem a capacidade e a quantidade de munição disponível. 
 * Os atributos devem ser privados
 */

public class Arma {
	private static int capacidade;
	private static int quantidade;

	// Construtor que não receba parâmetros e inicialize a capacidade com o valor 8
	
	public Arma() {
		capacidade = 8;
		
	}

	// Construtor que receba dois parâmetros inteiros e inicialize a capacidade e a
	// munição com esses valores //
	public Arma(int capacidade, int quantidade) {
		Arma.capacidade = 8;
		Arma.quantidade = 8;
	}

	// Um método chamado disparar sem parâmetros que, se houver munição na arma,
	// decrementa a quantidade de munição e retorna true; ou simplesmente retorna
	// false caso não haja munição.
	public boolean Disparar() {
		if (quantidade <= 8 && quantidade >= 1) {
			quantidade = quantidade - 1;
			return true;
		}

		if (quantidade == 0);
		return false;
	}

	// Um método chamado recarregar sem parâmetros que faz com que a
	// munição receba o máximo da capacidade.
	public void Recarregar() {
		for (int i = quantidade; i < capacidade; i++) {
			quantidade = quantidade + 1;
		}
	}

	// Um método chamado recarregar que recebe a quantidade de munição que deverá
	// ser utilizada para recarregar a arma. O método deverá retornar um inteiro
	// que representa a quantidade de munição que por ventura tenha sobrado após
	// o recarregamento. Evidentemente, se a quantidade passada por parâmetro for
	// menor ou igual do que a quantidade de munição que falta para recarregar
	// totalmente a arma,o método deverá retornar 0.
	public int Recarregar(int quantidade) {
		if (quantidade <= capacidade - quantidade) {
			return 0;
		}
		
		return quantidade;
	}

	// Métodos get para os atributos //
	public int getCapacidade() {
		return capacidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
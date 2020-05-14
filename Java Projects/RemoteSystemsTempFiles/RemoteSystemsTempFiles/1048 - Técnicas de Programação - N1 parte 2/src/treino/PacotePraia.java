package treino;

public class PacotePraia extends Pacote {

	public PacotePraia(String descricao, double preco) {
		super(descricao, preco);
		
	}
	public void getPacotePraia() {
		System.out.println("Destino: " + super.getDescricao());
		System.out.println("  Total: " + super.getPreco());
		
	}
}

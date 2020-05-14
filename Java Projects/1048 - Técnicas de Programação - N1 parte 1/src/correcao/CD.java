package correcao;
public class CD extends Midia {
	int faixas;

	public CD(int faixas, String artista, String nome, double preco, String status) {
		super(artista, nome, preco, status);
		this.faixas = faixas;
	}

	protected void getCD() {
		System.out.println("Nome          : " + super.getNome());
		System.out.println("Num. de Faixas:          : " + this.faixas);
		System.out.printf("Preço          : R$ %.2f\n", super.getPreco());
		System.out.println("Status        : " + super.getStatus() + "\n");
	}

}

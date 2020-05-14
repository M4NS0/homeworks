package tentativa;

public class CD extends Midia {
	private int faixas;

	protected CD(String artista, String nome, double preco, String status, int faixas) {
		super(artista, nome, preco, status);
		this.faixas = faixas;
	}

	public void getCD() {
		System.out.println("   Nome: " + super.getNome());
		System.out.println("Artista: " + super.getArtista());
		System.out.println(" Faixas: " + this.faixas);
		System.out.println(" Status: " + super.getStatus());
		System.out.println("  Preço: " + super.getPreco());
	}

}

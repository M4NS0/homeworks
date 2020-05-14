package correcao;
public class Midia extends Produto {
	private String artista;

	public Midia(String artista, String nome, double preco, String status) {
		super(nome, preco, status);
		this.artista = artista;
	}

	protected String getArtista() {
		return this.artista;
	}

}

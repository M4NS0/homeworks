package tentativa;

public class Midia extends Produto {
	public String artista;

	protected Midia(String artista, String nome, double preco, String status) {
		super(nome, preco, status);
		this.artista = artista;
	}

	public String getArtista() {
		return this.artista;
	}

}

package original;


public class Midia extends Produto{
	String artista;

	public Midia(String nome, Double preco, String status, String artista) {
		super(nome, preco, status);
		this.artista = artista;
	}
	protected void getMidia() {
		System.out.println(" Artista: " + artista);
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
}

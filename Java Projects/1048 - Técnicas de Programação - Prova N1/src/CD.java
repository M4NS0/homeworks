
public class CD extends Midia {
	private int faixa;

	public CD(String nome, Double preco, String status, String artista, int faixa) {
		super(nome, preco, status, artista);
		this.faixa = faixa;
	}
	protected void getCD() {
		System.out.println(" Faixa: " + faixa);
	}
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}

}

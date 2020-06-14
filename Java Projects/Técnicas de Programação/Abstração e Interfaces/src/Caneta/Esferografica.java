package Caneta;

public class Esferografica implements Caneta {
	private String cor;
	
	
	public Esferografica(String cor) {
		this.cor = cor;
	}

	@Override
	public String escrever() {
		return " com esferográfica ";
	}

	@Override
	public String getCor() {
		return " " + cor;
		
	}

	public static void escreverTexto(Caneta c, String texto) {
		System.out.println("Usando " + texto + " " + c.escrever() + "cor:" + c.getCor());

	}

}

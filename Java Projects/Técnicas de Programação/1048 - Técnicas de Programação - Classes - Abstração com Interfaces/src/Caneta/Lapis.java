package Caneta;

public class Lapis implements Caneta {
	private String cor;

	public Lapis(String cor) {
		this.cor = cor;
	}
	
	
	@Override
	public String escrever() {
		return " com lápis ";

	}

	@Override
	public String getCor() {
		return " " + cor;

	}

	public static void escreverTexto(Caneta c, String texto) {
		System.out.println("Usando " + texto + " " + c.escrever() + "cor:" + c.getCor());

	}

}

package Caneta;

public class Giz implements Caneta {
	private String cor;

	public Giz(String cor) {
		this.cor = cor;
	}

	@Override
	public String escrever() {
		return " com giz ";
	}

	@Override
	public String getCor() {
		return " " + cor;
	}

	public static void escreverTexto(Caneta c, String texto) {
		System.out.println("Usando " + texto + " " + c.escrever() + "cor:" + c.getCor());

	}
}

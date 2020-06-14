package lampada;

public class Teste {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada(true);
		
		Lampada lampada2 = new Lampada(false);
		
		System.out.println("Lampada 1: " + lampada1.getStatus());
		System.out.println("Lampada 2: " + lampada2.getStatus());

	}

}

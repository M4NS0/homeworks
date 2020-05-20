
public class testeLampada {

	public static void main(String[] args) {
		classeLampada lampada1 = new classeLampada(true);
		
		classeLampada lampada2 = new classeLampada(false);
		
		System.out.println("Lampada 1: " + lampada1.getStatus());
		System.out.println("Lampada 2: " + lampada2.getStatus());

	}

}

package animais;

public class AppAnimais {
	public static void main(String[] args) {
		Animal cao = new Cachorro("Minduim"); 
		
		System.out.println(" Cão " + cao.getNome());
		cao.talk();
		cao.rosna();
		System.out.println();
		
		Animal gato = new Gato("Bola-de-Pelo"); 
		
		System.out.println(" Gato " + gato.getNome());
		gato.talk();
		gato.animalFala();
		System.out.println();
	}
}

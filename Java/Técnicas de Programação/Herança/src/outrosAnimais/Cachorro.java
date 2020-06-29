package outrosAnimais;

public class Cachorro extends Animal{

	public Cachorro(String nome, String raca) {
		super(nome);
		super.setRaca(raca);
		
	}
	public void late() {
		System.out.println("Auau-motherfucker");
	}

}

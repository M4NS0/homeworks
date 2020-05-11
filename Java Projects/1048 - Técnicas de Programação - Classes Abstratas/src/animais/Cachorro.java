package animais;

public class Cachorro extends Mamifero {

	protected Cachorro(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("Late!");
	}
	
	public void morde() {
		System.out.println("Morde!");
	}
}

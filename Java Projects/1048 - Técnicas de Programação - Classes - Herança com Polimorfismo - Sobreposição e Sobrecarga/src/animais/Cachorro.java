package animais;

public class Cachorro extends Animal {

	protected Cachorro(String nome) {
		super(nome);

	}
	
	@Override
	public void talk() {
		super.talk();
		System.out.println(" Au au...");
	}
	@Override
	public void rosna() {
		System.out.println(" Grrrrrr");
	}
}

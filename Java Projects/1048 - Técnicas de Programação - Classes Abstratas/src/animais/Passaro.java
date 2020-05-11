package animais;

public abstract class Passaro extends Animal {

	protected Passaro(String name) {
		super(name);
		
	}
	@Override
	public void talk() {
		System.out.println("Pia!");
	}
}

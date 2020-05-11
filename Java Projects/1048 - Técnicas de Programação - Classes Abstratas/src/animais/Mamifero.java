package animais;

public abstract class Mamifero extends Animal {

	protected Mamifero(String name) {
		super(name);
		
	}
	public abstract void talk();
	//public abstract void morde();
}

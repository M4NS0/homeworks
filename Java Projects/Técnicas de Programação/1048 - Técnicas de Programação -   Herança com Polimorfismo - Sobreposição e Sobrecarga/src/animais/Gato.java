package animais;

public class Gato extends Animal {

	protected Gato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void talk() {
		super.talk();
		System.out.println(" Miau...");
	}
	@Override
	public void animalFala() {
		super.talk();
	}
	@Override
	public void grune() {
		System.out.println(" RRrrrRRRrrrRRR");
	}
	

}

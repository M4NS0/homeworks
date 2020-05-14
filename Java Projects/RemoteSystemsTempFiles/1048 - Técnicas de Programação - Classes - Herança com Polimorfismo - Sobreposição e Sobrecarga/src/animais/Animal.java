package animais;

public class Animal {
	private String nome;

	protected Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void talk() {
		System.out.println("\n Emite som:");
	}

	public void grune() {
	}

	public void rosna() {
	}

	public void animalFala() {
	}
}

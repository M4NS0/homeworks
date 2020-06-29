package animais;

public class Peixe extends Animal {
	protected String habitat;
	

	public Peixe(String nome, Double peso, String habitat) {
		super(nome,peso);
		this.habitat = habitat;
	}
	
	public void imprimePeixe() {
		System.out.println("- Peixe\n   Nome: " + nome + "\n   Peso: " + peso + "\nHabitat: " + habitat);
	}

	protected String getHabitat() {
		return habitat;
	}

	protected void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}

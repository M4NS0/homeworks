package Animais;

public class Cachorro extends Animal {
	protected String raca;

	public Cachorro(String nome, Double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
	}
	public void imprimeCachorro() {
		System.out.println("- Cão\n  Nome: " + nome + "\n  Peso: " + peso + "\n  Raça: " + raca + "\n");
	}
	protected String getRaca() {
		return raca;
	}

	protected void setRaca(String raca) {
		this.raca = raca;
	}

}

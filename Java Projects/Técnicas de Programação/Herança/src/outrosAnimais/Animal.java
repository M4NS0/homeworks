package outrosAnimais;
	
public class Animal {
	protected String nome;
	protected String raca;
	
	public Animal() {
		this.nome = "";
		this.raca = "";
	}
	public Animal(String nome) {
		this.nome = nome;
		
	}

	public String caminha() {
		return "Sim";
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getRaca() {
		return raca;
	}

	protected void setRaca(String raca) {
		this.raca = raca;
	}
	
}

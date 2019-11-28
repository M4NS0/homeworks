package interfaces2;

public abstract class Profissional {
	
	private String nome;
	private String escolaridade;
	
	public Profissional () {
		
	}
	public Profissional (String n, String e) {
		this.Setnome(n);
		this.SetEscolaridade(e);
	}
	public String Getnome() {
		return nome;
	}
	public void Setnome(String nome) {
		this.nome = nome;
	}
	public String GetEscolaridade() {
		return escolaridade;
	}
	public void SetEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	@Override
	public String toString() {
		return "\nNome:" + nome + "\nEscolaridade: " + escolaridade +"\n";
	}
}

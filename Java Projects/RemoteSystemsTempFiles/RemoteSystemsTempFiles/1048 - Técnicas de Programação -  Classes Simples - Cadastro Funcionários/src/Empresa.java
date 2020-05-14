
public class Empresa {
	private String nome;
	private String end;
	private String cep;
	private String fone;
	
	

	public Empresa(String n, String e, String c, String f) {
		this.setNome(n);
		this.setEnd(e);
		this.setCep(c);
		this.setFone(f);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		return "\n-------- Empresa -------\nNome:" + nome + "\nEndereço: " + end + "\nCEP: " + cep + "\nFone: " + fone +"\n\n\n";
	}
	
	
}

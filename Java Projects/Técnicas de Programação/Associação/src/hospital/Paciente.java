package hospital;

public class Paciente {
	private String nomePac;
	private String doenca;
	
	public Paciente (String n, String d) {
		this.nomePac = n;
		this.doenca = d;
	}

	public String getNomePac() {
		return nomePac;
	}

	public void setNomePac(String nomePac) {
		this.nomePac = nomePac;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
}

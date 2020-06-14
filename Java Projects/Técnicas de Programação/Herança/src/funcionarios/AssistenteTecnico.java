package funcionarios;

public class AssistenteTecnico extends Funcionario {
	private String matricula;
	private Double bonus;

	public AssistenteTecnico(String nome, String cpf,String matricula) {
		super(nome,cpf);
		this.matricula = matricula;	
	}
	
	public void imprimir() {
		System.out.println( "- Assistente Técnico\n"
				+ 			"       Nome: " + getNome() + "\n" 
				+			"        CPF: " + getCpf() + "\n" 
				+ 			" Matricula: " + matricula + "\n"
				+ 			"      Bônus: " + bonus + "\n");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	

}


public class Aluno extends Pessoa {
	private int matricula;

	public Aluno(String nome, String cpf, int matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	public void listar() {
		System.out.println(" - Aluno - ");
		System.out.println(" Nome: " + super.getNome());
		System.out.println(" Cpf: " + super.getCpf());
		System.out.println(" Matricula: " + matricula);
		
	}
}

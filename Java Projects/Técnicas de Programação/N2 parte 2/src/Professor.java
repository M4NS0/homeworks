
public class Professor extends Pessoa{
	private int codMateria;
	
	public Professor(String nome, String cpf, int codMateria) {
		super(nome, cpf);
		this.codMateria = codMateria;
	}
	public void listar() {
		System.out.println(" - Professor - ");
		System.out.println(" Nome: " + super.getNome());
		System.out.println(" Cpf: " + super.getCpf());
		System.out.println(" Codigo: " + codMateria);
		
	}


}

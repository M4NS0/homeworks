package Escola;

public class Turma {
	private Aluno aluno =  new Aluno();
	
	public Turma() {
		
		
		System.out.println(Aluno.curso);	// curso is protected and Turma is 
											// in the same package as Aluno
		
	}
}

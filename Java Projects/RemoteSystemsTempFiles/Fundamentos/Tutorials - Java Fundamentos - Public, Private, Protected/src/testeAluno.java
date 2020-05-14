import Escola.Aluno;
/*
 *  private 	- only within same class
 *  public  	- from anywhere
 *  protected 	- same class, subclass and same package
 *  no modifier - same package only
 *  public 		- visible from outside of file, 
 *  			- you can't declare class as private
 */
public class testeAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("     Nome: " + aluno1.name);
		System.out.println("Matrícula: " + aluno1.ID);
		
		// System.out.println("  Tipo: " + aluno1.tipo);  	// Won't work while it's private
		// System.out.println(" Curso: " + aluno1.curso); 	// Won't work even protected because 
															// it's in another package
		// System.out.println(aluno1.idade);				// Won't work because is not in the same package
	}
}

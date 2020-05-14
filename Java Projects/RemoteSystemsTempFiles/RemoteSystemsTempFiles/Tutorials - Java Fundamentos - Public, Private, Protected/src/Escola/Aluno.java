package Escola;
import java.util.Scanner;

public class Aluno {
	public Scanner leia = new Scanner(System.in);
	
	
	public String name;						// Bad practice
	
	
	public final static int ID = 8882019;	// Acceptable practice  - it's final.
	
	
	protected static String curso;			// Protected means that 
											// you can access from any class
	
	private String tipo;
	
	int idade;
	
	public Aluno() {
		System.out.println("Digite o nome: ");
		name = leia.next();
		this.name = name;
		
		System.out.println("O aluno recebe algum benefício? 'S' ou 'N': ");
		String escolha = leia.next();
		
		if (escolha.equalsIgnoreCase("N")) { 
			
		}
		if (escolha.equalsIgnoreCase("S")) { 
			this.tipo = "Bolsista";
		}
		
		System.out.println("Digite o Curso: ");
		curso = leia.next();
		this.curso = curso;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		this.idade = idade;
		
	}
}

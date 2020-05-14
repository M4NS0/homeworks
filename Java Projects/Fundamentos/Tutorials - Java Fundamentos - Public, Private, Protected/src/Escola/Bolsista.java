package Escola;

public class Bolsista extends Aluno{
	
	public Bolsista() {
		// tipo = "Bolsista"; // Won't work while it's private
		this.curso = curso;   // This works because it's protected
							  // Bolsista is a subclass of Aluno
							  // Protected let you access the variable within the class
		this.idade = idade;	  // No access specifier
							  // Works because are in same packages
	}
}

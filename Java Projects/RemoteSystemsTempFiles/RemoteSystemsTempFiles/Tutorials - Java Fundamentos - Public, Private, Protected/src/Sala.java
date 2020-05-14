import Escola.Aluno;

public class Sala extends Aluno{
	public Sala() {
		// System.out.println(this.idade);	// Won't work because idade 
											// has no specifier it's visible 
											// only on same package
											// even though is a subclass
	}
}

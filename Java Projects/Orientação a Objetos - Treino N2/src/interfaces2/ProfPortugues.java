package interfaces2;

public class ProfPortugues extends Profissional implements DomPortugues {
	
	@Override
	public void corrigirRedacao() {
		System.out.println("Corrigindo...");	
	}
	@Override
	public void revisarTexto() {
		System.out.println("Revisando...");
	}
	@Override
	public String toString() {
		return "\nProfessor de Português: \n"  + super.toString();
	}

}

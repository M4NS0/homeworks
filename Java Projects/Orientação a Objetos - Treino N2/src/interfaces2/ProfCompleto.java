package interfaces2;

public class ProfCompleto extends Profissional implements DomInformatica,DomMatematica,DomPortugues {

	@Override
	public void corrigirRedacao() {
		System.out.println("Professor Completo está corrigindo redação...");
		
	}

	@Override
	public void revisarTexto() {
		System.out.println("Professor Completo está revisando texto...");
		
	}

	@Override
	public void realizarCalculos() {
		System.out.println("Professor Completo está realizando calculos...");
		
	}

	@Override
	public void formatarComputador() {
		System.out.println("Professor Completo está formatando computador...");
		
	}

	@Override
	public void treinarUsuario() {
		System.out.println("Professor Completo está treinando usuário...");
		
	}

	@Override
	public String toString() {
		return "\nProfessor Completo: \n" + super.toString() +"\n";
	}
	
	
}

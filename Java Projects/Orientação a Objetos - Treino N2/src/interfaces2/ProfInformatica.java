package interfaces2;

public class ProfInformatica extends Profissional implements DomInformatica{
	@Override
	public void formatarComputador() {
		System.out.println("\n O professor de informática está formatando....");
	}
	@Override
	public void treinarUsuario() {
		System.out.println("O professor de informática está treinando....");
	}
	@Override
	public String toString() {
		return "\nProfessor de Informática: \n" + super.toString();
	}

}

package interfaces2;

public class ProfMatematica extends Profissional implements DomMatematica {
	@Override
	public void realizarCalculos() {
		System.out.println("Professor de Matemática está calculando...");
	}
	@Override
	public String toString() {
		return "\nProfessor de Matamática: \n" + super.toString() +"\n";
	}

}

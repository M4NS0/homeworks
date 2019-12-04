package interfaces3;

public abstract class Triatleta  extends Pessoa implements Atleta{
	
	@Override 
	public void aquecer() {
		System.out.println("Triatleta está aquecendo....");
	}
	@Override 
	public void alongar() {
		System.out.println("Triatleta está alongando....");
	}
	@Override
	public void competir() {
		System.out.println("Triatleta está competindo...");
	}
	@Override
	public String toString() {
		return super.toString();
		
	}

}

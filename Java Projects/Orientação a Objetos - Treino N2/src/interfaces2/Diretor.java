package interfaces2;

public class Diretor extends Profissional implements DomAdministrativo {
	int quantidade;
	String cargo;
	
	public Diretor () {
		
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override 
	public void organizarTarefas() {
		System.out.println("\nDiretor organiza tarefas...");
	}
	@Override
	public void designarCargos() {
		System.out.println("Diretor designa cargos....");
	}
	@Override
	public void contratarFuncionarios(int quantidade, String cargo) {
		System.out.println("Diretor está contratando: \n Quantidade:" + quantidade + "\n Cargo: "+ cargo);
		
	}
	@Override
	public String toString() {
		return "\nDiretor: " + super.toString() + "\n";
	}
}

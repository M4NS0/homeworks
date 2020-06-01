package entrega;

public class Funcionario {
	private String nome;
	private String codigo;
	
	public Funcionario(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	protected String getNome() {
		return nome;
	}
	protected String getCodigo() {
		return codigo;
	}
	
	
}

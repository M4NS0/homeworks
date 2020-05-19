package alterado;

public class Pessoa {
	String nome;
	String tipo;
	int numero;
	double valor;
	
	
	public Pessoa(String nome ,int numero, String tipo, double valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.numero = numero;
		this.valor = valor;
	}
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}

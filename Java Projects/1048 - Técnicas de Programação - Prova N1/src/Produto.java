
public class Produto {
	private String nome;
	private Double preco;
	private String status;
	
	public Produto(String nome, Double preco, String status) {
		this.nome = nome;
		this.preco = preco;
		this.status = status;
	}
	public  void getProduto() {
		System.out.println(" Nome: " + nome);
		System.out.println(" Preço: " + preco);
		System.out.println(" Status: " +  status);
		
	}
	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public String getStatus() {
		return status;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

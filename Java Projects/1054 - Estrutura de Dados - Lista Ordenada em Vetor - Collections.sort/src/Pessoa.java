

public class Pessoa {
	String nome;
	int primeiro;
	int ultimo;
	int posicao;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}

	public int getUltimo() {
		return ultimo;
	}

	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + "\nPrimeiro:" + primeiro + "\nUltimo:" + ultimo + "\nPosicao:" + posicao;
	}

}

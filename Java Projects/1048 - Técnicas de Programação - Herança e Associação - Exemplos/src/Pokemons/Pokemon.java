package Pokemons;

public class Pokemon {
	private String nome;
	private int pontosdeVida;
	private int dano;

	public void aplicaGolpe(String nome) {
		System.out.println(nome + " aplicou golpe! Phew!Poing!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosdeVida() {
		return pontosdeVida;
	}

	public void setPontosdeVida(int pontosdeVida) {
		this.pontosdeVida = pontosdeVida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

}

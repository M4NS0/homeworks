package Pokemons;

public class Rapidash extends Pokemon {
	
	protected Rapidash(int dano, String nome, int vida) {
		super();
		setDano(dano);
		setNome(nome);
		setPontosdeVida(vida);
	}
	@Override
	public void aplicaGolpe (String nome) {
		aplicaGolpe(nome);
		setDano(60);
		System.out.println(nome + " aplicou golpe de dano " + getDano());
	}
	

}



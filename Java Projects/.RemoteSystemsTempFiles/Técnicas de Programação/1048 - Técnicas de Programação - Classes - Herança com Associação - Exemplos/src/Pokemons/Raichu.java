package Pokemons;

public class Raichu extends Pokemon {
	
	protected Raichu(int dano, String nome, int vida) {
		super();
		setDano(dano);
		setNome(nome);
		setPontosdeVida(vida);
	}
	
	@Override
	public void aplicaGolpe (String nome) {
		aplicaGolpe(nome);
		setDano(70);
		System.out.println(nome + " aplicou golpe de dano " + getDano());
	}
	

}

package Pokemons;

public class Ponyta extends Rapidash {
	
	protected Ponyta(int dano, String nome, int vida) {
		super(dano, nome, vida);
	}

	@Override
	public void aplicaGolpe(String nome) {
		aplicaGolpe(nome);
		setDano(40);
		System.out.println(nome + " aplicou golpe de dano " + getDano());
	}

}

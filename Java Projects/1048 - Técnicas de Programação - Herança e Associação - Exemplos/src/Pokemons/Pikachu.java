package Pokemons;

public class Pikachu extends Raichu {
	
	protected Pikachu(int dano, String nome, int vida) {
		super(dano, nome, vida);
		
	}

	@Override
	public void aplicaGolpe (String nome) {
		aplicaGolpe(nome);
		setDano(50);
		System.out.println(nome + " aplicou golpe de dano " + getDano());
	}
	

}
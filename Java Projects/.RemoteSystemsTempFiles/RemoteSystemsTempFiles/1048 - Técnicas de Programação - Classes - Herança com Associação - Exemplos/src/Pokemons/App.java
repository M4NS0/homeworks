package Pokemons;

import java.util.Random;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Pokemon pikachu1 = new Pokemon();
		pikachu1.setNome("Pika");
		pikachu1.setDano(50);
		pikachu1.setPontosdeVida(160);

		Pokemon raichu1 = new Pokemon();
		raichu1.setNome("Rai");
		raichu1.setDano(70);
		raichu1.setPontosdeVida(200);

		Pokemon ponyta1 = new Pokemon();
		ponyta1.setNome("Pony");
		ponyta1.setDano(40);
		ponyta1.setPontosdeVida(150);

		Pokemon rapidash1 = new Pokemon();
		rapidash1.setNome("Rap");
		rapidash1.setDano(60);
		rapidash1.setPontosdeVida(250);

		do {
			Random random1 = new Random();
			int sorteio1 = random1.nextInt(1 | 2);
			
			Random random2 = new Random();
			int sorteio2 = random2.nextInt(3 | 4);

			if (sorteio1 == 1) {
				System.out.println(">> Picachu ataca Ponyta!");
				ponyta1.setPontosdeVida(ponyta1.getPontosdeVida() - pikachu1.getDano());
				Thread.sleep(1500);
				System.out.println(ponyta1.getNome() + " está com " + ponyta1.getPontosdeVida() + " pontos de vida");
				System.out.println();
			}
			if (sorteio1 == 2) {
				System.out.println(">> Raiachu ataca Rapidesh!");
				rapidash1.setPontosdeVida(rapidash1.getPontosdeVida() - raichu1.getDano());
				Thread.sleep(1500);
				System.out.println(rapidash1.getNome() + " está com " + rapidash1.getPontosdeVida()+ " pontos de vida");
				System.out.println();
			}
			if (sorteio2 == 3) {
				System.out.println(">> Ponyta ataca Picachu!");
				pikachu1.setPontosdeVida(pikachu1.getPontosdeVida() - ponyta1.getDano());
				Thread.sleep(1500);
				System.out.println(pikachu1.getNome() + " está com " + pikachu1.getPontosdeVida()+ " pontos de vida");
				System.out.println();
			}
			if (sorteio2 == 4) {
				System.out.println(">> Rapidash ataca Raichu!");
				raichu1.setPontosdeVida(raichu1.getPontosdeVida() - rapidash1.getDano());
				Thread.sleep(1500);
				System.out.println(raichu1.getNome() + " está com " + raichu1.getPontosdeVida()+ " pontos de vida");
				System.out.println();
			}
			if (rapidash1.getPontosdeVida() <= 0) {
				System.out.println(rapidash1.getNome() + " foi eliminado!\n");
				System.out.println("Game Over");
				break;
			}
			if (ponyta1.getPontosdeVida() <= 0) {
				System.out.println(ponyta1.getNome() + " foi eliminado!\n");
				System.out.println("Game Over");
				break;
			}

			
			if (pikachu1.getPontosdeVida() <= 0) {
				System.out.println(pikachu1.getNome() + " foi eliminado!\n");
				System.out.println("Game Over");
				break;
			}
			if (raichu1.getPontosdeVida() <= 0) {
				System.out.println(raichu1.getNome() + " foi eliminado!\n");
				System.out.println("Game Over");
				break;
			}

		} while (pikachu1.getPontosdeVida() > 0 && 
				raichu1.getPontosdeVida() > 0 && 
				ponyta1.getPontosdeVida() > 0 && 
				rapidash1.getPontosdeVida() > 0);

	}

}

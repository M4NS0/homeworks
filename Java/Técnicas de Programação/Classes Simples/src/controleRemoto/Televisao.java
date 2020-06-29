package controleRemoto;
// Crie uma classe classeTelevisao com atributo volume 
// e um atributo canal, ambos do tipo private int.
public class Televisao {
	private static int canal;
	private static int volume;

	// Crie um construtor para a classe que inicialize os atributos //
	// com o valor 12 para canal e 0 para volume //
	public Televisao() {
		canal = 12;
		volume = 0;
	}

	// aumentar ou diminuir a potência do volume de som em uma //
	// unidade de cada vez. Limites 0 pra inferior e 50 para superior; //
	public void aumentarVolume() {
		if (volume >= 80) {
			System.out.println("\nVolume no limite máximo!");
		} else {
			volume = volume + 1;
			System.out.println("\n\t\t\t\t+1\n");
		}
	}

	public void diminuirVolume() {
		if (volume <= 0) {
			System.out.println("\nMudo");
		} else {
			volume = volume - 1;
			System.out.println("\n\t\t\t\t-1\n");
		}
	}

	public void aumentarCanal() {
		if (canal > 100) {
			System.out.println("\nAtingiu o limite máximo de Canais!");
		} else {
			canal = canal + 1;
			System.out.println("\n\t\t\t\t+1\n");
		}
	}

	public void diminuirCanal() {
		if (canal < 10) {
			System.out.println("\nAtingiu o limite mínimo de Canais!");
		} else {
			canal = canal - 1;
			System.out.println("\n\t\t\t\t-1\n");
		}
	}

	// Crie os GETs/SETs correspondentes //
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		Televisao.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

}

import java.time.Instant;
import java.util.Arrays;

public class Funcao {

	private static long startTime;

	public static void imprime(String[] v) {
		System.out.println(Arrays.toString(v));
	}

	public static Object ordena(String v[]) {
		Arrays.sort(v);
		return v;
	}
	public static int achaNome(String v[], String k) {
		int i;
		for (i = 0; i < v.length; i++) { 		// Percorre todo o vetor v
			if (v[i].equalsIgnoreCase(k))
				return i; 						// Se encontrar um valor igual, retorna posição i
		}
		return -1; 								// caso o valor não seja encontrado, retorna valor -1

	}
	public static long iniciaTempo() {
		startTime = Instant.now().toEpochMilli();
		return startTime;
	}

	public static long finalizaTempo() {
		long endTime = Instant.now().toEpochMilli();
		long timeElapsed = endTime - startTime;
		return timeElapsed;
	}
}

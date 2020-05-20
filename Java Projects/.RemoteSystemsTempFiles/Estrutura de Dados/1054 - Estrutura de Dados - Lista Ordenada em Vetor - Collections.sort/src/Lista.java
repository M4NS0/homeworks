import java.util.Arrays;
import java.util.Scanner;

public class Lista {
	static Scanner leia = new Scanner(System.in);

	private static int[] lista;

	public static void criaLista(int[] v) {
		v[0] = 0;
	}

	public static void insere(int m) {
		lista = new int[m];
		int valor, aux, indice = 0;
		for (int i = 0; i < m; i++) {
			System.out.print("Elemento: ");
			valor = leia.nextInt();
			lista[i] = valor;

			if (i != 0) {
				indice = i - 1;
				for (int p = i; p > 0; p--) {
					if (lista[indice] > lista[p]) {
						aux = lista[p];
						lista[p] = lista[indice];
						lista[indice] = aux;
					}
					indice--;
					if (indice < 0)
						indice = 0;
				}
			}
			Arrays.toString(lista);
		}

	}


	static void exibeLista(int[] v) {
		String s = "";
		int n = v[0];
		if (n == 0)
			System.out.println("Lista Vazia!");
		else {
			Arrays.toString(v);
		}
	}
}
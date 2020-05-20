import java.util.ArrayList;
import java.util.Random;

public class Teste {

	public static void incializaLista(ArrayList<Integer> L, int n) {
		int i;
		Random gerador = new Random();
		for (i = 0; i < n; i++) L.add(gerador.nextInt(100) + 1);
		n = 100;
	}

	public static void imprimeLista(ArrayList<Integer> L) {
		System.out.print("Lista: [");
		for (Integer i : L) System.out.print(" " + i);
		System.out.println(" ]\n");
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int n = 5;
		incializaLista(lista, n);
		imprimeLista(lista);
		System.out.println("\nQtde. Elementos = " + n);
	}

}

public class Torre {
	int i = 1;
	public void MoveTorre(int n, int orig, int dest, int aux) { // função recursiva
		if (n == 1) {
			MoveDisco(n, orig, dest); // caso base ou condição de parada (tem apenas 1 disco)
		} else {
			MoveTorre(n - 1, orig, aux, dest); // Recurssões
			MoveDisco(n, orig, dest);
			MoveTorre(n - 1, aux, dest, orig);
		}
	}

	private void MoveDisco(int disco, int orig, int dest) {
		
		System.out.println("\nMovimento " + i + ": Disco " + disco + " vai da posição " + orig + " para " + dest);
		i ++;

	}
}

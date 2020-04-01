
public class Lista {
	private Nodo primeiro;

	public void criaLista() {
		primeiro = null;
	}

	public void add(String aux) {
		Nodo novo = new Nodo();
		novo.setInfo(aux);
		novo.setProximo(primeiro);
		primeiro = novo;
	}

	public void print() {
		for (Nodo n = primeiro; n != null; n = n.getProximo())
			System.out.println(n.getInfo());
	}

	public boolean isEmpty() {
		if (primeiro == null)
			return true;
		else
			return false;
	}

	public void search(String aux) {
		for (Nodo n = primeiro; n != null; n = n.getProximo()) {
			if (n.getInfo().contains(aux))
				System.out.println("Encontrado!");
		}
	}

	public void remove(String aux) {
		Nodo anterior = null;
		Nodo p = primeiro;

		while(p != null && p.getInfo() == aux){
			anterior = p;
			p = p.getProximo();
		}
		
		if (p == null){
			return;
		}
		
		if (anterior == null) {
			primeiro = p.getProximo();
		} else {
			anterior.setProximo(p.getProximo());
		}
		
	}
	public void free() {
		while (primeiro != null) {
			Nodo temp = primeiro.getProximo();
			primeiro = null;
			primeiro = temp;
		}
		
	}

}

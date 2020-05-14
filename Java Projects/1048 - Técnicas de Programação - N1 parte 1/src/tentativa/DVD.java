package tentativa;

import java.util.ArrayList;

public class DVD extends Midia {
	private int duracao;
	
	// associação com classe box //
	
	ArrayList<Box> boxes = new ArrayList<Box>();

	protected DVD(String artista, String nome, double preco, String status, int duracao, ArrayList<Box> boxes) {
		super(artista, nome, preco, status);
		this.duracao = duracao;
		this.boxes = boxes;
	}

	public void getDVD() {
		System.out.println("   Nome: " + super.getNome());
		System.out.println("Artista: " + super.getArtista());
		System.out.println("Duração: " + this.duracao);

		int count = 0;
		if (boxes.isEmpty()) {
			System.out.println("");
		} else {

			for (int i = 0; i < boxes.size(); i++) {
				
				// associação com classe box //
				
				System.out.println("Box " + (count + 1) + ": " + boxes.get(i).getTitulo());
				count++;
			}
		}
		System.out.println(" Status: " + super.getStatus());
		System.out.println("  Preço: " + super.getPreco());

	}

}

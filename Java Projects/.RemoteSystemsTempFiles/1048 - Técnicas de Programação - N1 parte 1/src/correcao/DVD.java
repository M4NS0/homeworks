package correcao;
import java.util.ArrayList;

public class DVD extends Midia {
	private int duracao;
	private ArrayList<Box> boxes; // = new ArrayList<Box>();

	public DVD(int duracao, String artista, String nome, double preco, String status, ArrayList<Box> boxes) {
		super(artista, nome, preco, status);
		this.duracao = duracao;
		this.boxes = boxes;
	}

	protected void getDVD() {
		System.out.println("Nome          : " + super.getNome());
		System.out.println("Artista       : " + super.getArtista());
		System.out.println("BOXES:");
		if (boxes.isEmpty())
			System.out.println("Sem boxes cadastrados.");
		else {
			for (int j = 0; j < boxes.size(); j++)
				System.out.println("Box " + (j + 1) + " :" + boxes.get(j).getTitulo());
		}
		System.out.printf("Preço          : R$ %.2f\n", super.getPreco());
		System.out.println("Status        : " + super.getStatus() + "\n");
	}

}

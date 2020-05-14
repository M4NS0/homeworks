import java.util.ArrayList;

public class ProdutoPerecivelEsp extends ProdutoPerecivel{

	
	protected ProdutoPerecivelEsp(int codigo, int quantidade, String descricao, String vencimento) {
		super(codigo, quantidade, descricao, vencimento);
		
	}
	
	public void imprime(ArrayList<ProdutoPerecivel> pereciveis, String nome) {
		
		for (int i = 0; i < pereciveis.size(); i++) {
			if (pereciveis.get(i).getDescricao().equalsIgnoreCase(nome)) {
				System.out.println("\n----Lista de Perecíveis----");
				System.out.println(" Descrição: " + pereciveis.get(i).getDescricao());
				System.out.println(" Descrição: " + pereciveis.get(i).getCodigo());
				System.out.println(" Descrição: " + pereciveis.get(i).getQuantidade());
				System.out.println(" Descrição: " + pereciveis.get(i).getData());
				System.out.println();
			} else {
				System.out.println(" Produto não encontrado!");
			}
			
			
		}
		
		
	}

}

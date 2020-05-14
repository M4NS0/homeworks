package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	private String razaoSocial;
	private List<Produto> listaProdutos;

	protected Mercado(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		listaProdutos = new ArrayList<Produto>();
	}

	public void verProdutos() {
		System.out.println("\n--------------Lista--------------\n");
		for (int i = 0; i < listaProdutos.size(); i++) {
			System.out.println(listaProdutos.get(i).getNome() + "\n");
		}
	}

	public void consultaValor(String nome) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (listaProdutos.get(i).getNome().equalsIgnoreCase(nome)) {
				System.out.println(" O valor de " + nome + " é de: " + listaProdutos.get(i).getValor());
			} else {
				System.out.println(" Produto não encontado!");
			}
		}
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}

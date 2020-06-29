/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigido;

import java.util.ArrayList;

/**
 *
 * @author anibal.jukemura
 */
public class Cinema implements Venda {
	private String nome;
	private int quantidade;
	private ArrayList<Ingresso> loteIngressos;

	public Cinema(String nome, int quantidade) {
		int i;
		this.nome = nome;
		this.quantidade = quantidade;
		this.loteIngressos = new ArrayList(this.quantidade);
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public ArrayList<Ingresso> getCadeiras() {
		return loteIngressos;
	}

	public void setQuantidade(int qtde) {
		this.quantidade = qtde;
	}

	int calcula(double tipo) {
		int total = 0, i;
		if (this.quantidade != 20) {
			for (i = 0; i < this.loteIngressos.size(); i++)
				if (loteIngressos.get(i).getValor() == tipo) {
					total++;
				}
			return total;
		}
		return 0;
	}

	@Override
	public void venderIngresso(Ingresso Ticket) {
		loteIngressos.add(Ticket);
		this.quantidade = this.quantidade - 1;
	}

}

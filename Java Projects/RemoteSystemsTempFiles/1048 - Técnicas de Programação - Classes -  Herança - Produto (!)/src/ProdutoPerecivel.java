
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProdutoPerecivel extends Produto {
	private Date data;

	protected ProdutoPerecivel(int codigo, int quantidade, String descricao, String vencimento) {
		super(codigo, quantidade, descricao);
		this.data = PegaVencimento(vencimento);

	}

	private Date PegaVencimento(String vencimento) {
		data = new Date();
		int diaVencimento, mesVencimento, anoVencimento;
		GregorianCalendar dataCal = new GregorianCalendar();
		dataCal.setTime(data);

		diaVencimento = Integer.parseInt(vencimento.substring(0, vencimento.indexOf("/")));
		vencimento = vencimento.substring(vencimento.indexOf("/") + 1, vencimento.length());
		mesVencimento = Integer.parseInt(vencimento.substring(0, vencimento.indexOf("/")));
		vencimento = vencimento.substring(vencimento.indexOf("/") + 1, vencimento.length());
		anoVencimento = Integer.parseInt(vencimento);
		data.setDate(diaVencimento);
		data.setMonth(mesVencimento);
		data.setYear(anoVencimento);
		return data;
	}

	public String CalculaVencimento(String desc, ArrayList<ProdutoPerecivel> estoque) {

		Date dataHoje = new Date();
		GregorianCalendar dataCal = new GregorianCalendar();
		dataCal.setTime(dataHoje);

		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).getDescricao().equalsIgnoreCase(desc)) {
				if (dataHoje.getYear() + 1900 > data.getYear() || dataHoje.getMonth() > data.getMonth()) {
					this.quantidade = 0;
					return " >> Produto " + descricao + " removido do estoque por estar vencido";
				}
				return " Produto com data de validade ok";
			}

		}
		return " Produto não encontrado!";

		
	}

	public String diminuiQuantidadePereciveis(int qt, String desc, ArrayList<Produto> estoque) {

		if (estoque.isEmpty()) {
			return " Estoque Vazio!";
		}
		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).getDescricao().equalsIgnoreCase(desc)) {
				if (estoque.get(i).getQuantidade() == 0) {
					return " Não é possivel retirar, não tem mais " + estoque.get(i).getDescricao() + " no estoque";
				}
				if (estoque.get(i).getQuantidade() < qt) {
					return " Quantidade a ser retirada é superior a quantidade em estoque ("
							+ estoque.get(i).getQuantidade() + " itens)";
				} else {
					estoque.get(i).setQuantidade(quantidade - qt);
					return estoque.get(i).getQuantidade() + " unidades de " + estoque.get(i).getDescricao()
							+ " no estoque";
				}

			}
		}
		return desc + " sem registro no estoque! ";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}

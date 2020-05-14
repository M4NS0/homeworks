package treino;

public class PacotePlus extends Pacote {
	protected Pacote pacote;

	protected PacotePlus(Pacote pacote, String descricao, double preco) {
		super(pacote.getDescricao() + "\n" + descricao + " (incluso)", pacote.getPreco() + preco);
		this.pacote= pacote;
	}

	
}

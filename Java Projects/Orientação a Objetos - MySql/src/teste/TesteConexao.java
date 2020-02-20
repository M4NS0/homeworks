package teste;

import java.util.ArrayList;

import dao.Conexao;
import dao.MarcaDao;
import modelo.Marca;

public class TesteConexao {

	public static void main(String[] args) {
		
		//Conexao.getConnection();
		
		/* Teste Inserir
		
		Marca m = new Marca();
		m.setNome("VW");
		m.setOrigem("Alemanha");
		
		MarcaDao.inserir(m);
		*/
		
		/* Teste Alterar 
		
		Marca m = new Marca();
		m.setNome("Toyota");
		m.setOrigem("Japão");
		m.setId(2);
		
		MarcaDao.alterar(m);
		
		*/
		
		/* Teste Excluir 
		
		boolean resultado = MarcaDao.excluir(3);
		if (resultado) {
			System.out.println("Marca excluída com sucesso!!!");
		}
		else {
			System.out.println("Erro ao excluir a Marca!!!");
		}
		
		*/
		
		ArrayList<Marca> lista = MarcaDao.listagem();
		for (Marca marca : lista) {
			System.out.println(marca.toString());
		}
		
	}

}

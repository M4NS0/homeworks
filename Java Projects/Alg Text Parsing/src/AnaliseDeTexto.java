import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnaliseDeTexto {

	static final String NOME_ARQ = "/home/linuxlite/Downloads/procuracao.txt";
	private static String text = "";
	private static String autor1;
	private static String pessoa;

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {
			text = text + "\n" + br.readLine();
		}
		// JOptionPane.showMessageDialog(null, "Leitura de Arquivo concluida com
		// sucesso");
		// System.out.println(text);
		br.close();
		fr.close();
		IniciaBusca();

	}

	private static void IniciaBusca() {
		Autor1(); // inicio da busca da parte ativa
		Pessoa();// inicio da busca por tipo de pessoa Id(); // inicio da busca por
		 
		 /*
		  * * cnpj ou cpf Endereco(); // inicio da busca por endereco Autor2(); // inicio
		 * da busca de outro autor Nacionalidade();
		 */
	}

	private static void Pessoa() {
		int index1 = 0;
		int index2 = 0;
		String word1 = "";
		String word2 = "";

		// lista para palavras antes da palavra de interesse
		List<String> palavraAntes = Arrays.asList("pessoa", "PESSOA");
		ArrayList<String> palavraA = new ArrayList<>();
		palavraA.addAll(palavraAntes);
		
		List<String> palavraDepois = Arrays.asList(". ");
		ArrayList<String> palavraD = new ArrayList<>();
		palavraD.addAll(palavraDepois);
		
		// laço para buscar palavra na lista
		for (int i = 0; i < palavraA.size(); i++) {
			if (text.contains(palavraA.get(i))) {
				word1 = palavraA.get(i);
				index1 = text.indexOf(word1);
			}
		
		}
		//System.out.println(index1);
	
		// laço para buscar a possivel palavra que encontra depois do nome
		for (int j = 0; j < palavraD.size(); j++) {
			if (text.contains(palavraD.get(j))) {
				word2 = palavraD.get(j); // pega a posicao do laco
				if (text.indexOf(word2) > text.indexOf(word1)) {
					index2 = text.indexOf(word2); // pega o index na posicao do laco
				}
				break;
			}
		}
		//System.out.println(index2);

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		String autor11 = text.substring(index1, index2);

		// cria lista com nome encontrado dividindo entre elementos so nome
		List<String> list = Arrays.asList(autor11.split(" "));
		List<String> listaNova = new ArrayList<String>();
		/*
		// trata capitalizacao do nome
		for (int l = 0; l < list.size(); l++) {
			String elemento = list.get(l);
			String letra = elemento.substring(0, 1).toUpperCase();
			String letras = letra + elemento.substring(1).toLowerCase();
			listaNova.add(letras);
		}
		*/
		listaNova.remove(0);

		// junta a lista em uma variavel de string chamada autor1
		pessoa = String.join(" ", listaNova);
		System.out.println(pessoa);

		// deletando parte ja usada do texto
		String deleteParticle = "";
		String partialDeleted = text.substring(0, index2);
		text = text.replace(partialDeleted, deleteParticle);

		// System.out.println(text);
		
	}

	public static void Autor1() {
		int index1 = 0;
		int index2 = 0;
		String word1 = "";
		String word2 = "";

		// lista para palavras antes da palavra de interesse
		List<String> palavraAntes = Arrays.asList("outorgante", "Outorgante", "OUTORGANTE");
		ArrayList<String> palavraA = new ArrayList<>();
		palavraA.addAll(palavraAntes);
		
		List<String> palavraDepois = Arrays.asList(". ");
		ArrayList<String> palavraD = new ArrayList<>();
		palavraD.addAll(palavraDepois);
		
		// laço para buscar palavra na lista
		for (int i = 0; i < palavraA.size(); i++) {
			if (text.contains(palavraA.get(i))) {
				word1 = palavraA.get(i);
				index1 = text.indexOf(word1);
			}
		
		}
		//System.out.println(index1);
	
		// laço para buscar a possivel palavra que encontra depois do nome
		for (int j = 0; j < palavraD.size(); j++) {
			if (text.contains(palavraD.get(j))) {
				word2 = palavraD.get(j); // pega a posicao do laco
				if (text.indexOf(word2) > text.indexOf(word1)) {
					index2 = text.indexOf(word2); // pega o index na posicao do laco
				}
				break;
			}
		}
		//System.out.println(index2);

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		String autor11 = text.substring(index1, index2);

		// cria lista com nome encontrado dividindo entre elementos so nome
		List<String> list = Arrays.asList(autor11.split(" "));
		List<String> listaNova = new ArrayList<String>();

		// trata capitalizacao do nome
		for (int l = 0; l < list.size(); l++) {
			String elemento = list.get(l);
			String letra = elemento.substring(0, 1).toUpperCase();
			String letras = letra + elemento.substring(1).toLowerCase();
			listaNova.add(letras);
		}
		listaNova.remove(0);

		// junta a lista em uma variavel de string chamada autor1
		autor1 = String.join(" ", listaNova);
		System.out.println(autor1);

		// deletando parte ja usada do texto
		String deleteParticle = "";
		String partialDeleted = text.substring(0, index2);
		text = text.replace(partialDeleted, deleteParticle);

		// System.out.println(text);
	}

	public static String getAutor() {
		return autor1;
	}

	public static void setAutor(String autor1) {
		AnaliseDeTexto.autor1 = autor1;
	}
	// fim da busca do autor1/Outorgante

}
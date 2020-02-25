import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnaliseDeTexto {

	static final String NOME_ARQ = "/home/linuxlite/Downloads/procuracao.txt";
	private static String text = "";
	private static String autor;
	private static String pessoa;
	private static String Id;

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
		Autor(); // inicio da busca da parte ativa
		Pessoa();// inicio da busca por tipo de pessoa
		Id(); // inicio da busca por cnpj ou cpf
	}

	public static void Autor() {
		int index1 = 0;
		int index2 = 0;
		String word2 = "";
		// lista para palavras parecidas com autor,outorgante etc
		List<String> listaDePalavras = Arrays.asList("PESSOA", "Pessoa", "pessoa");
		List<String> lista1 = Arrays.asList("outorgante", "Outorgante", "OUTORGANTE", "autor", "AUTOR", "autora",
				"AUTORA", "Autora");
		ArrayList<String> sinonimos = new ArrayList<>();
		sinonimos.addAll(lista1);

		// lista de palavras que podem conter no texto
		ArrayList<String> sinonimosOutros = new ArrayList<>();
		sinonimosOutros.addAll(listaDePalavras);

		// laço para buscar sinonimos na lista
		for (int i = 0; i < sinonimos.size(); i++) {
			if (text.contains(sinonimos.get(i))) {
				String word1 = sinonimos.get(i);
				index1 = text.indexOf(word1);
			}
		}
		// laço para buscar a possivel palavra que encontra depois do nome
		for (int j = 0; j < sinonimosOutros.size(); j++) {
			if (text.contains(sinonimosOutros.get(j))) {
				word2 = sinonimosOutros.get(j);
				index2 = text.indexOf(word2);
				break;
			}
		}

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		String autor1 = text.substring(index1 + index1, index2);

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		// String autor1 = text.substring(index1 + index1, index2);

		// remove virgulas
		if (autor1.contains(",")) {
			autor1 = autor1.replace(",", "");
		}

		// cria lista com nome encontrado dividindo entre elementos so nome
		List<String> list = Arrays.asList(autor1.split(" "));
		List<String> listaNova = new ArrayList<String>();

		// trata capitalizacao do nome
		for (int l = 0; l < list.size(); l++) {
			String elemento = list.get(l);
			String letra = elemento.substring(0, 1).toUpperCase();
			String letras = letra + elemento.substring(1).toLowerCase();
			listaNova.add(letras);
		}

		// junta a lista em uma variavel de string chamada autor
		autor = String.join(" ", listaNova);
		System.out.println(autor);
	}

	public static String getAutor() {
		return autor;
	}

	public static void setAutor(String autor) {
		AnaliseDeTexto.autor = autor;
	}
	// fim da busca do autor/Outorgante

	private static void Pessoa() {
		int index1 = 0;
		int index2 = 0;
		String word2 = "";
		// lista para palavras parecidas com autor,outorgante etc
		List<String> listaDePalavras = Arrays.asList("INSCRITO", "Inscrito", "inscrito", "INSCRITA", "Inscrita",
				"inscrita");
		List<String> lista1 = Arrays.asList("FISICA", "FÍSICA", "Fisica", "Física", "fisica", "JURIDICA", "JURÍDICA",
				"juridica", "jurídica");
		ArrayList<String> sinonimos = new ArrayList<>();
		sinonimos.addAll(lista1);

		// lista de palavras que podem conter no texto
		ArrayList<String> sinonimosOutros = new ArrayList<>();
		sinonimosOutros.addAll(listaDePalavras);

		// laço para buscar sinonimos na lista
		for (int i = 0; i < sinonimos.size(); i++) {
			if (text.contains(sinonimos.get(i))) {
				String word1 = sinonimos.get(i);
				index1 = text.indexOf(word1);
			}
		}

		// laço para buscar a possivel palavra que encontra depois do nome
		for (int j = 0; j < sinonimosOutros.size(); j++) {
			if (text.contains(sinonimosOutros.get(j))) {
				word2 = sinonimosOutros.get(j);
				index2 = text.indexOf(word2);
				break;
			}
		}

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		String pessoa1 = text.substring(index1, index2);

		// remove virgulas
		if (pessoa1.contains(",")) {
			pessoa1 = pessoa1.replace(",", "");
		}

		// cria lista com nome encontrado dividindo entre elementos so nome
		List<String> list = Arrays.asList(pessoa1.split(" "));
		List<String> listaNova = new ArrayList<String>();

		// trata capitalizacao do nome
		for (int l = 0; l < list.size(); l++) {
			String elemento = list.get(l);
			String letra = elemento.substring(0, 1).toUpperCase();
			String letras = letra + elemento.substring(1).toLowerCase();
			listaNova.add(letras);
		}

		// junta a lista em uma variavel de string chamada autor
		pessoa = String.join(" ", listaNova);
		System.out.println(pessoa);

	}

	public static String getPessoa() {
		return pessoa;
	}

	public static void setPessoa(String pessoa) {
		AnaliseDeTexto.pessoa = pessoa;
	}

	private static void Id() {
		int index1 = 0;
		int index2 = 0;
		String word2 = "";
		// lista para palavras parecidas com autor,outorgante etc
		List<String> listaDePalavras = Arrays.asList("CNPJ ", "cnpj ", "CNPJ/MF n°", "CNPJ/MF N°", "CNPJ/MF numero",
				"CNPJ/MF número", "CNPJ/MF NUMERO", "CNPJ/MF NÚMERO", "CNPJ n°", "CNPJ N°", "CNPJ numero",
				"CNPJ número", "CNPJ NUMERO", "CNPJ NÚMERO", "CPF ", "cpf ", "CPF n°", "CPF N°", "CPF numero",
				"CPF número", "CPF NUMERO", "CPF NÚMERO");

		List<String> lista1 = Arrays.asList("SEDIADO", "sediado", "que reside", "QUE RESIDE", "localizado",
				"LOCALIZADO", "localizada", "LOCALIZADA");
		
		ArrayList<String> sinonimos = new ArrayList<>();
		sinonimos.addAll(lista1);

		// lista de palavras que podem conter no texto
		ArrayList<String> sinonimosOutros = new ArrayList<>();
		sinonimosOutros.addAll(listaDePalavras);

		// laço para buscar sinonimos na lista
		for (int i = 0; i < sinonimos.size(); i++) {
			if (text.contains(sinonimos.get(i))) {
				String word1 = sinonimos.get(i);
				index1 = text.indexOf(word1);
			}
		}

		// laço para buscar a possivel palavra que encontra depois do nome
		for (int j = 0; j < sinonimosOutros.size(); j++) {
			if (text.contains(sinonimosOutros.get(j))) {
				word2 = sinonimosOutros.get(j);
				index2 = text.indexOf(word2);
				break;
			}
		}

		// cria variavel com o nome entre a primeira palavra e a palavra depois do nome
		String pessoa1 = text.substring(index1, index2);

		// remove virgulas
		if (pessoa1.contains(",")) {
			pessoa1 = pessoa1.replace(",", "");
		}

		// cria lista com nome encontrado dividindo entre elementos so nome
		List<String> list = Arrays.asList(pessoa1.split(" "));
		List<String> listaNova = new ArrayList<String>();

		// trata capitalizacao do nome
		for (int l = 0; l < list.size(); l++) {
			String elemento = list.get(l);
			String letra = elemento.substring(0, 1).toUpperCase();
			String letras = letra + elemento.substring(1).toLowerCase();
			listaNova.add(letras);
		}

		// junta a lista em uma variavel de string chamada autor
		Id = String.join(" ", listaNova);
		System.out.println(Id);

	}
	// fim da busca do tipo de pessoa
}
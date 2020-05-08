package listaEncadeadaOrdenada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GerArquivo {

	static final String NOME_ARQ = "contatos.txt";

	public static void lerArquivo(Lista list) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);

		while (br.ready()) {
			String linha = br.readLine(); // leu linha
			String dados[] = linha.split(","); // dividiu por ','
			Pessoa p = new Pessoa(dados[0], dados[1], (dados[2])); // inseriu novo objeto pessoa com os resp dados
			// System.out.println(p.getNome());

			list.adicionaOrdenado(p);
			// lista.add(p);
		}
		br.close();
		fr.close();
	}


	public static void gravarArquivo(Lista list) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, false);
		BufferedWriter bw = new BufferedWriter(fw);
		String str = list.imprima();
		bw.write(str);
		bw.close();
		fw.close();
	}

}

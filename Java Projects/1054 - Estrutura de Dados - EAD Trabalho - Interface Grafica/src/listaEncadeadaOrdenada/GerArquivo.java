package listaEncadeadaOrdenada;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GerArquivo {

	static final String NOME_ARQ = "contatos.txt";
	

	public static void lerArquivo(Lista list) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);
		FrmContatosLista lista = new FrmContatosLista();
		ArrayList<Pessoa> l = new ArrayList<Pessoa>();

		while (br.ready()) {
			String linha = br.readLine(); // leu linha
			String dados[] = linha.split(","); // dividiu por ','
			Pessoa p = new Pessoa(dados[0], dados[1], (dados[2])); // inseriu novo objeto pessoa com os resp dados
			list.adicionaOrdenado(p);
			l.add(p);
			
			}
		System.out.println(list.imprima());
		lista.setLista(l);
		br.close();
		fr.close();
	}

	public static void gravarArquivo(Lista list, boolean manterArq) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, manterArq);
		BufferedWriter bw = new BufferedWriter(fw);
		String aux = list.imprima();
		bw.write(aux);
		bw.close();
		fw.close();
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
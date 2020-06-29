/*
============================================================================

Instituição     : Pontifícia Universidade Católica de Goiás
Departamento    : Escola de Ciências Exatas e da Computação
Curso           : Análise e Desenvolvimento de Sistemas
Matéria         : Estrutura de Dados
Professor       : José Olímpio Ferreira
Período         : Segundo
Avaliação       : Trabalho EAD / N2
Título          : Agenda em Lista Encadeada e Ordenada
Autor           : Bruno Camargo Manso
Descrição       : Responsável por fazer ações de Ler e Salvar os dados 
                  computados no programa em um arquivo de  texto. Isso 
                  irá garantir que os  dados  não  se  percam  a  após 
                  finalização do programa e que sejam lidos  assim que 
                  o programa reinicia.


============================================================================
*/

package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GerArquivo {

	static final String NOME_ARQ = "contatos.txt";
	
	
	public static Lista lerArquivo(Lista list) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(NOME_ARQ);
		BufferedReader br = new BufferedReader(fr);
		Programa lista = new Programa();
		ArrayList<Pessoa> arrayPessoas = new ArrayList<Pessoa>();

		while (br.ready()) {
			String linha = br.readLine();                          // Lê linha
			String dados[] = linha.split(",");                     // Divide por ','
			Pessoa p = new Pessoa(dados[0], dados[1], (dados[2])); // Insere novo Objeto Pessoa com os dados vindos do arquivo
			list.adicionaOrdenado(p);                              // Adiciona Objeto Pessoa na Lista ( encadeada )
			arrayPessoas.add(p);                                   // Adiciona Objeto Pessoa em um ArrayList pada ppular a JTable
			
			}
		
		// System.out.println(list.imprima());                     // Debug
		lista.setLista(arrayPessoas);                              // Popula JTable com ArrayList
		br.close();
		fr.close();
		return list;
	}

	public static void gravarArquivo(Lista list, boolean manterArq) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, manterArq);       // Pega arquivo por nome e decide se vai sobrepor o arquivo ou adicionar
		BufferedWriter bw = new BufferedWriter(fw);                
		String aux = list.imprima();                               // Pega todos os dados em Lista ligada e transforma em uma String
		bw.write(aux);                                             // Escreve a String de dados no arquivo
		bw.close();
		fw.close();
	}
	
	public static void gravarArquivo(Lista list) throws IOException {
		FileWriter fw = new FileWriter(NOME_ARQ, false);
		BufferedWriter bw = new BufferedWriter(fw);
		String str = list.imprima();                               // Pega todos os dados em Lista ligada e transforma em uma String
		bw.write(str);                                             // Escreve a String de dados no arquivo
		bw.close();
		fw.close();
	}

	public static String getNomeArq() {
		return NOME_ARQ;
	}
}


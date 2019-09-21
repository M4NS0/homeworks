package sorter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class sorter {

	public static void main(String[] args) throws IOException {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> listadeLinha = new ArrayList<>();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n- Carregando arquivo .csv, aperte <ENTER>");
		leia.nextLine();
		String arquivo = "/home/linuxlite/Documents/Banco.csv";
		String separaLinha = "";
		String separaPor = ",";
		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		separaLinha = br.readLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Lendo o Arquivo e isolando itens separados por virgulas, aperte <ENTER>");
		leia.nextLine();
		String primeiraLinha = separaLinha;
				
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Reconhecendo tipo dos itens apanhados na primeira linha, aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- A primeira linha é do tipo: " + primeiraLinha.getClass() + ", aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Dividindo itens do cabeçalho pelas virgulas, aperte <ENTER>");
		leia.nextLine();
		String[] headers = primeiraLinha.split(separaPor);
	
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		ArrayList<String> listaHeaders = new ArrayList<String>();
		System.out.println("- Array de Headers criado com sucesso: " + listaHeaders + ", aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Adicionando itens ao Array 'listaHeaders', aperte <ENTER>");
		leia.nextLine();
		
		String header = br.readLine();
		if (header != null) {
            String[] columns = header.split(",");
			listaHeaders.add(primeiraLinha);
		}
		System.out.println("- Imprimindo Cabeçalho: \n\n" + primeiraLinha);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Mostrando todo o Array de cabeçalho criado, aperte <ENTER>");
		leia.nextLine();
		System.out.println(listaHeaders);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n- Isolando o primeiro item do Array de cabeçalho: '" + headers[0] + "', aperte <ENTER>");
		leia.nextLine();
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando variavel A1 contendo o item " + headers[0] + "', aperte <ENTER>");
		leia.nextLine();
		String A1 = headers[0];
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Isolando o segundo item do Array de cabeçalho: '" + headers[1] + "', aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando variavel B1 contendo o item " + headers[1] + "', aperte <ENTER>");
		leia.nextLine();
		String B1 = headers[1];
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Isolando o terceiro item do Array de cabeçalho: '" + headers[2] + "', aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando variavel C1 contendo o item " + headers[2] + "', aperte <ENTER>");
		leia.nextLine();
		String C1 = headers[2];
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando variavel 'leitor', aperte <ENTER>");
		leia.nextLine();
		BufferedReader leitor;
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		int j = 0;

		try {
			System.out.println("- Criando variavel 'linha', aperte <ENTER>");
			leia.nextLine();
			String linha;
			
			/////////////////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("- Adicionando arquivo .csv na variável 'leitor', aperte <ENTER>");
			leia.nextLine();
			leitor = new BufferedReader(new FileReader(arquivo));
		
			/////////////////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("- Criando laço de repetição enquanto as linhas estiverem preenchidas, "+ "\n    ler a linha, caso contrário parar, aperte <ENTER>");
			leia.nextLine();
			
			/////////////////////////////////////////////////////////////////////////////////////////////////////////

			while ((linha = leitor.readLine()) != null) {
				listadeLinha.add(linha);
			}
			leitor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("- Variavel 'listadeLinha' contendo as linhas do arquivo foi criada, aperte <ENTER>");
		leia.nextLine();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
				
		System.out.println("- Criando ArrayList 'listaMotivosTotal' com dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaMotivosTotal = new ArrayList<String>();

		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i);
			String[] dadosCortados = data.split(",");

			if (data != null) {

				listaMotivosTotal.add(dadosCortados[2] + "\n");	
			}	
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando ArrayList de '" + C1 + "' sem dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaMotivos = (ArrayList<String>) listaMotivosTotal.stream().distinct().collect(Collectors.toList());
		System.out.println("- Removendo cabeçalho '" + C1 + "', aperte <ENTER>");
		leia.nextLine();
		listaMotivos.remove(0);
		System.out.println("Imprimindo Array " + C1 + ":\n");
		System.out.println(listaMotivos);
		System.out.println("Tamanho da lista de " + C1 + " é: " + listaMotivos.size());

		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando ArrayList '" + B1 + "' com dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaTurmaTotal = new ArrayList<String>();

		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i);
			String[] dadosCortados = data.split(",");

			if (data != null) {

				listaTurmaTotal.add(dadosCortados[1] + "\n");
			}
		}
		System.out.println("- Criando ArrayList '" + B1 + "' sem dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaTurma = (ArrayList<String>) listaTurmaTotal.stream().distinct().collect(Collectors.toList());
		System.out.println("- Removendo cabeçalho de 'listaTurma', aperte <ENTER>");
		leia.nextLine();
		listaTurma.remove(0);
		System.out.println("Imprimindo Array '" + B1 + "': \n");
		System.out.println(listaTurma);
		System.out.println("Tamanho da lista '" + B1 + "' é: " + listaTurma.size());
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando ArrayList '" + A1 + "' com dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaDatasTotais = new ArrayList<String>();

		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i);
			String[] dadosCortados = data.split(",");

			if (data != null) {

				listaDatasTotais.add(dadosCortados[0] + "\n");
			}
		}
		
		System.out.println("- Criando ArrayList  '" + A1 + "' sem dados duplicados, aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> listaDatas = (ArrayList<String>) listaDatasTotais.stream().distinct().collect(Collectors.toList());
		System.out.println("- Removendo cabeçalho de 'listaDatas', aperte <ENTER>");
		leia.nextLine();
		listaDatas.remove(0);
		System.out.println("Imprimindo Array  '" + A1 + "' \n");
		System.out.println(listaDatas);
		System.out.println("Tamanho da lista '" + A1 + "' é: " + listaDatas.size());

		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Criando ArrayList 'motivo1' para agrupar dados que contem o motivo: "+ listaMotivos.get(8) + "Aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> motivo1 = new ArrayList<String>();
		
		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i) + "\n";

			if (data.contains("falecimento")) {

				motivo1.add(data);
				j++;
			}
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("- Imprimindo conteúdo da lista que contem: "+ listaMotivos.get(8) + "Aperte <ENTER>");
		leia.nextLine();
		System.out.println(motivo1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n- Imprimindo quantidade de ocorrências contidas em: "+ listaMotivos.get(8) + "Aperte <ENTER>");
		leia.nextLine();
		System.out.println("Ocorrências: " + j);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n- Isolando " + A1 + " e " + C1 + ", aperte <ENTER>");
		leia.nextLine();
		ArrayList<String> A1C1 = new ArrayList<String>();

		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i);
			String[] dadosCortados = data.split(",");

			if (data.contains("falecimento")) { 
				// TODO: implementar aqui uma variavel no lugar da string acima entre aspas, listaMotivos.get(18) nao funcionou
				
				A1C1.add(dadosCortados[0] + " - \t" + dadosCortados[2] + "\n");
			}
		}
		
		System.out.println(A1C1);
		System.out.println("Aqui já é possivel gerar gráfico entre " + A1 + " e " + C1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("\n- Isolando " + C1 + " e " + B1 + ", aperte <ENTER>");
		leia.nextLine();

		ArrayList<String> B1C1 = new ArrayList<String>();

		for (int i = 0; i < listadeLinha.size(); i++) {

			String data = listadeLinha.get(i);
			String[] dadosCortados = data.split(",");

			if (data.contains("falecimento")) {
				// TODO: implementar aqui uma variavel no lugar da string acima entre aspas, listaMotivos.get(18) nao funcionou

				B1C1.add(dadosCortados[2] + " - \t" + dadosCortados[1] + "\n");
			}
		}
		
		System.out.println(B1C1);
		System.out.println("Aqui já é possivel gerar gráfico entre " + C1 + " e " + B1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////

		
	}
}

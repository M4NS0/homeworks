/* 

Paths para banco de dados:
/home/linuxlite/Documents/Banco.csv
/home/linuxlite/Workspaces/Shell Projects/Autorais/Logger para aula de estatistica/Registro.csv


*/		

package Teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Principal.*;
import Tratamento.*;

import Tratamento.*;

public class RodaTeste {

	public static void main(String[] args) throws FileNotFoundException {

		String arq = JOptionPane.showInputDialog("insira o caminho do arquivo .CSV");
		
		LerCabecalho leitura = new LerCabecalho();
		leitura.setBr(new BufferedReader(new FileReader(arq)));
			
		// System.out.println(leitura);
		
		ArrayList<LerCabecalho> cabeçalho = new ArrayList<LerCabecalho>();
		cabeçalho.add(leitura);

		System.out.println(cabeçalho);
		
		IsolaItensCabecalho isola1 = new IsolaItensCabecalho();
		isola1.setSeparaLinha("");
		isola1.setSeparaPor(",");
		
		
				
	

		
		
		
		
		
	
	}
}

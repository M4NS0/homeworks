package mysql;

import java.util.ArrayList;

public class ConstrutorParaOArquivo {
	public ConstrutorParaOArquivo(ArrayList<String> arrayList,int tamanhoColuna) {
		String[] cadaElemento = new String[tamanhoColuna];
		for (int i = 0; i < cadaElemento.length; i++) {
			for (int j = tamanhoColuna; j < arrayList.size(); j++) {
				cadaElemento[i] = arrayList.get(j);
			}
		}
	}

}

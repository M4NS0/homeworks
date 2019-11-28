package interfaces1;

import java.util.ArrayList;

public class TesteInterface {
	public static void main(String args[]) {
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Bruno");
		p1.setNascimento("30/10/1980");
		p1.setEndereço("Setor Jaó");
		
		lista.add(p1);
		
		ArrayList<Triatleta> listaTri = new ArrayList<Triatleta>();
		Triatleta t1 = new Triatleta();
		t1.setNome("Fulanis");
		t1.setNascimento("10/10/2000");
		t1.setEndereço("Setor Coimbra");
		listaTri.add(t1);
		t1.alongar();
		t1.aquecer();
		t1.competir();
		t1.correr();
		t1.nadar();
		t1.correrDeBicicleta();
		
		
		Triatleta t2 = new Triatleta();
		t2.setNome("Cicranis");
		t2.setNascimento("10/11/2002");
		t2.setEndereço("Setor Jaó");
		listaTri.add(t2);
		t2.alongar();
		t2.aquecer();
		t2.competir();
		t2.correr();
		t2.nadar();
		t2.correrDeBicicleta();
		
		for (int i = 0; i < listaTri.size(); i ++) {
			System.out.println(listaTri.get(i).nome.concat(" " +listaTri.get(i).getNascimento()).concat(" " +listaTri.get(i).getEndereço()));
			
		}
		
	}
}

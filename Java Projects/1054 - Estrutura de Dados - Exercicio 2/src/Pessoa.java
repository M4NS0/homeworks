
import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	String matricula;
	String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	public String getPessoa () {
	
		nome = JOptionPane.showInputDialog("\nDigite o nome: \n");
		matricula = JOptionPane.showInputDialog("\nDigite a matrícula: \n");
		telefone = JOptionPane.showInputDialog("\nDigite o telefone: \n" );
		
		String aux = nome + "\n" + matricula + "\n" + telefone + "\n";
		
		return aux;
		
	}
	
}


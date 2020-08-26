package administrativo;


import javax.swing.JOptionPane;

public class Diretor extends Profissional implements DominioAdm{


	public void organizarTarefas() {
		JOptionPane.showMessageDialog(null, "O diretor est� organizando as Tarefas!");
	}


	public void designarCargos() {
		JOptionPane.showMessageDialog(null, "O diretor est� designando os cargos da empresa!");
	}


	public void contratarFuncionarios(int qtde, String cargo) {
		JOptionPane.showMessageDialog(null, "O diretor est� contratando novos funcion�rios!");
	}
	

	public String toString() {
		return "Diretor: " + super.toString();
	}

}

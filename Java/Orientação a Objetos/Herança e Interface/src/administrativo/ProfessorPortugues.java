package administrativo;


import javax.swing.JOptionPane;

public class ProfessorPortugues extends Profissional implements DominioPortugues {

	public void redigirRedacao() {
		JOptionPane.showMessageDialog(null, "O Professor de Portugu�s est� redigindo uma Redacao!");
	}


	public void revisarTextos() {
		JOptionPane.showMessageDialog(null, "O Professor de Portugu�s est� revisando Textos!");
	}
	
	@Override
	public String toString() {
		return "Professor de Portugu�s: " + super.toString();
	}

}

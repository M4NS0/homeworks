package administrativo;


import javax.swing.JOptionPane;

public class ProfessorCompleto extends Profissional
		implements DominioInformatica, DominioPortugues, DominioMatematica {

	
	public void realizarCalculos() {
		JOptionPane.showMessageDialog(null, "teste realizarCalculos");
	}

	
	public void redigirRedacao() {
		JOptionPane.showMessageDialog(null, "teste redigirRedacao");

	}


	public void revisarTextos() {
		JOptionPane.showMessageDialog(null, "teste revisarTextos");

	}


	public void formatarComputador() {
		JOptionPane.showMessageDialog(null, "teste formatarComputador");

	}


	public void treinarUsuario() {
		JOptionPane.showMessageDialog(null, "teste treinarUsuario");

	}
	@Override
	public String toString() {
		return "Professor Completo: " + super.toString();
	}

}

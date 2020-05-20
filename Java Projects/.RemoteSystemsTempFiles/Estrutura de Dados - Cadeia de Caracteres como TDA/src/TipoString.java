import javax.swing.JOptionPane;

public class TipoString {

	public static void main(String[] args) {
		String S;
		String P;
		String Saida = "";
		
		S = JOptionPane.showInputDialog("Digite uma frase: ");
		P = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		if (S.indexOf(P) != -1)
			Saida += "A palavra " + P + " existe na frase";
		else 
			Saida += "A palavra " + P + " não existe na frase";
		
		JOptionPane.showMessageDialog(null, Saida, "A palavra " + P + " existe?", JOptionPane.PLAIN_MESSAGE);
	}

}


public class Pessoa {
	private String nome;
	private String matricula;
	private String telefone;

	public Pessoa (String pNom, String pMat, String pTel) {
		nome = pNom;
		matricula = pMat;
		telefone = pTel;
	}

	@Override
	public String toString () {
		return (nome + "\n" + matricula + "\n" + telefone + "\n");
	}
}

package entrega;
import java.util.ArrayList;

public class Psicologo extends Funcionario {
	private int CRP;
	private ArrayList<Consulta> agenda;

	public Psicologo(String nome, String codigo, int CRP, ArrayList<Consulta> agenda) {
		super(nome, codigo);
		this.CRP = CRP;
		this.agenda = agenda;
	}

	public int getCRP() {
		return CRP;
	}

	public ArrayList<Consulta> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Consulta> agenda) {
		this.agenda = agenda;
	}

}

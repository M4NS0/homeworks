package entrega;
import java.util.ArrayList;

public class Medico extends Funcionario {
	private int CRM;
	private ArrayList<Consulta> agenda;

	public Medico(int CRM, ArrayList<Consulta> agenda, String nome, String codigo) {
		super(nome, codigo);
		this.CRM = CRM;
		this.agenda = agenda;

	}

	protected int getCRM() {
		return CRM;
	}

	public ArrayList<Consulta> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Consulta> agenda) {
		this.agenda = agenda;
	}

}

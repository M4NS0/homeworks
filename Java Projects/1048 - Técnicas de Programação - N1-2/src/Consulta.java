
public class Consulta {
	private String paciente;
	private String hora;
	public Consulta () {
		
	}
	protected Consulta(String paciente, String hora) {
		this.paciente = paciente;
		this.hora = hora;
	}

	public String getPaciente() {
		return paciente;
	}

	public String getHora() {
		return hora;
	}
	
	
	
}

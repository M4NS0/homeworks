package Funcionarios;

public class AssistenteAdministrativo extends AssistenteTecnico {
		private String turno;
		
		public AssistenteAdministrativo(String nome, String cpf, String matricula, String turno) {
			super(nome, cpf, matricula);
			this.turno = turno;
		}
		
		public void imprimir() {
			System.out.println( "- Assistente Administrativo\n " 
					+           "      Nome: " + getNome() + "\n" 
					+			"        CPF: " + getCpf() + "\n" 
					+ 			"  Matricula: " + getMatricula() + "\n"
					+           "      Turno: " + turno + "\n");
		}
		public String getTurno() {
			return turno;
		}
		public void setTurno(String turno) {
			this.turno = turno;
		}
		

}

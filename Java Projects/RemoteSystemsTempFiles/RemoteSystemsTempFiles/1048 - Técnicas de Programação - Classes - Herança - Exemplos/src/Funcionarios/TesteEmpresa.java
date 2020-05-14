package Funcionarios;

public class TesteEmpresa {

	public static void main(String[] args) {
		AssistenteTecnico tecnico = new AssistenteTecnico("Adamastor", "666.666.666-69", "6669666");
		tecnico.setBonus(3.000);
		AssistenteAdministrativo administrativo = new AssistenteAdministrativo("Atanagildo", "024.024.024-24", "240240240", "Noturno");
		
		tecnico.imprimir();
		administrativo.imprimir();
		

	}

}
package br.com.cadastros.old;

import br.com.cadastros.modelo.Cargo;

public class TesteCargoDao {
	public static void main(String[] args) {
		
		String nome = "diretor";
		Cargo cargo = new Cargo();
		cargo.setNomeCargo(nome);
		
		// Adicionando novo cargo
		CargoDao.adicionaCargo(cargo);
		// Inserindo id correspondente ao id do banco de dados
		// Retornando ultimo ID
		cargo.setIdCargo(CargoDao.retornaUltimoId());

		
		// Alterando cargo
		String novoNome = "Diretor";
		cargo.setNomeCargo(novoNome);
		CargoDao.alterarCargo(cargo, CargoDao.retornaUltimoId());
		
		// Exclui cargo
		//cargoDao.excluirCargo(cargoDao.retornaUltimoId());
		
		// Lista Cargos
		for (int i = 0; CargoDao.listaCargos().size() > i; i++) {
			System.out.println("  ID: " + CargoDao.retornaUltimoId());
			System.out.println("Nome: " + CargoDao.listaCargos().get(i).getNomeCargo());
		}
		
		// Retorna por ID
		Cargo novoCargo = new Cargo();
		novoCargo = CargoDao.retornaPorId(CargoDao.retornaUltimoId());
		System.out.println("Retornando por ID -> " + novoCargo.getNomeCargo());
		
		
	}
}

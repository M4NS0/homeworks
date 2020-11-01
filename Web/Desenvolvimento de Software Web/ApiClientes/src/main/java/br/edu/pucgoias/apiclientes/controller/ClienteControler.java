package br.edu.pucgoias.apiclientes.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.edu.pucgoias.apiclientes.model.Cliente;
import br.edu.pucgoias.apiclientes.repository.ClienteRepository;
import br.edu.pucgoias.apiclientes.services.ClienteServices;

																			// Api recebe um endpoint e faz com q a api direcione para o método certo
																			// Pra onde é chamado as chamadas de endpoint
																			// Mapeia as rotas
															 				// Permite retornar informações apresentadas em uma view. 
																			// Retorna ou uma resposta JSon ou uma resposta XML
@RestController																// Recebe dados de clientes via JSon
@RequestMapping("/clientes") 
public class ClienteControler {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteServices clienteService;
	
																			// Essem metodo vai ser acessado pelo getMapping, 
	@GetMapping 															// pegando o /clientes direcionando pra ele
	public List<Cliente> listar() {
		return clienteRepository.findAll(); 								// Retorna um array list
	}																		// Retorna coleção de objetos no formato json
																			// sem a necessidade de usar o Gson
	
																			// usa o clienteID dessa vez, passa um parametro pra ele
																			// o endipoint sera /clientesId
	@GetMapping("/{clienteId}") 											// consulta o cliente pelo codigo
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) { 	// passa variavel pelo caminho
		
		Optional<Cliente> cliente = clienteRepository.findById(clienteId);  // Retorna opcionalmente o objeto, quando houver o cliente com o código passado
																			// pesquisar JPQL que é usado dentro do hibernate, que não usa as classes
		if (cliente.isPresent()) {											// se achou retorna o método Response entity com ok de resposta
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();							// se não, retorna um não encontrado
	}
	
	@PostMapping															// Busca o tipo de ação
	@ResponseStatus(HttpStatus.CREATED)										// cria um novo registro
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {			// passado pelo @RequestMapping
																			// Valida variável no path no corpo onde esta o obj passado
		return clienteService.salvar(cliente);								// método dentro do jpa repository
	}
	
	@PutMapping("/{clienteId}")												// Passa um cógigo para alterar /clientes + /código
	public ResponseEntity<Cliente> atualizar(@Valid @PathVariable 			// Valida variável no path no corpo onde esta o obj passado
			Long clienteId, @RequestBody Cliente cliente) {
		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		cliente.setId(clienteId);
		cliente = clienteService.salvar(cliente);
		
		return ResponseEntity.ok(cliente);
		
	}
	@DeleteMapping("/{clienteId}")											// Chamado com / cliente + /código exclui o cliente
	public ResponseEntity<Void> remover (@PathVariable Long clienteId) {
		if(!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		clienteService.excluir(clienteId);
		return ResponseEntity.noContent().build();
	}
}

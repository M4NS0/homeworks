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

// api recebe um endpoint e faz com q a api direcione para o método certo
// pra onde é chamado as chamadas de endpoint

@RestController // Permite retornar informações apresentadas em uma view. 
				// Retorna ou uma resposta JSon ou uma resposta XML
				// Recebe dados de clientes via JSon

@RequestMapping("/clientes") 
public class ClienteControler {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteServices clienteService;
	
	@GetMapping // Essem metodo vai ser acessado pelo getMapping, pegando o /clientes direcionando pra ele
	public List<Cliente> listar() {
		return clienteRepository.findAll(); // retorna array list
											// retorna coleção de objetos json
	}
	
	@GetMapping("/{clienteId}") // usa o clienteID dessa vez, passa um parametro pra ele,  o endipoint sera /clientesId
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
		Optional<Cliente> cliente = clienteRepository.findById(clienteId);
		
		if (cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@PutMapping("/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@Valid @PathVariable Long clienteId,
			@RequestBody Cliente cliente) {
		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		cliente.setId(clienteId);
		cliente = clienteService.salvar(cliente);
		
		return ResponseEntity.ok(cliente);
		
	}
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Void> remover (@PathVariable Long clienteId) {
		if(!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		clienteService.excluir(clienteId);
		return ResponseEntity.noContent().build();
	}
	
	
}

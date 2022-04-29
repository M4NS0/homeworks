package br.edu.pucgoias.apiclientes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.pucgoias.apiclientes.exception.NegocioException;
import br.edu.pucgoias.apiclientes.model.Cliente;
import br.edu.pucgoias.apiclientes.repository.ClienteRepository;

@Service // fornece ao spring a informação que essa estrutura mantém uma lógica de negócios
public class ClienteServices {
	
													// Injeção de Dependência 
	@Autowired 										// Faz com que o objeto da classe indicada seja criado na memória sem a necessidade de utilizar o new. 
	private ClienteRepository clienteRepository;	// Está sendo usado como um atributo
													// Vem da interface. Não precisa de new Object(), menos acoplamento na classe. 
													// Pode ser utilizada em propriedades, construtores e métodos (mais usados em setters)
	
	public Cliente salvar(Cliente cliente) {
		
		// apanha email no banco de dados
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		// Compara clientes que estao sendo passados com clientes do banco de dados
		if (clienteExistente != null && !clienteExistente.equals(cliente)) {
			// pára execução e manda a mensagem pra quem chamou
			throw new NegocioException("Já existe um cliente cadastrado com esse E-Mail"); 
		}
		// Ou é um cliente novo ou esta atualizando o cliente, 
		// Se for 0, ele é novo, se não ele é velho e deve ser atualizado
		return clienteRepository.save(cliente);
	}
		// Passa o cliente id, vai no cliente repository e deleta pelo id
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
}

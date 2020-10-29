package br.edu.pucgoias.apiclientes.exception;

public class NegocioException extends RuntimeException {
	private static final long serialVersionUID = 1L; // alocação de memória, endereçamento, rede etc

	public NegocioException(String message) {
		super(message);
	}
}

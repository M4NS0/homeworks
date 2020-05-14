/*
============================================================================

Instituição     : Pontifícia Universidade Católica de Goiás
Departamento    : Escola de Ciências Exatas e da Computação
Curso           : Análise e Desenvolvimento de Sistemas
Matéria         : Estrutura de Dados
Professor       : José Olímpio Ferreira
Período         : Segundo
Avaliação       : Trabalho EAD / N2
Título          : Agenda em Lista Encadeada e Ordenada
Autor           : Bruno Camargo Manso
Descrição       : A  classe define os  atributos que serão armazenados 
                  dentro de um Objeto do tipo Pessoa. Os atributos são 
                  do tipo String: nome, telefone e endereço.

============================================================================
*/

package agenda;

public class Pessoa {

	private String nome;
	private String telefone;
	private String endereco;

	public Pessoa() {
	}
	public Pessoa(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return nome + "," + telefone + "," + endereco + "\n";
	}
}

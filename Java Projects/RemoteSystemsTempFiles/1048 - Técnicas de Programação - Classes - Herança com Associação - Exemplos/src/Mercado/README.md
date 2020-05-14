	
	
	Departamento de Computação
	Disciplina: Técnicas de Programação I (CMP 1048)
	Prof. MSc. Anibal Santos Jukemura
	Exercícios: HERANÇA ÚNICA (SIMPLES) e Associações
	
	Exercício 01 - Crie um programa em Java que implemente a  classe  Produto  com  um  atributo  private 
	String nome e um atributo private double valor. Crie os getters e setters necessários e um construtor 
	com dois parâmetros: String nome e double valor. Crie  um  classe  Mercado  que  possua  um  atributo 
	private String RazaoSocial. Crie os getters e setters necessários. Sabe-se  que  um  Mercado  tem  “n” 
	Produtos (Associação). Utilize um ArrayList chamado listaProdutos como  atributo  privado  na  classe 
	Mercado e um método construtor de Mercado que inicialize a RazaoSocial (passado por parâmetro) e crie 
	o ArrayList (new). No programa principal peça ao usuário para entrar com o nome do mercado e inicialize 
	o objeto chamado “superZe”do tipo Mercado com o nome fornecido. Peça ao usuário o cadastro de cada 
	produto na lista de produtos através de um método público addProduto da classe Mercado que recebe 
	como parâmetro o objeto Produto. Crie um método verProdutos na classe Mercado, para listar os produtos 
	cadastrados através do programa principal. Crie um método consultaValor na classe Mercado que recebe 
	como parâmetro, o nome do produto a ser consultado. Para testar o programa, crie a funcionalidade do 
	seguinte menu:
	
	1 – Adiciona Produto
	2 – Ver Produtos
	3 – Consulta Valor
	4 – Sair
	
	
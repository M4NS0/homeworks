	Exercício 2 - Crie um programa em Java que apresente a superclasse POKEMON  com um  atributo 
	privado NOME do tipo STRING e um atributo privado PONTOSDEVIDA do tipo INTEGER e um atributo 
	privado DANO do tipo INTEGER. Crie os métodos get/set correspondentes  aos  atributos.  Crie 
	um método aplicaGolpe com um parâmetro STRING NOME e que  emita  uma  mensagem com  o uso do 
	parâmetro NOME: “NOME aplicou golpe.  Crie uma  subclasse  chamada  RAICHU.  Crie um  método 
	chamado aplicaGolpe  (como Override)  com  um  atributo  STRING  NOME,  que  chame o  método 
	aplicaGolpe daclasse POKEMON e  que  aplique  como  DANO  o  valor descrito  como na  tabela 
	a seguir, emitindo uma mensagem com o valor do  dano  aplicado. Crie uma  subclasse  PIKACHU
	da mesma forma  que  a  classe  RAICHU,  sabendo  que  um  PIKACHU  é  subclasse  de  RAICHU.
	Crie uma subclasse chamada RAPIDASH.  Crie um  método chamado  aplicaGolpe  (como  Override) 
	com um atributo STRING NOME, que chame o método aplicaGolpe da classe POKEMON e  que aplique
	como DANO o valor descrito como natabela a seguir, emitindo uma mensagem com o valor do dano 
	aplicado. Crie umasubclasse PONYTA da mesma forma  que a  classe RAPIDASH,  sabendo  que  um
	PONYTA é subclasse de RAPIDASH.
	
	DADOS DO POKEMON
	
	( ver tabela )
	
	Crie  construtores  para as  classes  PIKACHU,  RAICHU,  PONYTA e  RAPIDASH  inicializando os 
	atributos dano, nome e pontos de vida correspondentes conforme a tabela de dados  do  pokemon 
	fornecida anteriormente. Lembrando que os atributos estão  presentes  na  superclasse POKEMON.
	Todos os métodos definidos para essa hierarquia devem ser do tipo protegido. Para  o  programa 
	principal, crie um objeto (DO TIPO POKEMON) para cada uma das classes  definidas  no  programa 
	com os nomes conforme expostos na tabela, exceto para a superclasse  pokemon.  Crie  um  “loop 
	infinito” que simule ataques entre os pokemons, da seguinte forma: sorteie um número entre 1 e 
	2. Veja quem ataca conforme ID da tabela. Se for ID=1, Pikachu obrigatoriamente  ataca  Ponyta. 
	Se for ID=2, obrigatoriamente, Raichu ataca Rapidash. Sorteie novamente um número entre 3  e 4
	agora. Se ID=3, obrigatoriamente Ponyta  ataca  Pikachu.  Se ID=4,  obrigatoriamente  Rapidash 
	ataca Raichu. O loop sairá quando um dos pokemons ficar com pontos de vida  menor  ou  igual a 
	zero. Lembrando que a batalha acontece obrigatoriamente dessa forma:
	
	Pikachu x Ponyta
	Raishu x Rapidash
	
	Exemplo de execução do programa:
	
	Raichu Aplicou golpe.
	Rapidash Pontos de vida:180
	Ponyta Aplicou golpe.
	Pikachu Pontos de vida:120
	Raichu Aplicou golpe.
	Rapidash Pontos de vida:110
	Ponyta Aplicou golpe.
	Pikachu Pontos de vida:80
	Raichu Aplicou golpe.
	Rapidash Pontos de vida:40
	Ponyta Aplicou golpe.
	Pikachu Pontos de vida:40
	Pikachu Aplicou golpe.
	Ponyta Pontos de vida:100
	Ponyta Aplicou golpe.
	Pikachu Pontos de vida:0
	
	FIM!
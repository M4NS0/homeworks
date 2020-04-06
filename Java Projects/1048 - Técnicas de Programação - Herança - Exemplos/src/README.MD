Observação:

Nas classes CamaroteInferior e CamaroteSuperior existem técnica de  Associação de 
classe (nas linhas 12) criando e inicializando um objeto dentro da própria classe

protected Normal v;
v = new Normal(valor); 			// cria novo objeto de ingresso "Normal" dentro da classe

protected Vip v;
v = new Vip(valor, adicional); 	// cria novo objeto de ingresso "VIP" dentro da classe
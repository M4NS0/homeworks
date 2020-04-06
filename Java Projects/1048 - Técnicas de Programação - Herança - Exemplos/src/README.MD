Observação:

Referente ao pacote "Espetáculos"

Nas classes "CamaroteInferior" e "CamaroteSuperior" existem  técnica de Associação de classe 
(nas  linhas  12) criando e inicializando um objeto de outra classe dentro da própria classe

class CamaroteInferior() {

protected Normal v;			// atributo da classe "Normal"

v = new Normal(valor); 			// cria novo objeto de ingresso "Normal" dentro da classe


class CamaroteSuperior() {

protected Vip v;			// atributo da classe "VIP"

v = new Vip(valor, adicional); 		// cria novo objeto de ingresso "VIP" dentro da classe

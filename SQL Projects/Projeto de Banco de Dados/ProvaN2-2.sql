/* PROVA N2 */

 -- Fazer um SQL para listar todos os pedidos atendidos pelos vendedores 
 -- que possuem a letra "n" ou "N" em seu nome e cujo pedido foi feito em maio de 2020.
 -- (listar Num pedido,   Nome vendedor e data do pedido)

	SELECT 
	 "Num-pedido",
	 "Nome-vend",
	 "Data-pedido"
	FROM 
	 "PEDIDO",
	 "VENDEDOR"
	WHERE 
	 "Nome-vend" LIKE '%n' OR "Nome-vend" LIKE '%N' AND
	 "Data-pedido" BETWEEN '01/05/2020' AND '30/05/2020';
	 
	 
	 -- Fazer um SQL que lista os PEDIDOS  feitos pelo CLIENTE cujo primeiro 
	 -- nome é "José" e cujo vendedor é "Pedro"  e que tenha mais de 2 produtos 
	 -- diferentes vendidos. (Nome cliente, nome vendedor, num pedido)  ..... 
	 -- Pode usar subselect   se quiser
	 
	SELECT 
	 cl."Nome-cli" , 
	 ve."Nome-vend" , 
	 pe."Num-pedido" 
	FROM 
	 "CLIENTE" cl , 
	 "VENDEDOR" ve , 
	 "PEDIDO" pe 
	WHERE 
	 cl."Cpf-cliente" = pe."Cpf-cli" AND
	 ve."Cpf-vend" = pe."Cpf-vend" AND 
	 cl."Nome-cli" LIKE 'José' AND 
	 ve."Nome-vend" = 'Pedro' AND
 	 pe."Num-pedido" IN (SELECT "Num-ped" 
						 FROM "ITEM-PEDIDO" 
						 GROUP BY "Num-ped" 
						 HAVING COUNT("cod-prod") > 2);
	 
	 
	 -- Faça um sql, usando subselect, para listar  o/s cliente/s mais velho/s, 
	 -- de idade, que compraram pedidos  acima da média de valor dos pedidos.
     -- (Nome cliente, Data nasc cliente, valor do pedido, media dos valores dos pedidos)
	 
	 ---------------------------------------------------------------
    -- Listar nome e data de nAScimento dos clientes mais velhos --
    ---------------------------------------------------------------
	
	
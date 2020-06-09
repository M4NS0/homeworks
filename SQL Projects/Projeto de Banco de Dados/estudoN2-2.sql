 	----------------------------------------------------------
    -- Num-Pedido, nome-cli, cod-prod  -  usANDo INNER JOIN --
    ----------------------------------------------------------
	
	SELECT 
	 pe."Num-pedido",
	 cl."Nome-cli",
	 ip."cod-prod"
	FROM
	 "CLIENTE" cl
	INNER JOIN "PEDIDO" pe ON (pe."Cpf-cli" = cl."Cpf-cliente")
	INNER JOIN "ITEM-PEDIDO" ip ON (ip."Num-ped"= pe."Num-pedido");
	
	----------------------------------------------------------
	
	SELECT 
	 pe."Num-pedido",
	 cl."Nome-cli",
	 ip."cod-prod"
	FROM
	 "CLIENTE" cl,
	 "PEDIDO" pe,
	 "ITEM-PEDIDO" ip
	WHERE 
	 pe."Cpf-cli" = cl."Cpf-cliente" AND
	 ip."Num-ped" = pe."Num-pedido"	;	

	------------------------------------------------------------
    -- Num-Pedido, nome-cli  e o numero de produtos pedidos   --
    ------------------------------------------------------------
	
	SELECT 
	 pe."Num-pedido",
	 cl."Nome-cli",
	 pr."Desc-produto",
	COUNT (ip."Qtde-item-ped") AS "Quantidade Pedida"
	FROM 
	 "CLIENTE" cl
	INNER JOIN "PEDIDO" pe ON (pe."Cpf-cli" = cl."Cpf-cliente")
	INNER JOIN "ITEM-PEDIDO" ip ON (ip."Num-ped" = pe."Num-pedido")
	INNER JOIN "PRODUTO" pr ON (pr."Cod-produto" = ip."cod-prod")
	GROUP BY pe."Num-pedido", cl."Nome-cli", pr."Desc-produto"; -- mesma coisa de GROUP BY 1,2,3;
	
	--------------------------------------------------------------------
	
	SELECT 
	  pe."Num-pedido",
	  cl."Nome-cli",
	  pr."Desc-produto",
	 COUNT (ip."Qtde-item-ped") AS "Quantidade Pedida"
	 FROM 
	  "CLIENTE" cl,
	  "PEDIDO" pe,
	  "ITEM-PEDIDO" ip,
	  "PRODUTO" pr
	 WHERE 
	  pe."Cpf-cli" = cl."Cpf-cliente" AND
	  ip."Num-ped" = pe."Num-pedido" AND
	  pr."Cod-produto" = ip."cod-prod"
	 GROUP BY 1,2,3;
	
	--------------------------------------------------------------------
    --Listar Num-pedido e Nome-cli ,  e o numero de produtos comprado --
    --------------------------------------------------------------------
	
	SELECT
	 "Num-pedido",
	 "Nome-cli",
	 "cod-prod"
	FROM
	 "PEDIDO"
	INNER JOIN "CLIENTE" ON ("Cpf-cliente" = "Cpf-cli")
	INNER JOIN "ITEM-PEDIDO" ON ("Num-ped" = "Num-pedido" )
	
	--------------------------------------------------------------------
	SELECT
	 pe."Num-pedido",
	 cl."Nome-cli",
	 ip."cod-prod"
	FROM
	 "PEDIDO" pe,
	 "CLIENTE" cl,
	 "ITEM-PEDIDO" ip
	WHERE 
	 pe."Num-pedido" = ip."Num-ped" AND
	 cl."Cpf-cliente" = pe."Cpf-cli";
	 
	-------------------------------------------------
    -- Criar VIEW com o pedido e o valor do pedido --
    -------------------------------------------------
	
	CREATE VIEW 
	 "Pedido e Valor" ("Numero-Pedido", "Valor-Pedido") AS
	SELECT 
	 ip."Num-ped",
	SUM 
	 (ip."Qtde-item-ped"* pr."Val-produto") AS "Valor Total"
	FROM 
	 "ITEM-PEDIDO" ip,
	 "PRODUTO" pr
	WHERE ip."cod-prod" = pr."Cod-produto"
	GROUP BY 1;
	
	SELECT * FROM "Pedido e Valor";
	DROP VIEW "Pedido e Valor";
	
	-------------------------------------------------------
    -- Listar os pedidos cujo valor estao acima da média --
    -------------------------------------------------------
	
	SELECT 
	 "Numero-Pedido", 
	 "Valor-Pedido"
	FROM 
	 "Pedido e Valor"
	WHERE 
	 "Valor-Pedido" > (SELECT AVG ("Valor-Pedido") FROM "Pedido e Valor");
	
	----------------------------------------------------------------------------
	-- Criar uma visão que contenha apenAS os produtos vendidos em quilograma --
	----------------------------------------------------------------------------
	
	CREATE VIEW 
	 "Produtos em KG"
	 (Codigo, Descricao, Unidade) AS
	SELECT 
	 "Cod-produto",
	 "Desc-produto",
	 "Unid-medida"
	FROM
	 "PRODUTO"
	WHERE "Unid-medida" = 'KG';
	
	SELECT * FROM "Produtos em KG";
	DROP VIEW "Produtos em KG";
	
	--------------------------------------------------------------------------------------
    -- Criar uma visão contendo o código do vendedor, o seu nome e o salário fixo anual --
	--------------------------------------------------------------------------------------
	
	CREATE VIEW 
	 "Salario Anual do Vendedor"
	 ("Codigo", "Nome", "Salario Anual" ) AS
	SELECT 
	 "Cpf-vend",
	 "Nome-vend",
	 "Sal-fixo" *12
	FROM 
	 "VENDEDOR";
	 
	SELECT * FROM "Salario Anual do Vendedor";
	DROP VIEW "Salario Anual do Vendedor";
	
	--------------------------------------------------------
    -- Criar  uma  visão  contendo  os  vendedores,  seus -- 
    -- pedidos  efetuados  e  os respectivos produtos.    --
	--------------------------------------------------------
	
	CREATE VIEW
	 "Desempenho dos Vendedores"
	 ("Nome do Vendedor","Pedidos Efetuados", "Produtos Vendidos") AS
	SELECT 
	 ve."Nome-vend",
	 pe."Num-pedido",
	 pr."Desc-produto"
	FROM
	 "VENDEDOR" ve
	INNER JOIN "PEDIDO" pe ON (pe."Cpf-vend" = ve."Cpf-vend")
	INNER JOIN "ITEM-PEDIDO" ip ON (ip."Num-ped" = pe."Num-pedido")
	INNER JOIN "PRODUTO" pr ON (pr."Cod-produto" = ip."cod-prod")
	GROUP BY 1,2,3;
	
	SELECT * FROM "Desempenho dos Vendedores";
	DROP VIEW "Desempenho dos Vendedores";
	
	------------------------------------------------------------
	-- Com base na visão salario_anual, mostrar os vendedores --
	-- que têm salário fixo anual superior a R$ 20.000,00.    --
	------------------------------------------------------------
	
	 CREATE VIEW 
	  "Salarios acima de 20 mil"
	  ("Nome", "Salario Fixo", "Salario Anual") AS
	 SELECT 
	  "Nome-vend",
	  "Sal-fixo",
	  "Sal-fixo"*12
	 FROM 
	  "VENDEDOR"
	 WHERE
	  "Sal-fixo" * 12 > 20000;
	  
	 SELECT * FROM "Salarios acima de 20 mil";
	 DROP VIEW "Salarios acima de 20 mil";
	 
	-------------------------------------------------------
    -- Listar os pedidos cujo valor estao acima da média --
    -------------------------------------------------------
	CREATE VIEW 
	 "Pedidos Acima da Media"
	 ("Numeros dos Pedidos", "Valor", "Media") AS
	SELECT
	 pe."Num-pedido",
	 pr."Val-produto",
	FROM 
	 "PRODUTO" pr,
	 "PEDIDO" pe
	WHERE pr."Val-produto" > "Media";
	
	--------------------------------------------------------------
    -- Faça um SQL, usANDo subSELECT e VIEWS,  para listar os   --
    -- clientes que compraram os produtos mais vendidos em 2020 --  
    -- ( Nome do cliente,  nome do produto , qtde vendida).     --
    --------------------------------------------------------------

	CREATE VIEW 
	 "Clientes e Quantidade Vendida"
	 ("Nome do Cliente", "Nome do Produto", "Quantidade Vendida") AS
	SELECT 
	 cl."Nome-cli",
	 pr."Desc-produto",
	SUM (ip."Qtde-item-ped") AS "QTDE"
	FROM
	 "CLIENTE" cl
	INNER JOIN "PEDIDO" pe ON (pe."Cpf-cli" = cl."Cpf-cliente")
	INNER JOIN "ITEM-PEDIDO" ip ON (ip."Num-ped" = pe."Num-pedido")
	INNER JOIN "PRODUTO" pr ON (pr."Cod-produto" = ip."cod-prod")
	GROUP BY 1,2;

	SELECT * FROM "Clientes e Quantidade Vendida";
	
	SELECT
      c."Nome-cli" AS "Nome do Cliente",
      v."Nome do Produto" AS "Nome do Produto",
      v."Quantidade Vendida" AS "Quantiadde Vendida"
    FROM
      "CLIENTE" c
      INNER JOIN "PEDIDO" p ON p."Cpf-cli" = c."Cpf-cliente"
      INNER JOIN "ITEM-PEDIDO" i ON i."Num-ped" = p."Num-pedido"
      INNER JOIN "PRODUTO" pd ON pd."Cod-produto" = i."cod-prod"
      INNER JOIN "Clientes e Quantidade Vendida" v ON v."Nome do Produto" = pd."Desc-produto"
    WHERE
      v."Quantidade Vendida" IN (
        SELECT
          MAX (q."Quantidade Vendida")
        FROM
          "Clientes e Quantidade Vendida" q
      );
	  
	SELECT MAX 
	 ("Quantidade Vendida"),
	 cl."Nome-cli" AS "Nome do Cliente",
	 pr."Desc-produto" AS "Produto"
	FROM
	 "Clientes e Quantidade Vendida",
	 "CLIENTE" cl,
	 "PRODUTO" pr
	INNER JOIN "ITEM-PEDIDO" ip ON (ip."cod-prod" = pr."Cod-produto")
	GROUP BY 2,3;
	
	
	--------------------------------------------------------------
	
	SELECT 
	 cl."Nome-cli",
	 pr."Desc-produto",
	 ip."Qtde-item-ped"
	
	FROM 
	 "CLIENTE" cl,
	 "PRODUTO" pr,
	 "ITEM-PEDIDO" ip,
	 "PEDIDO" pe
	
	WHERE 
	 ip."cod-prod" = pr."Cod-produto" AND
	 pe."Num-pedido" = ip."Num-ped" AND
	 cl."Nome-cli" = 'Ana';
	
	
	 DROP VIEW "Clientes e Quantidade Vendida";
	 
	
	 


	
	
	 
	
	 
	
	 
	
	 
	
	
	
	
	
	
	
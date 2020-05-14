/* APAGAR TABELAS */
DROP TABLE public."ITEM-PEDIDO";
DROP TABLE public."PEDIDO";
DROP TABLE public."PRODUTO";
DROP TABLE public."CLIENTE";
DROP TABLE public."VENDEDOR";

/* CRIAÇÃO DE TABELAS */

/*VENDEDOR*/
CREATE TABLE public."VENDEDOR"
(
    "Nome-vend" VARCHAR(80) NOT NULL,
    "Cpf-vend" BIGINT NOT NULL,
    "Tx-comissao" NUMERIC(8,2) NOT NULL,
    "Sexo-vend" VARCHAR(1) NOT NULL,
    
	CONSTRAINT "VENDEDOR_pkey" PRIMARY KEY("Cpf-vend")
);

/*CLIENTE*/
CREATE TABLE public."CLIENTE"
(
    "Nome-cli" VARCHAR(80) NOT NULL,
    "Endereço-cli" VARCHAR(90),
    "Data-nasc-cli" DATE NOT NULL,
    "Sexo-cli" VARCHAR(1) NOT NULL,
    "Cpf-cliente" BIGINT NOT NULL,
    
	CONSTRAINT "PK-Cli" PRIMARY KEY("Cpf-cliente")
);

/*PRODUTO*/
CREATE TABLE public."PRODUTO"
(
    "Cod-produto" INTEGER NOT NULL,
    "Desc-produto" VARCHAR(80) NOT NULL,
    "Val-produto" NUMERIC(10,2) NOT NULL,
    "Unid-medida" TEXT NOT NULL,
    
	CONSTRAINT "PRODUTO_pkey" PRIMARY KEY("Cod-produto")
);

/*PEDIDO*/
CREATE TABLE public."PEDIDO"
(
    "Num-pedido" INTEGER NOT NULL,
    "Data-pedido" DATE NOT NULL,
    "End-entrega-pedido" VARCHAR(90),
    "Data-entrega-pedido" DATE NOT NULL,
    "Cpf-vend" BIGINT NOT NULL,
    "Cpf-cli" BIGINT NOT NULL,
    
	CONSTRAINT "PEDIDO_pkey" PRIMARY KEY("Num-pedido"),
    CONSTRAINT "FK-ped-vend" FOREIGN KEY ("Cpf-vend") REFERENCES public."VENDEDOR"("Cpf-vend"),
    CONSTRAINT "Fk-Cliente" FOREIGN KEY ("Cpf-cli") REFERENCES public."CLIENTE"("Cpf-cliente")
);

/*ITEM-PEDIDO*/
CREATE TABLE public."ITEM-PEDIDO"
(
    "Num-ped" INTEGER NOT NULL,
    "Seq-item" INTEGER NOT NULL,
    "cod-prod" INTEGER NOT NULL,
    "Qtde-item-ped" NUMERIC(8,2) NOT NULL,
    
	CONSTRAINT "PK-Item-pedido" PRIMARY KEY("Num-ped", "Seq-item"),
    CONSTRAINT "FK-Pedido" FOREIGN KEY ("Num-ped") REFERENCES public."PEDIDO"("Num-pedido"),
    CONSTRAINT "FK-Produto" FOREIGN KEY ("cod-prod") REFERENCES public."PRODUTO"("Cod-produto")
);


/* INSERIR VALORES */

/*VENDEDOR*/
INSERT INTO public."VENDEDOR"
VALUES ('Vend-1', 6789, 0.2, 'M'),
       ('Vend-2', 7890, 0.15, 'M'),
       ('Vend-3', 8901, 0.21, 'M'),
       ('Vend-4', 9012, 0.2, 'M'),
       ('Paulo', 3456, 0.16, 'M');

/*CLIENTE*/
INSERT INTO public."CLIENTE"
VALUES ('Pedro', 'End1', '1922-02-22', 'M', 1234),
       ('Ana', 'Ende2', '1923-03-23', 'F', 2345),
       ('Paulo', 'end. do Paulo', '1984-04-24', 'M', 3456),
       ('Jose A', 'Endereço A', '1985-05-25', 'M', 4567),
       ('Jose B', 'XXXXXX', '1996-06-26', 'M', 5678);

/*PRODUTOS*/
INSERT INTO public."PRODUTO"
VALUES (1, 'Arroz', 10.5, 'pacot'),
       (2, 'Feijao', 4.3, 'KG'),
       (3, 'TV', 2530, 'UN'),
       (4, 'SAPATO', 89.9, 'PAR'),
       (5, 'CAMISA', 120, 'UN'),
       (6, 'BATOM', 8.5, 'dz');

/*PEDIDOS*/
INSERT INTO public."PEDIDO"
VALUES (25, '2019-01-12', 'END-ENTREGA-1', '2019-01-12', 6789, 1234),
       (26, '2019-01-13', 'END-ENTREGA-2', '2019-01-17', 8901, 4567),
       (27, '2019-01-14', 'END-ENTREGA-3', '2019-01-22', 6789, 3456),
       (28, '2019-01-15', 'END-ENTREGA-4', '2019-01-27', 6789, 1234),
       (29, '2019-01-16', 'END-ENTREGA-5', '2019-02-01', 9012, 3456),
       (30, '2019-01-17', 'END-ENTREGA-6', '2019-02-06', 7890, 2345);

/*ITEM-PEDIDO*/
INSERT INTO public."ITEM-PEDIDO"
VALUES (25, 1, 1, 2),
       (25, 2, 2, 0.6),
       (25, 3, 5, 10),
       (26, 1, 2, 1),
       (27, 1, 6, 2);


/* UPDATE */

UPDATE "VENDEDOR" SET "Tx-comissao" = "Tx-comissao" * 10 WHERE "Cpf-vend" = 7890;
UPDATE "VENDEDOR" SET "Tx-comissao" = "Tx-comissao" * 10;

/* ADICIONAR COLUNA UF */
-- incluir atributo chamado uf em cliente campo opcional

ALTER TABLE "CLIENTE" ADD COLUMN "UF" character varying(2);

/* APAGAR */
--ALTER TABLE "CLIENTE" DROP COLUMN "uf";


/* UPDATE EM UF */
-- incluir pedro e jose A (Go), Ana e paulo (SP), jose B (Pi) 

UPDATE "CLIENTE" SET "UF" = 'PR' WHERE "Cpf-cliente" = 1234 OR "Cpf-cliente" = 4567;
UPDATE "CLIENTE" SET "UF" = 'GO' WHERE "Cpf-cliente" IN (1234,4567);

UPDATE "CLIENTE" SET "UF" = 'MT' WHERE "Cpf-cliente" = 2345 OR "Cpf-cliente" = 3456;
UPDATE "CLIENTE" SET "UF" = 'SP' WHERE "Cpf-cliente" IN (2345,3456);

-- OR não pode ser AND pq não existe um valor q contenha as duas 
-- referências em uma só, resultando sempre em uma operação falsa
-- IN aninha a sintaxe das referencias

UPDATE "CLIENTE" SET "UF" = 'PI' WHERE "Cpf-cliente" = 5678;

UPDATE "CLIENTE" SET "Data-nasc-cli" = '1984/12/09' WHERE "Cpf-cliente" = 3456;
UPDATE "CLIENTE" SET "Data-nasc-cli" = '1984/09/12' WHERE "Cpf-cliente" = 3456;

UPDATE "VENDEDOR" SET "Tx-comissao" = "Tx-comissao" + ("Tx-comissao"*2/100);

/* OBS */

-- valor atributos aspas simples
-- nome atributos em aspas duplas
-- comandos nao sao case sensitive
-- campo numerico não tem aspas

/* DELEÇÕES */

DELETE FROM "CLIENTE" WHERE "Cpf-cliente" = 5678;

-- se deletar um cliente tem q ver se ele tem pedido
-- Pedido é pai, e nao existe filho sem pai
-- ex:. DELETE FROM "CLIENTE" WHERE "Cpf-cliente" = 3456;
-- ERROR:  update or delete on table "CLIENTE" violates foreign key constraint "Fk-Cliente" on table "PEDIDO"
-- DETAIL:  Key (Cpf-cliente)=(3456) is still referenced from table "PEDIDO".

-- DELETE FROM "PRODUTO" 
-- Deleta todo conteudo da tabela

-- DELETE FROM "ITEM-PEDIDO" WHERE "cod-prod" = 2;
-- DELETE FROM "PRODUTO" WHERE "Cod-produto" = 2;

/* Extra */ 

-- registrar 2 produtos no msm pedido, na ordem:

INSERT INTO public."PEDIDO"
VALUES (37, '2019-01-12', 'END-ENTREGA-8', '2019-01-12', 6789, 1234);

INSERT INTO public."ITEM-PEDIDO"
VALUES (37, 1, 1, 5);

INSERT INTO public."ITEM-PEDIDO"
VALUES (37, 2, 3, 8);

-- para deleção dos pedidos acima, fazer na ordem:

DELETE FROM "ITEM-PEDIDO" WHERE "Num-ped" = 37;
DELETE FROM "PEDIDO" WHERE "Num-pedido" = 37;

/* CONSULTAS */
SELECT * FROM public."CLIENTE";
SELECT * FROM public."VENDEDOR";
SELECT * FROM public."PRODUTO";
SELECT * FROM public."PEDIDO";
SELECT * FROM public."ITEM-PEDIDO";


SELECT "Cod-produto", "Desc-produto" FROM "PRODUTO";
	
SELECT "Num-pedido", "Data-pedido", "End-entrega-pedido" FROM "PEDIDO"
	WHERE "Data-pedido" >= '15/01/2019';

SELECT "Num-pedido", "Data-pedido", "End-entrega-pedido" FROM  "PEDIDO"
	WHERE "Data-pedido" < '15/01/2019';

SELECT "Num-pedido", "Data-pedido", "End-entrega-pedido" FROM  "PEDIDO"
	WHERE "Data-pedido" != '15/01/2019';

SELECT "Num-pedido", "Data-pedido", "End-entrega-pedido" FROM  "PEDIDO"
	WHERE "Data-pedido" <> '15/01/2019';

-- != é o mesmo que <>

SELECT "cod-prod","Num-ped","Qtde-item-ped" FROM "ITEM-PEDIDO" 
	WHERE "Qtde-item-ped" > 1.5;
	
SELECT "cod-prod","Num-ped","Qtde-item-ped" FROM "ITEM-PEDIDO" 
	WHERE NOT "Qtde-item-ped" = 2.0;

SELECT * FROM "CLIENTE" WHERE "Nome-cli" LIKE 'J%' OR "Nome-cli" LIKE 'P%';
SELECT * FROM "CLIENTE" WHERE "Nome-cli" LIKE '%a';
SELECT * FROM "VENDEDOR" WHERE "Nome-vend" LIKE '%end%' OR "Nome-vend" LIKE '%o';

SELECT "Nome-vend", "Tx-comissao" FROM "VENDEDOR" WHERE NOT "Nome-vend" LIKE '%2' AND "Tx-comissao" > 2;
SELECT "Nome-vend", "Tx-comissao" FROM "VENDEDOR" WHERE NOT "Tx-comissao" > 2 AND  "Tx-comissao" < 16;
SELECT "Nome-vend", "Tx-comissao" FROM "VENDEDOR" WHERE "Tx-comissao" > 2 AND  "Tx-comissao" < 16;

-- Listar numero do pedido, o codigo do produto e a quantidade pedida dos itens de um pedido
-- onde a quantidade pedida seja igual a 2

SELECT "Num-ped", "cod-prod", "Qtde-item-ped" FROM "ITEM-PEDIDO"
	WHERE "Qtde-item-ped" >2;

-- Quais são os produtos que tem unidade igual a 'KG' e valor unitario maior q 2,00R$

SELECT * FROM "PRODUTO";

SELECT "Cod-produto", "Desc-produto" FROM "PRODUTO" 
	WHERE "Unid-medida" = 'KG' AND "Val-produto" >= 2.00;

-- prioridade do AND é maior do que a prioridade de OR nas operações

-- Liste todos os clientes do estado de SP ou com CPF entre 2345 e 3456

SELECT  * FROM "CLIENTE";

SELECT "Nome-cli","Cpf-cliente" FROM "CLIENTE" 
	WHERE "UF" = 'SP' OR "Cpf-cliente" BETWEEN 2345 AND 3456;
	
SELECT * FROM "CLIENTE" 
	WHERE "UF" = 'SP' OR ("Cpf-cliente" >= 2345 AND "Cpf-cliente" <= 3456); 

SELECT * FROM "ITEM-PEDIDO" WHERE "cod-prod" = 1 OR "cod-prod" = 5 OR "cod-prod" = 6 AND "Qtde-item-ped" BETWEEN 10 AND 15;

SELECT * FROM "PEDIDO" WHERE "Data-pedido" < current_date - interval '60' day;
SELECT * FROM public."PEDIDO" WHERE (DATE('07/05/2020')-DATE("PEDIDO"."Data-pedido")) > 60;

UPDATE "PRODUTO" SET "Val-produto" = "Val-produto" * 1.5 WHERE "Val-produto" < 10.00 AND "Val-produto" > 20.00;

-- Que liste os pedidos feitos a mais de 60 dias.
SELECT * FROM "PEDIDO" WHERE "Data-pedido" BETWEEN '2019/05/07' AND '2019/03/07';

SELECT * FROM "ITEM-PEDIDO";
SELECT * FROM "PRODUTO";

/* Funções de Agregação -  11/05/2020 */

SELECT * FROM "ITEM-PEDIDO";
SELECT * FROM "PRODUTO";
SELECT * FROM public."CLIENTE";

-- O mais velho 
SELECT MIN ("Data-nasc-cli") FROM "CLIENTE";
SELECT MIN ("Data-nasc-cli") FROM "CLIENTE" WHERE "Data-nasc-cli" > ('31/12/1960');

-- O mais novo
SELECT MAX ("Data-nasc-cli") FROM "CLIENTE";
SELECT MAX ("Data-nasc-cli") FROM "CLIENTE" WHERE "Data-nasc-cli" > ('31/12/1960');

-- Numero de clientes cadastrados, quantidade de registros
SELECT COUNT (*) FROM "CLIENTE";
SELECT COUNT (*) FROM "CLIENTE" WHERE "Data-nasc-cli" > '01/12/1980';

-- Soma quantidade de Quilos de feijão vendidos
SELECT SUM ("Qtde-item-ped") FROM "ITEM-PEDIDO" WHERE "cod-prod" = 2;

-- Média da quantidade de feijão
SELECT AVG ("Qtde-item-ped") FROM "ITEM-PEDIDO" WHERE "cod-prod" = 2;

-- Soma Quantos itens foram vendidos por produto
SELECT "cod-prod", SUM ("Qtde-item-ped") FROM "ITEM-PEDIDO" GROUP BY "cod-prod";

-- Conta Quantos itens foram vendidos por codigo produto 
SELECT "cod-prod", COUNT ("cod-prod") FROM "ITEM-PEDIDO" GROUP BY "cod-prod";

-- Média vendida por codigo produto
SELECT "cod-prod", AVG ("Qtde-item-ped") FROM "ITEM-PEDIDO" GROUP BY "cod-prod";

-- Quantidade de pedidos do mesmo codigo de pedido
SELECT "Num-ped", COUNT ("cod-prod") FROM "ITEM-PEDIDO" GROUP BY "Num-ped";

-- Quantidade de pedidos acima de 2
SELECT "Num-ped", COUNT ("cod-prod") FROM "ITEM-PEDIDO" GROUP BY "Num-ped" HAVING COUNT("cod-prod") > 2 ;

-- Soma numero de pedidos das tabelas e agrupa 
SELECT "Num-pedido", 
	SUM ("Qtde-item-ped" * "Val-produto")  
	FROM 	"PEDIDO",
			"ITEM-PEDIDO",
			"PRODUTO"
	WHERE "Num-ped" = "Num-pedido"	AND "cod-prod" = "Cod-produto" 
	GROUP BY "Num-pedido"; 
	
-- Quais são os clientes que tem pedidos com prazos de entregas 
-- superiores a 15 dias e q nao estão localizados nos estados de SP

SELECT "Nome-cli", "UF", "Data-entrega-pedido", "Num-pedido" 
	FROM "CLIENTE" c,"PEDIDO" p 								-- 'c' e 'p' são variáveis associativas alias ou apelido para 
	WHERE c."Cpf-cliente" = p."Cpf-cli"   						-- referenciar, principalmente se os atributos tiverem nomes iguais
	AND "Data-entrega-pedido" < (current_date - 25)
	AND NOT "UF" = 'SP' 
	ORDER BY  "Data-entrega-pedido" DESC;

SELECT  "Nome-cli" 				as "Nome do Cliente",                         
		"UF" 					as "Unidade Federativa",         -- renomeia o título das tabelas
		"Data-entrega-pedido" 	as "Data da Entrega do Pedido", 
		"Num-pedido" 			as "Numero pedido" 
		
		FROM "CLIENTE" c,"PEDIDO" p 								
		WHERE c."Cpf-cliente" = p."Cpf-cli"   						
		AND "Data-entrega-pedido" < (current_date - 25)
		AND NOT "UF" = 'SP' 
		ORDER BY  "Data-entrega-pedido" DESC;

-- Quais pedidos de Feijão, cod 02 e suas datas de entregas

SELECT 	"Nome-cli"				as	"Nome do Cliente",
		"Num-pedido" 			as 	"Número Pedido", 
		"Data-entrega-pedido" 	as 	"Data de Entrega",
		"Desc-produto" 			as 	"Descrição do Produto"
		
FROM 	"PEDIDO", 
		"PRODUTO", 
		"ITEM-PEDIDO",
		"CLIENTE"
				
WHERE 	"Num-pedido" 	= 	"Num-ped"
AND 	"cod-prod" 		= 	"Cod-produto"
AND 	"Cpf-cliente"	= 	"Cpf-cli"
AND 	"Cod-produto"	= 	2;
		
		
		
		
		
		
		
		
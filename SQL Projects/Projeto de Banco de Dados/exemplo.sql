	-- Table: public."CLIENTE"

	DROP TABLE public."ITEM-PEDIDO";
	DROP TABLE public."PEDIDO";
	DROP TABLE public."CLIENTE";
	DROP TABLE public."VENDEDOR";
	DROP TABLE public."PRODUTO";


	CREATE TABLE public."CLIENTE"
	(
	"Cpf-cliente" bigint NOT NULL,
	 CONSTRAINT "PK-Cli" PRIMARY KEY ("Cpf-cliente"),     
	"Nome-cli" character varying(80) COLLATE pg_catalog."default" NOT NULL,
	"Data-nasc-cli" date NOT NULL,
	"Sexo-cli" character varying(1) COLLATE pg_catalog."default" NOT NULL,
	"Endereço-cli" character varying(90) COLLATE pg_catalog."default",
	"Cidade" character varying(50),
	"Cep" bigint,
	"Uf"  character varying(2)
	)
	WITH (
	OIDS = FALSE
	)
	TABLESPACE pg_default;



	--VENDEDOR (cpf_vend, nome_vend, Sexo-vend, sal_fixo, tx_comiss)

	CREATE TABLE public."VENDEDOR"
	(
	"Cpf-vend" bigint NOT NULL,
	"Nome-vend" character varying(80) COLLATE pg_catalog."default" NOT NULL,
	"Sexo-vend" character varying(1) COLLATE pg_catalog."default" NOT NULL,
	"Sal-fixo" numeric(8,2) NOT NULL,
	"Tx-comissao" numeric(8, 2) NOT NULL,
	CONSTRAINT "VENDEDOR_pkey" PRIMARY KEY ("Cpf-vend")
	)
	WITH (
	OIDS = FALSE
	)
	TABLESPACE pg_default;


	--PRODUTO (cod_prod, unid_prod, desc_prod, val_unit)


	CREATE TABLE public."PRODUTO"
	(
	"Cod-produto" integer NOT NULL,
	"Desc-produto" character varying(80) COLLATE pg_catalog."default" NOT NULL,
	"Val-produto" numeric(10, 2) NOT NULL,
	"Unid-medida" text COLLATE pg_catalog."default" NOT NULL,
	CONSTRAINT "PRODUTO_pkey" PRIMARY KEY ("Cod-produto")
	)
	WITH (
	OIDS = FALSE
	)
	TABLESPACE pg_default;



	--PEDIDO (Num_ped, Dt-pedido, Prazo_entr, End-entrega, Dta-entrega-pedido, cpf_cli, cpf_vend)

	-- DROP TABLE public."PEDIDO";

	CREATE TABLE public."PEDIDO"
	(
	"Num-pedido" integer NOT NULL,
	"Data-pedido" date NOT NULL,
	"Prazo-enttrega" integer NOT NULL,
	"End-entrega-pedido" character varying(90) COLLATE pg_catalog."default",
	"Data-entrega-pedido" date NOT NULL,
	"Cpf-vend" bigint  NOT NULL,
	"Cpf-cli" bigint NOT NULL,
	CONSTRAINT "PEDIDO_pkey" PRIMARY KEY ("Num-pedido"),
	CONSTRAINT "FK-ped-vend" FOREIGN KEY ("Cpf-vend")
	REFERENCES public."VENDEDOR" ("Cpf-vend") MATCH SIMPLE
	ON UPDATE NO ACTION
	ON DELETE NO ACTION,
	CONSTRAINT "Fk-Cliente" FOREIGN KEY ("Cpf-cli")
	REFERENCES public."CLIENTE" ("Cpf-cliente") MATCH SIMPLE
	ON UPDATE NO ACTION
	ON DELETE NO ACTION
	)
	WITH (
	OIDS = FALSE
	)
	TABLESPACE pg_default;


	--ITEM_PEDIDO (Num_ped, seq-item ,cd_prod, qtde_ped)

	CREATE TABLE public."ITEM-PEDIDO"
	(
	"Num-ped" integer NOT NULL,
	"Seq-item" integer NOT NULL,
	"cod-prod" integer NOT NULL,
	"Qtde-item-ped" numeric(8, 2) NOT NULL,
	CONSTRAINT "PK-Item-pedido" PRIMARY KEY ("Num-ped", "Seq-item"),
	CONSTRAINT "FK-Pedido" FOREIGN KEY ("Num-ped")
	REFERENCES public."PEDIDO" ("Num-pedido") MATCH SIMPLE
	ON UPDATE NO ACTION
	ON DELETE NO ACTION,
	CONSTRAINT "FK-Produto" FOREIGN KEY ("cod-prod")
	REFERENCES public."PRODUTO" ("Cod-produto") MATCH SIMPLE
	ON UPDATE NO ACTION
	ON DELETE NO ACTION
	)
	WITH (
	OIDS = FALSE
	)
	TABLESPACE pg_default;

	/**DELETES*/
	DELETE FROM "ITEM-PEDIDO";
	DELETE FROM "PEDIDO";
	DELETE FROM "PRODUTO";
	DELETE FROM "CLIENTE";
	DELETE FROM "VENDEDOR";

	/*VENDEDOR*/
	Insert into "VENDEDOR" values (6789, 'Vend-1', 'M', 1400.00, 0.02);
	insert into "VENDEDOR" values (7890, 'Vend-2', 'M', 1550.00, 0.15);
	insert into "VENDEDOR" values (8901, 'Vend-3', 'M', 1550.00, 0.21);
	insert into "VENDEDOR" values (9012, 'Vend-4', 'M', 1700.00, 0.02);
	insert into "VENDEDOR" values (3456, 'Paulo', 'M', 1200.00, 0.16);
	insert into "VENDEDOR" values (8745, 'Pedro', 'M', 1550.00, 0.15);
	insert into "VENDEDOR" values (8933, 'Valeria', 'F', 1550.00, 0.21);
	insert into "VENDEDOR" values (9044, 'Maria', 'F', 1700.00, 0.02);
	insert into "VENDEDOR" values (3455, 'Paulinha', 'F', 1200.00, 0.16);

	/*CLIENTE*/
	Delete from "CLIENTE";
	Insert into "CLIENTE" values (1234, 'Pedro', '22/02/1922', 'M', 'End1', 'Goiania', 1234, 'GO');
	Insert into "CLIENTE" values (2345, 'Ana', '23/03/1923','F',   'Ende2',  'Guapo', 2345, 'GO');
	Insert into "CLIENTE" values (3456, 'Paulo', '24/04/1984', 'M', 'end. do Paulo',  'Goiania', 3456, 'GO');
	Insert into "CLIENTE" values (4567, 'Jacob', '24/09/1994','M', 'end. do Jacob',  'Marilia', 999999, 'SP');
	Insert into "CLIENTE" values (4577, 'Jacira', '27/08/1996', 'F', 'end. do Jacira', 'Maringa', 999999, 'PR');
	Insert into "CLIENTE" values (4588, 'Bolsonoro', '24/09/1954', 'M', 'end. do presid',  'Brasilia',          
																												666666, 'DF');
	Insert into "CLIENTE" values (4599, 'Lulala', '05/10/1945', 'F', 'end. do Lulala',  'Coritiba', 999999, 'PR');
	/*PRODUTOS*/
	insert into "PRODUTO" values (1, 'Arroz', 10.50, 'KG');
	insert into "PRODUTO" values (2, 'feijao', 4.30, 'KG');
	insert into "PRODUTO" values (3, 'TV', 2530.00, 'UN');
	insert into "PRODUTO" values (4, 'SAPATO', 89.90, 'PAR');
	insert into "PRODUTO" values (5, 'CAMISA', 120, 'UN');
	insert into "PRODUTO" values (6, 'BATOM', 8.50, 'dz');
	/*PEDIDOS*/
	insert into "PEDIDO" values
	( 27,    '2019-01-14',    10,    'END-ENTREGA-3',    '2019-01-22',    6789,    3456),
	(28,    '2019-01-15',    5,    'END-ENTREGA-4',    '2019-01-27',    6789,    1234),
	(29,    '2019-01-16',    8,    'END-ENTREGA-5',    '2019-02-01',    9012,    3456),
	(30,    '2020-02-17',    2,    'END-ENTREGA-6',    '2020-05-06',    7890,    2345 ),
	(31,    '2020-01-17',    2,    'END-ENTREGA-6',    '2020-05-04',    7890,    4567),
	(32,    '2020-04-17',    2,    'END-ENTREGA-6',    '2020-05-06',    8745,    2345),
	(33,    '2020-04-19',    2,    'END-ENTREGA-6',    '2020-05-07',    9044,    4567),
	(34,    '2020-04-13',    4,    'END-ENTREGA-6',    '2020-05-08',    7890,    4577),
	(35,    '2020-04-27',    6,    'END-ENTREGA-6',    '2020-05-09',    3455,    2345);

	/*item pedido*/

	insert into "ITEM-PEDIDO" values  (27, 3, 5, 10),
						   (27, 4, 2, 1), (27, 2, 2, 0.6),
						   (27, 1, 6, 2), (27, 5, 1, 2),
						   (28, 3, 4, 5), (28, 4, 2, 2),
						   (28, 5, 5, 13),(28, 1, 2, 4),
						   (28, 2, 6, 2), (29, 1, 5, 2),
						   (29, 2, 5, 13),(29, 3, 4, 4),
						   (29, 4, 6, 12),(30, 1, 2, 2),
						   (30, 2, 5, 13),(30, 3, 5, 4),
						   (30, 4, 6, 2), (31, 1, 2, 2),   
						   (31, 2, 5, 13),(31, 3, 5, 4),
						   (31, 4, 6, 2), (32, 1, 2, 2),   
						   (32, 2, 5, 13),(32, 3, 5, 4),
						   (32, 4, 6, 2), (33, 1, 2, 2),   
						   (33, 2, 5, 13),(33, 3, 5, 4),
						   (33, 4, 6, 2), (34, 1, 2, 2),   
						   (34, 2, 5, 13),(34, 3, 5, 4),
						   (34, 4, 6, 2), (35, 1, 2, 2),   
						   (35, 2, 5, 13),(35, 3, 5, 4),
						   (35, 4, 6, 2);

	-- ALTER TABLE "CLIENTE" ADD COLUMN "Uf" character varying (2);

	-- ALTER TABLE "CLIENTE" ADD COLUMN "Uf" character varying (2);
	UPDATE "CLIENTE" SET "Uf" = 'go' WHERE "Cpf-cliente" = 1234 OR "Cpf-cliente" = 4567;
	UPDATE "CLIENTE" SET "Uf" = 'sp' WHERE "Cpf-cliente" = 2345 OR "Cpf-cliente" = 3456;
	UPDATE "CLIENTE" SET "Uf" = 'pi' WHERE "Cpf-cliente" = 5678 ;


	DELETE FROM "ITEM-PEDIDO";
	DELETE FROM "PEDIDO";
	DELETE FROM "PRODUTO";
	DELETE FROM "CLIENTE";
	DELETE FROM "VENDEDOR";


	/*VENDEDOR*/
	Insert into "VENDEDOR" values (6789, 'Vend-1', 'M', 1400.00, 0.02);
	insert into "VENDEDOR" values (7890, 'Vend-2', 'M', 1550.00, 0.15);
	insert into "VENDEDOR" values (8901, 'Vend-3', 'M', 1550.00, 0.21);
	insert into "VENDEDOR" values (9012, 'Vend-4', 'M', 1700.00, 0.02);
	insert into "VENDEDOR" values (3456, 'Paulo', 'M', 1200.00, 0.16);
	insert into "VENDEDOR" values (8745, 'Pedro', 'M', 1550.00, 0.15);
	insert into "VENDEDOR" values (8933, 'Valeria', 'F', 1550.00, 0.21);
	insert into "VENDEDOR" values (9044, 'Maria', 'F', 1700.00, 0.02);
	insert into "VENDEDOR" values (3455, 'Paulinha', 'F', 1200.00, 0.16);

	/*CLIENTE*/
	--lete from "CLIENTE";
	Insert into "CLIENTE" values (1234, 'Pedro', '22/02/1922', 'M', 'End1', 'Goiania', 1234, 'GO');
	Insert into "CLIENTE" values (2345, 'Ana', '23/03/1923','F',   'Ende2',  'Guapo', 2345, 'GO');
	Insert into "CLIENTE" values (3456, 'Paulo', '24/04/1984', 'M', 'end. do Paulo',  'Goiania', 3456, 'GO');
	Insert into "CLIENTE" values (4567, 'Jacob', '24/09/1994','M', 'end. do Jacob',  'Marilia', 9999, 'SP');
	Insert into "CLIENTE" values (4577, 'Jacira', '27/08/1996', 'F', 'end. do Jacira', 'Maringa', 9999, 'PR');
	Insert into "CLIENTE" values (4588, 'Bolsonoro', '24/09/1954', 'M','end. do presid',  'Brasilia', 9999, 'SP');                                                                                                          
	Insert into "CLIENTE" values (4599, 'Lulala', '05/10/1945', 'F','end. do Lulala',  'Coritiba', 9999, 'PR');


	/*PRODUTOS*/
	insert into "PRODUTO" values (1, 'Arroz', 10.50, 'KG');
	insert into "PRODUTO" values (2, 'feijao', 4.30, 'KG');
	insert into "PRODUTO" values (3, 'TV', 2530.00, 'UN');
	insert into "PRODUTO" values (4, 'SAPATO', 89.90, 'PAR');
	insert into "PRODUTO" values (5, 'CAMISA', 120, 'UN');
	insert into "PRODUTO" values (6, 'BATOM', 8.50, 'dz');


	/*PEDIDOS*/
	insert into "PEDIDO" values
	( 27,   '2019-01-14',    10,    'END-ENTREGA-3',    '2019-01-22',    6789,    3456),
	(28,    '2019-01-15',    5,    'END-ENTREGA-4',    '2019-01-27',    6789,    1234),
	(29,    '2019-01-16',    8,    'END-ENTREGA-5',    '2019-02-01',    9012,    3456),
	(30,    '2020-02-17',    2,    'END-ENTREGA-6',    '2020-05-06',    7890,    2345 ),
	(31,    '2020-01-17',    2,    'END-ENTREGA-6',    '2020-05-04',    7890,    4567),
	(32,    '2020-04-17',    2,    'END-ENTREGA-6',    '2020-05-06',    8745,    2345),
	(33,    '2020-04-19',    2,    'END-ENTREGA-6',    '2020-05-07',    9044,    4567),
	(34,    '2020-04-13',    4,    'END-ENTREGA-6',    '2020-05-08',    7890,    4577),
	(35,    '2020-04-27',    6,    'END-ENTREGA-6',    '2020-05-09',    3455,    2345);

	/*item pedido*/

	insert into "ITEM-PEDIDO" values  (27, 5, 1, 2),
						   (27, 4, 2, 1),   (27, 3, 5, 10),
						   (27, 1, 6, 2),   (27, 2, 2, 0.6),
						   (28, 3, 4, 5),   (28, 4, 2, 2),
						   (28, 5, 5, 13),  (28, 1, 2, 4),
						   (28, 2, 6, 2),   (29, 1, 5, 2),
						   (29, 2, 5, 13),  (29, 3, 4, 4),
						   (29, 4, 6, 12),  (30, 1, 2, 2),
						   (30, 2, 5, 13),  (30, 3, 5, 4),
						   (30, 4, 6, 2),   (31, 1, 2, 2),   
						   (31, 2, 5, 13),  (31, 3, 5, 4),   
						   (31, 4, 6, 2),   (32, 1, 2, 2),   
						   (32, 2, 5, 13),  (32, 3, 5, 4),   
						   (32, 4, 6, 2),   (33, 1, 2, 2),   
						   (33, 2, 5, 13),  (33, 3, 5, 4),  
						   (33, 4, 6, 2),   (34, 1, 2, 2),   
						   (34, 2, 5, 13),  (34, 3, 5, 4),   
						   (34, 4, 6, 2),   (35, 1, 2, 2),   
						   (35, 2, 5, 13),  (35, 3, 5, 4),   
						   (35, 4, 6, 2);


	----------
	-- OBS: --
	----------

	-- valor atributos aspas simples
	-- nome atributos em aspas duplas
	-- comandos nao sao case sensitive
	-- campo numerico não tem aspas


	--------------
	-- DELEÇÕES --
	--------------

	DELETE
	FROM     "CLIENTE"
	WHERE     "Cpf-cliente" = 5678;


	----------
	-- OBS: --
	----------

	-- se deletar um cliente tem q ver se ele tem pedido
	-- Pedido é pai, e nao existe filho sem pai
	-- ex:. DELETE FROM "CLIENTE" WHERE "Cpf-cliente" = 3456;
	-- ERROR:  update or delete on table "CLIENTE" violates foreign key constraint "Fk-Cliente" on table "PEDIDO"
	-- DETAIL:  Key (Cpf-cliente)=(3456) is still referenced from table "PEDIDO".

	-- DELETE FROM "PRODUTO"
	-- Deleta todo conteudo da tabela

	-- DELETE FROM "ITEM-PEDIDO" WHERE "cod-prod" = 2;
	-- DELETE FROM "PRODUTO" WHERE "Cod-produto" = 2;


	-----------------------------------------------------
	-- para deleção dos pedidos acima, fazer na ordem: --
	-----------------------------------------------------

	DELETE
	FROM     "ITEM-PEDIDO"
	WHERE     "Num-ped" = 37;

	--------------------------------

	DELETE
	FROM     "PEDIDO"
	WHERE     "Num-pedido" = 37;


	---------------
	-- CONSULTAS --
	---------------

	SELECT     * FROM public."CLIENTE";
	SELECT     * FROM public."VENDEDOR";
	SELECT     * FROM public."PRODUTO";
	SELECT     * FROM public."PEDIDO";
	SELECT     * FROM public."ITEM-PEDIDO";

	--------------------------------------------

	SELECT     "Cod-produto",
	"Desc-produto"
	FROM     "PRODUTO";

	--------------------------------------------

	SELECT     "Num-pedido",
	"Data-pedido",
	"End-entrega-pedido"
	FROM     "PEDIDO"
	WHERE     "Data-pedido" >= '15/01/2019';

	--------------------------------------------

	SELECT     "Num-pedido",
	"Data-pedido",
	"End-entrega-pedido"
	FROM      "PEDIDO"
	WHERE     "Data-pedido" < '15/01/2019';

	--------------------------------------------

	SELECT     "Num-pedido",
	"Data-pedido",
	"End-entrega-pedido"
	FROM      "PEDIDO"
	WHERE     "Data-pedido" != '15/01/2019';

	--------------------------------------------

	SELECT     "Num-pedido",
	"Data-pedido",
	"End-entrega-pedido"
	FROM      "PEDIDO"
	WHERE     "Data-pedido" <> '15/01/2019';

	-- != é o mesmo que <>

	------------------------------------

	SELECT     "cod-prod",
	"Num-ped",
	"Qtde-item-ped"
	FROM     "ITEM-PEDIDO"
	WHERE     "Qtde-item-ped" > 1.5;

	------------------------------------

	SELECT     "cod-prod",
	"Num-ped",
	"Qtde-item-ped"
	FROM     "ITEM-PEDIDO"
	WHERE
	NOT     "Qtde-item-ped" = 2.0;

	------------------------------------

	SELECT     *
	FROM     "CLIENTE"
	WHERE     "Nome-cli"
	LIKE     'J%'
	OR         "Nome-cli"
	LIKE     'P%';

	------------------------------------

	SELECT     *
	FROM     "CLIENTE"
	WHERE     "Nome-cli"
	LIKE     '%a';

	------------------------------------

	SELECT     *
	FROM     "VENDEDOR"
	WHERE     "Nome-vend"
	LIKE     '%end%'
	OR         "Nome-vend"
	LIKE     '%o';

	------------------------------------

	SELECT     "Nome-vend",
	"Tx-comissao"
	FROM     "VENDEDOR"
	WHERE
	NOT     "Nome-vend"
	LIKE     '%2'
	AND     "Tx-comissao" > 2;

	------------------------------------

	SELECT     "Nome-vend",
	"Tx-comissao"
	FROM     "VENDEDOR"
	WHERE
	NOT     "Tx-comissao" > 2
	AND      "Tx-comissao" < 16;

	------------------------------------

	SELECT     "Nome-vend",
	"Tx-comissao"
	FROM     "VENDEDOR"
	WHERE     "Tx-comissao" > 2
	AND      "Tx-comissao" < 16;


	-----------------------------------------------------------------------------------------------
	-- Listar numero do pedido, o codigo do produto e a quantidade pedida dos itens de um pedido --
	-- onde a quantidade pedida seja igual a 2                                                   --
	-----------------------------------------------------------------------------------------------

	SELECT     "Num-ped",
	"cod-prod",
	"Qtde-item-ped"
	FROM     "ITEM-PEDIDO"
	WHERE     "Qtde-item-ped" >2;


	----------------------------------------------------------------------------------------
	-- Quais são os produtos que tem unidade igual a 'KG' e valor unitario maior q 2,00R$ --
	----------------------------------------------------------------------------------------

	SELECT     *
	FROM     "PRODUTO";
	SELECT     "Cod-produto",
	"Desc-produto"
	FROM     "PRODUTO"
	WHERE     "Unid-medida" = 'KG'
	AND     "Val-produto" >= 2.00;

	-- prioridade do AND é maior do que a prioridade de OR nas operações


	--------------------------------------------------------------------------
	-- Liste todos os clientes do estado de SP ou com CPF entre 2345 e 3456 --
	--------------------------------------------------------------------------

	SELECT  *
	FROM "CLIENTE";

	-----------------------------------------------------------------

	SELECT     "Nome-cli",
	"Cpf-cliente"
	FROM     "CLIENTE"
	WHERE     "Uf" = 'SP'
	OR         "Cpf-cliente"
	BETWEEN 2345
	AND     3456;

	-----------------------------------------------------------------

	SELECT     *
	FROM     "CLIENTE"
	WHERE     "Uf" = 'SP'
	OR         ("Cpf-cliente" >= 2345
	AND     "Cpf-cliente" <= 3456);

	-----------------------------------------------------------------

	SELECT *
	FROM     "ITEM-PEDIDO"
	WHERE     "cod-prod" = 1
	OR         "cod-prod" = 5
	OR         "cod-prod" = 6
	AND     "Qtde-item-ped"
	BETWEEN 10
	AND     15;

	SELECT     *
	FROM     "PEDIDO"
	WHERE     "Data-pedido" < current_date - interval '60' day;

	SELECT     *
	FROM     public."PEDIDO"
	WHERE     (DATE('07/05/2020')-DATE("PEDIDO"."Data-pedido")) > 60;

	UPDATE     "PRODUTO"
	SET     "Val-produto" = "Val-produto" * 1.5
	WHERE     "Val-produto" < 10.00
	AND     "Val-produto" > 20.00;


	---------------------------------------------------
	-- Que liste os pedidos feitos a mais de 60 dias --
	---------------------------------------------------

	SELECT *
	FROM     "PEDIDO"
	WHERE     "Data-pedido"
	BETWEEN '2019/05/07'
	AND     '2019/03/07';

	SELECT *
	FROM     "ITEM-PEDIDO";

	SELECT *
	FROM     "PRODUTO";


	----------------------------------------
	-- Funções de Agregação -  11/05/2020 --
	----------------------------------------

	SELECT *
	FROM     "ITEM-PEDIDO";

	SELECT *
	FROM     "PRODUTO";

	SELECT *
	FROM public."CLIENTE";


	------------------
	-- O mais velho --
	------------------

	SELECT
	MIN     ("Data-nasc-cli")
	FROM     "CLIENTE";

	SELECT
	MIN     ("Data-nasc-cli")
	FROM     "CLIENTE"
	WHERE     "Data-nasc-cli" > ('31/12/1900');


	-----------------
	-- O mais novo --
	-----------------

	SELECT
	MAX     ("Data-nasc-cli")
	FROM     "CLIENTE";

	SELECT
	MAX     ("Data-nasc-cli")
	FROM     "CLIENTE"
	WHERE     "Data-nasc-cli" > ('31/12/1960');


	-------------------------------------------------------------
	-- Numero de clientes cadastrados, quantidade de registros --
	-------------------------------------------------------------

	SELECT
	COUNT     (*)
	FROM     "CLIENTE";

	SELECT
	COUNT     (*)
	FROM     "CLIENTE"
	WHERE     "Data-nasc-cli" > '01/12/1980';


	--------------------------------------------------
	-- Soma quantidade de Quilos de feijão vendidos --
	--------------------------------------------------

	SELECT
	SUM     ("Qtde-item-ped")
	FROM     "ITEM-PEDIDO"
	WHERE     "cod-prod" = 2;


	-----------------------------------
	-- Média da quantidade de feijão --
	-----------------------------------

	SELECT
	AVG     ("Qtde-item-ped")
	FROM     "ITEM-PEDIDO"
	WHERE     "cod-prod" = 2;


	---------------------------------------------------
	-- Soma Quantos itens foram vendidos por produto --
	---------------------------------------------------

	SELECT     "cod-prod",
	SUM     ("Qtde-item-ped")
	FROM     "ITEM-PEDIDO"
	GROUP BY"cod-prod";


	-----------------------------------------------------------
	-- Conta Quantos itens foram vendidos por codigo produto --
	-----------------------------------------------------------

	SELECT     "cod-prod",
	COUNT     ("cod-prod")
	FROM     "ITEM-PEDIDO"
	GROUP BY"cod-prod";


	--------------------------------------
	-- Média vendida por codigo produto --
	--------------------------------------

	SELECT     "cod-prod",
	AVG     ("Qtde-item-ped")
	FROM     "ITEM-PEDIDO"
	GROUP BY"cod-prod";


	-----------------------------------------------------
	-- Quantidade de pedidos do mesmo codigo de pedido --
	-----------------------------------------------------

	SELECT     "Num-ped",
	COUNT     ("cod-prod")
	FROM     "ITEM-PEDIDO"
	GROUP BY"Num-ped";


	--------------------------------------
	-- Quantidade de pedidos acima de 2 --
	--------------------------------------

	SELECT     "Num-ped",
	COUNT     ("cod-prod")
	FROM     "ITEM-PEDIDO"
	GROUP BY"Num-ped"
	HAVING COUNT("cod-prod") > 2 ;


	-------------------------------------------------
	-- Soma numero de pedidos das tabelas e agrupa --
	-------------------------------------------------

	SELECT     "Num-pedido",
	SUM     ("Qtde-item-ped" * "Val-produto")  
	FROM     "PEDIDO",
	"ITEM-PEDIDO",
	"PRODUTO"
	WHERE     "Num-ped" = "Num-pedido"    
	AND     "cod-prod" = "Cod-produto"

	GROUP BY "Num-pedido";


	----------------------------------------------------------------------
	-- Quais são os clientes que tem pedidos com prazos de entregas     --
	-- superiores a 15 dias e q nao estão localizados nos estados de SP --
	----------------------------------------------------------------------

	SELECT "Nome-cli",
	"Uf",
	"Data-entrega-pedido",
	"Num-pedido"

	FROM     "CLIENTE" c,
	"PEDIDO" p                                                 -- 'c' e 'p' são variáveis associativas alias ou apelido para

	WHERE     c."Cpf-cliente" = p."Cpf-cli"                           -- referenciar, principalmente se os atributos tiverem nomes iguais
	AND     "Data-entrega-pedido" < (current_date - 25)
	AND NOT "Uf" = 'SP'

	ORDER BY"Data-entrega-pedido" DESC;

	------------------------------------------------------------------

	SELECT     "Nome-cli"                 as "Nome do Cliente",                         
	"Uf"                     as "Unidade Federativa",         -- renomeia o título das tabelas
	"Data-entrega-pedido"     as "Data da Entrega do Pedido",
	"Num-pedido"             as "Numero pedido"

	FROM     "CLIENTE" c,"PEDIDO" p                                 
	WHERE     c."Cpf-cliente" = p."Cpf-cli"                           
	AND     "Data-entrega-pedido" < (current_date - 25)
	AND NOT "Uf" = 'SP'
	ORDER BY"Data-entrega-pedido" DESC;


	--------------------------------------------------------------
	-- Quais pedidos de Feijão, cod 02 e suas datas de entregas --
	--------------------------------------------------------------

	SELECT     "Nome-cli"                as    "Nome do Cliente",
	"Num-pedido"             as     "Número Pedido",
	"Data-entrega-pedido"     as     "Data de Entrega",
	"Desc-produto"             as     "Descrição do Produto"

	FROM     "PEDIDO",
	"PRODUTO",
	"ITEM-PEDIDO",
	"CLIENTE"

	WHERE     "Num-pedido"     =     "Num-ped"
	AND     "cod-prod"         =     "Cod-produto"
	AND     "Cpf-cliente"    =     "Cpf-cli"
	AND     "Cod-produto"    =     2;


	------------------------------------------------------------------------------------------------------------------------------------------
	-- https://forms.office.com/Pages/ResponsePage.aspx?id=Qp8xcwiJiUUfjVWM9NXXdofJ9z99pIhLvGWLhnwwHO9UNVBURkhNMjAyUElIUjc4R0Q5WU5KWFZQTS4u --
	------------------------------------------------------------------------------------------------------------------------------------------

	------------------------------------------------------------------------------------------------------------------------
	--    Listar os PEDIDOS feitos por cliente.                                                                              --
	-- Nome-cli, Num-pedido, Dt-pedido, cod-produto pedido, Qtde-pedido, Valor total do item (multiplica qtidade x valor) --
	------------------------------------------------------------------------------------------------------------------------


	SELECT     "Nome-cli"        as "Nome do Cliente",
	"Num-ped"         as "Número do Pedido",
	"Data-pedido"    as "Data do Pedido",
	"cod-prod"        as "Código",
	"Qtde-item-ped"    as "Quantidade",
	"Val-produto"    as "Valor",

	SUM     ("Qtde-item-ped")*("Val-produto") as "Total"

	FROM     "CLIENTE",
	"ITEM-PEDIDO",
	"PEDIDO",
	"PRODUTO"

	WHERE    "Num-pedido"     = "Num-ped"
	AND     "cod-prod"        = "Cod-produto"
	GROUP BY"Nome-cli",
	"Num-ped",
	"Data-pedido",
	"cod-prod",
	"Qtde-item-ped",
	"Val-produto";


	-----------------------------------------------------------------------------------------------------
	-- Quantos PEDIDOS foram atendidos  por vendedor em maio/2020, que atenderam mais de de 3 pedidos. --
	-----------------------------------------------------------------------------------------------------

	SELECT     "Num-ped"         as "Número do Pedido",
	"Nome-vend"     as "Nome do Vendedor",
	"Data-pedido"    as "Data do Pedido",
	"cod-prod"        as "Código",
	COUNT     ("cod-prod")     as "Quantidade"

	FROM     "PEDIDO"         p,
	"VENDEDOR"         c,
	"ITEM-PEDIDO"     t

	WHERE   "Data-pedido" BETWEEN '01/01/2019' AND '30/01/2019'
	AND        p."Num-pedido"     =     t."Num-ped"
	AND     p."Cpf-vend"    =     c."Cpf-vend"

	GROUP BY "Num-ped" , "Nome-vend" , "Data-pedido" , "cod-prod"
	HAVING COUNT("cod-prod") > 3 ;


	---------------------------------------------------
	-- Qual a quantidade de produto vendida em 2020. --
	-- Desc-produto, qtde-vendida, Unid-medida       --
	---------------------------------------------------

	SELECT     "Desc-produto"     as "Descrição",
	"Unid-medida"    as "Medida",
	"Qtde-item-ped"    as "Quantidade",
	"Data-pedido"    as "Data do Pedido",
	"cod-prod"        as "Código",
	COUNT     ("cod-prod")     as "Quantidade"

	FROM    "PRODUTO" ,
	"ITEM-PEDIDO",
	"PEDIDO"

	WHERE   "Data-pedido" BETWEEN '01/01/2020' AND  (current_date)
	AND        "Num-pedido"     =     "Num-ped"

	GROUP BY "Desc-produto", "Unid-medida" , "Qtde-item-ped" , "Data-pedido" , "cod-prod";

	-----------------------------------------------------------------------------------------------

	SELECT     "Desc-produto",
	"Unid-medida",
	SUM        ("Qtde-item-ped")
	AS        "qtde-vendida"
	FROM     "PEDIDO"
	INNER
	JOIN     "ITEM-PEDIDO"
	ON         "ITEM-PEDIDO"."Num-ped" = "PEDIDO"."Num-pedido"
	INNER
	JOIN     "PRODUTO"
	ON         "PRODUTO"."Cod-produto" = "ITEM-PEDIDO"."cod-prod"
	WHERE
	EXTRACT(YEAR FROM "PEDIDO"."Data-pedido") = 2020
	GROUP BY"Desc-produto", "Unid-medida";


	---------------------------------------------------------------------------
	-- Mostrar os pedidos atendidos por vendedor cujo nome começa com "V",   -- 
	-- e que tenha como ITEM PEDIDO um produto cujo nome  tenha a letra "P". --
	-- Nome vend  , Num-pedido, data do pedido, desc-produto                 --                                                                   --
	---------------------------------------------------------------------------

	SELECT     "Nome-vend"     as "Nome do Vendedor",
	"Num-pedido"     as "Número do Pedido",
	"Data-pedido"    as "Data do Pedido",
	"Desc-produto"    as "Descrição",
	"Cod-produto"    as "Código Produto",
	"cod-prod"        as "Código Item"

	FROM     "PEDIDO" p,
	"PRODUTO",
	"VENDEDOR" c,
	"ITEM-PEDIDO"

	WHERE     p."Cpf-vend"    = c."Cpf-vend"
	AND     "cod-prod"        = "Cod-produto"
	AND        "Num-ped"        = "Num-pedido"
	AND        "Nome-vend"        LIKE 'V%'
	AND        "Desc-produto"    LIKE 'P%';


	------------------------------------------------------------------------------------------------------------------
	-- Qual a idade do Cliente mais velho.  (Dividir a quantidade de dias por 365) data atual -  data cliente / 365 --
	------------------------------------------------------------------------------------------------------------------

	SELECT     
	MIN     (("Data-nasc-cli") - current_date)/-365    
	AS      "Data de Nascimento"
	FROM     "CLIENTE"
	WHERE     ("Data-nasc-cli" > ('31/12/1900'));

	-------------------------------------------------------------------------
	-- Pedido, data do pedido, e o nome de quem pediu -  usando inner join --
	-------------------------------------------------------------------------

	SELECT         P."Num-pedido",
		C."Nome-cli"

	FROM         "PEDIDO" P

	INNER JOIN     "CLIENTE" c
	ON             "Cpf-cli" = "Cpf-cliente"

	WHERE         "Num-pedido" > 30;    

	-------------------------------------------------------------------------    

	SELECT             "Num-pedido",
			"Nome-cli"

	FROM             "CLIENTE"

	LEFT OUTER JOIN    "PEDIDO"
	ON                 "Cpf-cli" = "Cpf-cliente";

	----------------------------------------------------------
	-- Num-Pedido, nome-cli, cod-prod  -  usando inner join --
	----------------------------------------------------------

	SELECT         P."Num-pedido",
		  C."Nome-cli",
		   I."cod-prod"
	FROM         "CLIENTE" C

	INNER JOIN     "PEDIDO" P
	ON             (P."Cpf-cli" = C."Cpf-cliente")

	INNER JOIN     "ITEM-PEDIDO" I
	ON (I."Num-ped" = P."Num-pedido");

	---------------------------------------------------------
	-- Listar o número de itens existente em cada pedido.  --
	---------------------------------------------------------

	select "Num-ped", count(*) as "Qtde-item-ped" 
	from "ITEM-PEDIDO"
	group by "Num-ped";

	------------------------------------------------------
	-- Listar os pedidios que possuam mais de um item.  --
	------------------------------------------------------

	select "Num-ped",count(*) as "Qtde-item-ped" 
	from "ITEM-PEDIDO"
	group by "Num-ped" having count(*)>1;

	-------------------------------------------------------------------------
	-- Faça uma junção da tabela de clientes com a de pedidos, 
	-- exibindo o nome do cliente, o código do cliente e os número dos pedidos que este cliente fez.
	-------------------------------------------------------------------------

	select "Cpf-cliente", "Nome-cli" as "Nome do Cliente", "Num-pedido" as "PEDIDO" 
	from "CLIENTE" c, "PEDIDO" p 

	-------------------------------------------------------------------------
	-- o que acontece se ficar so assim  (produto carteziano)
	-- preciso fazer o casamento das duas tabelas  ( PK com FK)
	-------------------------------------------------------------------------

	where "Cpf-cliente" = "Cpf-cli"   order by "Cpf-cliente";

	-------------------------------------------------------------------------
	-- Faça uma junção da tabela de vendedores com a de pedidos,
	-- exibindo o nome do vendedor, o código do vendedor e os número dos pedidos que este vendedor fez.
	-------------------------------------------------------------------------

	select v."Cpf-vend", "Nome-vend" , "Num-pedido" as "PEDIDO" 
	from "VENDEDOR" v, "PEDIDO" p
	-- o que acontece se ficar so assim  (produto carteziano)
	-- preciso fazer o casamento das duas tabelas  ( PK com FK)
	where v."Cpf-vend" = p."Cpf-vend"   order by v."Cpf-vend";

	-------------------------------------------------------------------------
	--Listar ordenado pelos nomes dos clientes e qual vendedor atendeu o pedido.
	-------------------------------------------------------------------------

	select "Cpf-cliente", "Nome-cli" as "Nome do Cliente", "Num-pedido" as "PEDIDO" , "Nome-vend"
	from "CLIENTE" c, "PEDIDO" p , "VENDEDOR" v
	-- o que acontece se ficar so assim  (produto carteziano)
	-- preciso fazer o casamento das duas tabelas  ( PK com FK)
	where c."Cpf-cliente" = p."Cpf-cli"  
	and p."Cpf-vend" = v."Cpf-vend"
	and "Data-pedido" between '31/03/2020' and '01/05/2020'
	order by "Cpf-cliente";

	-- pagina 41 --
	
	------------------------------------------------------------
	-- Num-Pedido, nome-cli  e o numero de produtos pedidos   --
	------------------------------------------------------------

	SELECT P.    "Num-pedido",
		   C."Nome-cli",
		   PD."Desc-produto",
	COUNT         (I."Qtde-item-ped")
	AS             QUANTIDADE_PEDIDA
	FROM         "CLIENTE" C
	INNER JOIN     "PEDIDO" P
	ON             (P."Cpf-cli" = C."Cpf-cliente")
	INNER JOIN     "ITEM-PEDIDO" I
	ON             (I."Num-ped" = P."Num-pedido")
	INNER JOIN     "PRODUTO" PD
	ON             PD."Cod-produto" = I."cod-prod"
	GROUP BY     1,2,3;
	--------------------------------------------------------------------
	--Listar Num-pedido e Nome-cli ,  e o numero de produtos comprado --
	--------------------------------------------------------------------

	Select "Num-pedido", "Nome-cli", "cod-prod"   From 
	"PEDIDO" inner JOIN "CLIENTE"  on  "Cpf-cliente" = "Cpf-cli"
	inner join "ITEM-PEDIDO" on "Num-pedido" = "Num-ped";   

	------------------------------------------------------------	
	-- Mostrar o menor e o maior salário entre os vendedores. --
	------------------------------------------------------------

	select MIN("Sal-fixo"),MAX ("Sal-fixo")
	from "VENDEDOR";

	---------------------------------------------------------------
	-- Listar nome e data de nascimento dos clientes mais velhos --
	---------------------------------------------------------------

	SELECT         "Nome-cli" as "Mais Velho",
	MIN            ("Data-nasc-cli")
	FROM        "CLIENTE"
	GROUP BY    "Nome-cli";

	SELECT         "Nome-cli" as "Mais Velho",
		"Data-nasc-cli" as "Data de Nascimento"
	FROM        "CLIENTE"
	WHERE         "Data-nasc-cli" = ( SELECT MIN( "Data-nasc-cli" )
	FROM        "CLIENTE" );

	---------------------------------------------------------------
	-- Listar nome dos clientes que compram o pedido mais novo  --
	---------------------------------------------------------------

	SELECT         C."Nome-cli",
		   P."Num-pedido",
		   P."Data-pedido"
	FROM         "CLIENTE"     C,
		 "PEDIDO"     P
	WHERE         P."Cpf-cli" = C."Cpf-cliente" AND
		  P."Data-pedido" = (SELECT max("Data-pedido") FROM "PEDIDO");


	---------------------------------------------------------------
	-- Qual vendedor vendeu maior pedido                         --
	---------------------------------------------------------------

	SELECT            "numero-pedido-maior", "Nome-vend"
	FROM            "VENDEDOR" v, "PEDIDO" p,

	(SELECT         "numero-pedido-maior"
	FROM

	(SELECT      
	MAX                ("Total-do-pedido")
	AS                 "Maior-valor-pedido"
	FROM

		(SELECT         "Num-ped" ,
		SUM                ("Qtde-item-ped" * "Val-produto")                  AS        "Total-do-pedido"
		FROM             "ITEM-PEDIDO", "PRODUTO"
		WHERE             "Cod-produto" = "cod-prod"
		GROUP BY        "Num-ped")                                        AS         "VALOR-TOTAL-PEDIDO")             
																		AS         "TAB-MAIOR-PEDIDO",
			(SELECT          "Num-ped"                                   AS         "numero-pedido-maior",
			SUM              ("Qtde-item-ped" * "Val-produto")           AS         "Total-do-pedido"
			FROM             "ITEM-PEDIDO", "PRODUTO"
			WHERE            "Cod-produto" = "cod-prod"
			GROUP BY         "Num-ped")                                  AS         "VALOR-TOTAL-PEDIDO"
			WHERE             "Maior-valor-pedido" = "Total-do-pedido")   AS         "TAB_MAIOR_PEDIDO"
			WHERE             "numero-pedido-maior" = p."Num-pedido"         
			AND               p."Cpf-vend" = v."Cpf-vend";

	-----------
	-- Views --
	-----------

	-------------------------------------------------
	-- Criar view com o pedido e o valor do pedido --
	-------------------------------------------------

	CREATE VIEW "VIEW-VALOR-PEDIDO" ("View-N-pedido", "View-val-pedido")
					 AS SELECT ip."Num-ped",
					 SUM (ip."Qtde-item-ped" * p."Val-produto") AS "Val-pedido"
					 FROM "ITEM-PEDIDO" ip, "PRODUTO" p
					 WHERE ip."cod-prod" = p."Cod-produto"
					 GROUP BY ip."Num-ped";

	SELECT * FROM "VIEW-VALOR-PEDIDO" ;
	
	-- Criar uma visão que contenha apenas os produtos vendidos em quilograma.

	create view prod_kg
	(codigo,descricao,unidade)
	as select cod_prod,desc_prod,unid_prod from produto
	where unid_prod=’kg’;
	
	-- Criar uma visão contendo o código do vendedor, o seu nome e o salário fixo anual.

	create view salario_anual
	(codigo,nome,sal_anual)
	as select cod_vend,nome_vend,sal_fixo*12 from vendedor;
	
	-- Criar  uma  visão  contendo  os  vendedores,  seus  
	-- pedidos  efetuados  e  os respectivos produtos.


	create view "lista-pedidos"
	as select "Nome-vend","Num-ped","Desc-produto"
	from "VENDEDOR" V, "PEDIDO" P, "ITEM-PEDIDO" I, "PRODUTO" PR
	where V."Cpf-vend" = P."Cpf-vend" and P."Num-pedido" = I."cod-prod" and I."cod-prod"=PR."Cod-produto";

	
	-------------------------------------------------------
	-- Listar os pedidos cujo valor estao acima da média --
	-------------------------------------------------------

	SELECT "View-N-pedido", "View-val-pedido"
	FROM    "VIEW-VALOR-PEDIDO"
	WHERE "View-val-pedido" > (SELECT AVG("View-val-pedido") FROM "VIEW-VALOR-PEDIDO");

	--------------------------------------------------------------
	-- Faça um SQL, usando subselect e VIEWS,  para listar os   --
	-- clientes que compraram os produtos mais vendidos em 2020 --  
	-- ( Nome do cliente,  nome do produto , qtde vendida).     --
    --------------------------------------------------------------
	
	
	CREATE VIEW MAIS_VENDIDOS (NOME_DO_PRODUTO, QTD_VENDIDA) 
	AS select  P."Desc-produto",  SUM(I."Qtde-item-ped") AS QTD from "ITEM-PEDIDO" I 
	INNER JOIN "PRODUTO" P ON P."Cod-produto" = I."cod-prod"
	GROUP BY 1;


	SELECT 		c."Nome-cli" as "Nome do Cliente", 
				v.nome_do_produto as "Nome do Produto", 
				v.qtd_vendida as "Quantiadde Vendida" 
	FROM 		"CLIENTE" c  
	
	INNER JOIN 	"PEDIDO" p 
	ON 			p."Cpf-cli" = c."Cpf-cliente"
	
	INNER JOIN 	"ITEM-PEDIDO" i 
	ON 			i."Num-ped" = p."Num-pedido"
	
	INNER JOIN 	"PRODUTO" pd 
	ON 			pd."Cod-produto" = i."cod-prod"
	
	INNER JOIN 	MAIS_VENDIDOS v 
	ON 			v.nome_do_produto = pd."Desc-produto"
	
	WHERE 		v.qtd_vendida 
	IN 			(SELECT MAX (q.qtd_vendida)
				FROM MAIS_VENDIDOS q);

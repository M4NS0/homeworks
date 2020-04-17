DROP TABLE public."ITEM-PEDIDO";
DROP TABLE public."PEDIDO";
DROP TABLE public."CLIENTE";
DROP TABLE public."VENDEDOR"; 
DROP TABLE public."PRODUTO";

------------------ TABELA CLIENTE ------------------

CREATE TABLE public."CLIENTE" 
( 
    "Nome-cli" character varying(80) COLLATE pg_catalog."default" NOT NULL, 
    "Endereço-cli" character varying(90) COLLATE pg_catalog."default", 
    "Data-nasc-cli" date NOT NULL, 
    "Sexo-cli" character varying(1) COLLATE pg_catalog."default" NOT NULL, 
    "Cpf-cliente" bigint NOT NULL, 
	CONSTRAINT "PK-Cli" PRIMARY KEY ("Cpf-cliente") 
) 

WITH (OIDS = FALSE) 
TABLESPACE pg_default; 

------------------ TABELA VENDEDOR ------------------

CREATE TABLE public."VENDEDOR" 
( 
    "Nome-vend" character varying(80) COLLATE pg_catalog."default" NOT NULL, 
    "Cpf-vend" bigint NOT NULL, 
    "Tx-comissao" numeric(8, 2) NOT NULL, 
    "Sexo-vend" character varying(1) COLLATE pg_catalog."default" NOT NULL, 
    CONSTRAINT "VENDEDOR_pkey" PRIMARY KEY ("Cpf-vend") 
) 

WITH (OIDS = FALSE) 
TABLESPACE pg_default; 

------------------ PRODUTO ------------------

CREATE TABLE public."PRODUTO" 
( 
    "Cod-produto" integer NOT NULL, 
    "Desc-produto" character varying(80) COLLATE pg_catalog."default" NOT NULL, 
    "Val-produto" numeric(10, 2) NOT NULL, 
    "Unid-medida" text COLLATE pg_catalog."default" NOT NULL, 
    CONSTRAINT "PRODUTO_pkey" PRIMARY KEY ("Cod-produto") 
) 

WITH (OIDS = FALSE) 
TABLESPACE pg_default; 

------------------ PEDIDO ------------------

CREATE TABLE public."PEDIDO" 
( 
    "Num-pedido" integer NOT NULL, 
    "Data-pedido" date NOT NULL, 
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

WITH (OIDS = FALSE) 
TABLESPACE pg_default; 

------------------ ITEM-PEDIDO ------------------

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

WITH (OIDS = FALSE) 
TABLESPACE pg_default; 

------------------ POPULANDO CLIENTES ------------------

INSERT into "CLIENTE" 
VALUES ('Bruno', 'RuaJ-10','30/10/1980', 'M', 3495623);

INSERT into "CLIENTE" 
VALUES ('Lilian', 'RuaJ-10','12/02/1979', 'F', 2435234);

INSERT into "CLIENTE" 
VALUES ('Hendix', 'RuaJ-10','01/11/2004', 'M', 45353423);

INSERT into "CLIENTE" 
VALUES ('Theodora', 'RuaJ-10','01/02/2003', 'F', 435234);

INSERT into "CLIENTE" 
VALUES ('Nilson Nelson', 'RuaJ-10', '01/05/1999', 'F', 3456265);

------------------ POPULANDO VENDEDORES ------------------

INSERT into "VENDEDOR" 
VALUES ('Donald Draper', 848751, 15.0, 'M');

INSERT into "VENDEDOR" 
VALUES ('Peggy Olsen', 4325445, 5.0, 'F');

INSERT into "VENDEDOR" 
VALUES ('Campbell', 2344556, 25.0, 'M');

------------------ POPULANDO PRODUTO ------------------

INSERT into "PRODUTO"
VALUES ('2525', 10, 10.000, 5);

INSERT into "PRODUTO"
VALUES ('2520', 'Mascara Covid-19', 5.50, 5);

INSERT into "PRODUTO"
VALUES ('2530', 'Alcool Gel', 7.5, 'Um');

INSERT into "PRODUTO"
VALUES ('2535', 'Taser anti zumbi', 10, 'Um');

------------------ POPULANDO PEDIDOS ------------------

INSERT into "PEDIDO"
VALUES ('101', '10/04/2020', 'Rua Papel, Setor Virge Maria', '17/04/2020', 4325445, 2435234);

INSERT into "PEDIDO"
VALUES ('102', '11/04/2020', 'Rua Abobrinha, Vila vá com Deus', '18/04/2020', 848751, 3495623);

INSERT into "PEDIDO"
VALUES ('103', '12/04/2020', 'Rua Apocalipse, Setor Chernobil', '19/04/2020', 2344556, 2435234);

------------------ POPULANDO PEDIDOS ------------------

INSERT into "ITEM-PEDIDO"
VALUES ('101', 24234, '2520', 15);

INSERT into "ITEM-PEDIDO"
VALUES ('102', 23456, '2525', 10);

INSERT into "ITEM-PEDIDO"
VALUES ('103', 43534, '2530', 100);

------------------ SELECT DAS TABELAS ------------------

select * from "CLIENTE";
select * from "VENDEDOR";
select * from "PRODUTO";
select * from "PEDIDO";
select * from "ITEM-PEDIDO";

------------------ SELECT DE CLIENTES ------------------

select 'Nome_cli','Cpf-cliente' from "CLIENTE";

select 'Num-ped','Seq-item','cod-prod' from "ITEM-PEDIDO"
where "Qtde-item-ped" = 10;



